package com.example.openweathertp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;

public class MainActivity extends AppCompatActivity {
    private TextView textViewPrevisions;
    private String openWeatherUrl = "https://api.openweathermap.org/data/2.5/forecast?q=Annecy&units=metric&lang=fr&APPID=317afbd7d5cc0b49d4a7066f8bf68e2c";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewPrevisions = findViewById(R.id.textViewPrevision);

        openWeatherDatas();
    }
    private void openWeatherDatas() {

        final GsonRequest gsonRequest = new GsonRequest(openWeatherUrl, Previsions.class, null, new Response.Listener<Previsions>() {
            @Override
            public void onResponse(Previsions previsions) {
                String resultat="";

                resultat+=previsions.getCity().toString();

                for (Prevision prev : previsions.getPrevisions()) {
                    resultat+=prev.toString();
                }

                textViewPrevisions.setText(resultat);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        if (volleyError != null) Log.e("MainActivity", volleyError.getMessage());
                    }
                });
        VolleyHelper.getInstance(getApplicationContext()).addToRequestQueue(gsonRequest);
    }
}