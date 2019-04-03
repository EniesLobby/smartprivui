package com.thetehnocafe.gurleensethi.retrofitexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * The code where actual api call is performed
 * Functions are from retrofit library.
 * getResponse() function takes as parameters that are specified in JSONPlaceHolderApi file
 *
 * In this example app is com.whatsapp and version is 76543
 *
 * The response contained in the response.body() and should be retrieved using getters of the class
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        NetworkService.getInstance()
                .getJSONApi()
                .getResponse("com.whatsapp", "76543")
                .enqueue(new Callback<ApiResponse>() {
                    @Override
                    public void onResponse(@NonNull Call<ApiResponse> call, @NonNull Response<ApiResponse> response) {
                        ApiResponse res = response.body();

                        textView.append("\n" + res.getCode() + "\n");
                        textView.append(res.getFlows().get(0).getSanitizer() + "\n");
                        textView.append(res.getFlows().get(0).getSink() + "\n");
                        textView.append(res.getFlows().get(0).getSource() + "\n");
                    }

                    @Override
                    public void onFailure(@NonNull Call<ApiResponse> call, @NonNull Throwable t) {

                        textView.append("Error occurred while getting request!");
                        t.printStackTrace();
                    }
                });
    }
}
