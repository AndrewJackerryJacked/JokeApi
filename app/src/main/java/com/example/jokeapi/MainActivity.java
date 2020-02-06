package com.example.jokeapi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.muiscvideoapi.R;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    /*
     * 1. So you found API...how is the data sent to us?
     *     a. What kind of model classes will we need to match the JSON?
     *     b. make sure the model variables match the json keys
     *     c. make sure you have an empty constructor with no params
     *
     * 2. Make sure that your manifest has the right permissions
     *    for internet access
     *
     * 3. Set up retrofit
     *     a. add the retrofit2 library to the project
     *     b. add the gson (google) and converter-gson (retrofit2) libraries to the project
     *     c. create the interface to match our api
     *     d. in the activity create the retrofit object & service object
     */
    private TextView joke;
    private Button programmingJoke;
    private Button politicalJoke;
    private Button darkJoke;
    private Button anyJoke;
    private Button miscellaneousJoke;
    private JokeService jokeService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JokeService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        wireWidgets();
        setListeners();
        jokeService = retrofit.create(JokeService.class);
    }
    private void wireWidgets() {
        joke = findViewById(R.id.textView_main_joke);
        programmingJoke = findViewById(R.id.button_main_programming);
        darkJoke = findViewById(R.id.button_main_dark);
        politicalJoke = findViewById(R.id.button_main_political);
        anyJoke = findViewById(R.id.button_main_any);
        miscellaneousJoke = findViewById(R.id.button_main_miscellaneous);
    }


    private void setListeners() {
        programmingJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Joke> joke = jokeService.getRandomJokeByCategory("programming");
                joke.enqueue( new Callback<Joke>() {
                    @Override
                    public void onResponse(Call<Joke> call, Response<Joke> response) {
                        final Joke myResponse = response.body();
                        Toast.makeText(getApplicationContext(), "Inside on Response", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Joke> call, Throwable t) {

                    }
                } );
            }
        });

        darkJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Joke> joke = jokeService.getRandomJokeByCategory("dark");
                joke.enqueue( new Callback<Joke>() {
                    @Override
                    public void onResponse(Call<Joke> call, Response<Joke> response) {
                        final Joke myResponse = response.body();
                        Toast.makeText(getApplicationContext(), "Inside on Response", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Joke> call, Throwable t) {

                    }
                } );
            }
        });

        politicalJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Joke> joke = jokeService.getRandomJokeByCategory("political");
                joke.enqueue( new Callback<Joke>() {
                    @Override
                    public void onResponse(Call<Joke> call, Response<Joke> response) {
                        final Joke myResponse = response.body();
                        Toast.makeText(getApplicationContext(), "Inside on Response", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Joke> call, Throwable t) {

                    }
                } );
            }
        });

        anyJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Joke> joke = jokeService.getRandomJokeByCategory("any");
                joke.enqueue( new Callback<Joke>() {
                    @Override
                    public void onResponse(Call<Joke> call, Response<Joke> response) {
                        final Joke myResponse = response.body();
                        Toast.makeText(getApplicationContext(), "Inside on Response", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Joke> call, Throwable t) {

                    }
                } );
            }
        });

        miscellaneousJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<Joke> joke = jokeService.getRandomJokeByCategory("miscellaneous");
                joke.enqueue( new Callback<Joke>() {
                    @Override
                    public void onResponse(Call<Joke> call, Response<Joke> response) {
                        final Joke myResponse = response.body();
                        Toast.makeText(getApplicationContext(), "Inside on Response", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Joke> call, Throwable t) {

                    }
                } );
            }
        });
    }

}

