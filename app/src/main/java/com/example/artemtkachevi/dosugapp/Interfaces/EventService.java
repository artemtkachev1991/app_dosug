package com.example.artemtkachevi.dosugapp.Interfaces;

import com.example.artemtkachevi.dosugapp.Events.Event;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface EventService {

    @GET("/getEventByWord/{word}")
    Call<Event> getEventByWord(@Path("word") String word);


    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.1.4:8086")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
