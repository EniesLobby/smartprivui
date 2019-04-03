package com.thetehnocafe.gurleensethi.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * This is a list of API calls to the backend
 * The relevant only @GET("nodes/smartpriv/")
 * The others are part of the tutorial and should not be considered
 */

public interface JSONPlaceHolderApi {

    @GET("/posts/{id}")
    public Call<Post> getPostWithID(@Path("id") int id);

    /**
     * @param app application name. For example com.whatsapp
     * @param versioncode version of the application as a string
     * @return returns ApiResponse class object
     */
    @GET("nodes/smartpriv/")
    public Call<ApiResponse> getResponse(@Query("app") String app,
                                    @Query("versioncode") String versioncode);

    @GET("/posts")
    public Call<List<Post>> getAllPosts();

    @GET("/posts")
    public Call<List<Post>> getPostOfUser(@Query("userId") int id);

    @POST("/posts")
    public Call<Post> postData(@Body Post data);
}
