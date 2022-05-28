package ApplicationServerModule;

import ApplicationServerModule.Api.IUserApi;
import retrofit2.Retrofit;

public class ServerConfiguration {
    public static String token;
    public static Retrofit retrofit;
    public static IUserApi userApi;


    public static void init(Retrofit retrofit) {
        retrofit = retrofit;
        userApi = retrofit.create(IUserApi.class);
    }
}
