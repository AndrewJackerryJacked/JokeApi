package com.example.jokeapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JokeService {

    String BASE_URL = "https://sv443.net/jokeapi/categories/";

  @GET("{category}")
    Call<Joke> getRandomJokeByCategory (@Path("category") String category);
}