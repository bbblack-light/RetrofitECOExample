import ApplicationServerModule.ServerConfiguration;
import models.LoginRequest;
import models.LoginResponse;
import models.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class MainApplication {


    public static void main(String[] args) {
        ServerConfiguration.init(new Retrofit.Builder()
                                .baseUrl("http://192.168.1.70:9191/")
//                                .baseUrl("https://ecobackend.herokuapp.com/")
                                .addConverterFactory(GsonConverterFactory.create())
                                .build());
        getAllUsersExample();
    }

    public static void getAllUsersExample() {
        System.out.println("LOADING all users");
        ServerConfiguration.userApi.listUsers().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                System.out.println("CALLBACK all users");
                if (response.body()!=null) {
                    response.body().forEach((a) -> {
                        System.out.println(a.getUserId());
                    });
                }
                loginExample();
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                System.out.println("FAILED all users");
            }
        });
    }

    public static void loginExample() {
        System.out.println("LOADING login request");
        LoginRequest login = new LoginRequest();
        login.setPassword("1234");
        login.setUsername("admin");
        ServerConfiguration.userApi.login(login).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                System.out.println("CALLBACK login request");
                if (response.body()!=null) {
                    System.out.println(response.body().item.token);

                    //save this token and use in userApi.getUserInfoByToken
                    ServerConfiguration.token = response.body().item.token;
                    getUserByToken();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                System.out.println("FAILED login request");
            }
        });
    }

    public static void getUserByToken() {
        System.out.println("LOADING get user by token");
        ServerConfiguration.userApi.getUserInfoByToken(ServerConfiguration.token).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                System.out.println("CALLBACK get user by token");
                if (response.body()!=null) {
                    System.out.println(response.body().getUserId());
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                System.out.println("FAILED get user by token");
            }
        });
    }
}
