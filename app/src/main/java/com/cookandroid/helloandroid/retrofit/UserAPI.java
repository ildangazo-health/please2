package com.cookandroid.helloandroid.retrofit;
import com.cookandroid.helloandroid.model.User;
import com.cookandroid.helloandroid.model.UserDTO;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserAPI {
    @GET("/user/get-all")
        // 다 갖고 오기
    Call<List<User>> getAllUsers();

    @POST("/user/save")
        // 저장하기
    Call<User> save(@Body User user);

    @POST("/user/login")
//로그인 하기
    Call<UserDTO> login(@Body UserDTO userDTO);

}
