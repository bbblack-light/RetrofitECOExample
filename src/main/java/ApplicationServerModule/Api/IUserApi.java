package ApplicationServerModule.Api;

import models.LoginRequest;
import models.LoginResponse;
import models.OperationResponse;
import models.User;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;


public interface IUserApi {
    @Headers("Accept: application/json")
    @GET("user/all")
    Call<List<User>> listUsers();

    @Headers("Accept: application/json")
    @POST("user/registration")
    Call<OperationResponse> registration(@Body User user);

    @Headers("Accept: application/json")
    @GET("user/")
    Call<User> getUserInfoByToken(@Header("Authorization") String token);


    @Headers("Accept: application/json")
    @POST("session")
    Call<LoginResponse> login(@Body LoginRequest login);
}
