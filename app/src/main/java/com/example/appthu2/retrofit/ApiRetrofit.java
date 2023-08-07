package com.example.appthu2.retrofit;

import com.example.appthu2.object;
import com.example.assignment.models.ImageNasa;
import com.example.assignment.models.Status;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiRetrofit {

    //Sử dụng Retrofit trỏ api Server
    ApiRetrofit apiRetrofit = new Retrofit.Builder()
            .baseUrl("https://64be24282320b36433c81ca6.mockapi.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiRetrofit.class);

    //Sử dung phương thức GET để lấy dữ liệu
    @GET("/Demo")
    Call<objec> get();

    //Sử dung phương thức Post để đẩy dữ liệu
    @POST("/Demo")
    Call<objec> post();

    //Sử dung phương thức PUT để sửa dữ liệu
    @PUT("/Demo")
    Call<objec> update();

    //Sử dung phương thức DELETE để xóa dữ liệu
    @DELETE("/Demo")
    Call<objec> delete();

}
