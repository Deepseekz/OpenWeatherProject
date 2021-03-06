package Activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.Classes.databinding.ActivityMainBinding;

import java.util.ArrayList;

import Adapters.RecyclerViewAdapter;
import Models.Forecast;
import Models.Forecasts;
import Models.GsonRequest;
import Models.VolleyHelper;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ArrayList<Forecast> list = new ArrayList<>();
    private String openWeatherUrl = "https://api.openweathermap.org/data/2.5/forecast?q=Annecy,FR&units=metric&lang=fr&appid=317afbd7d5cc0b49d4a7066f8bf68e2c";
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        initializeOpenWeatherData();
        initializeUI();
        setContentView(view);
    }

    private void initializeUI() {
        binding.recyclerViewMeteo.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.recyclerViewMeteo.setLayoutManager(layoutManager);
        binding.recyclerViewMeteo.setFocusable(false);

        adapter = new RecyclerViewAdapter(list);
        binding.recyclerViewMeteo.setAdapter(adapter);
    }

    private void initializeOpenWeatherData() {
        final GsonRequest gsonRequest = new GsonRequest(openWeatherUrl, Forecasts.class, null, new Response.Listener<Forecasts>() {
            @Override
            public void onResponse(Forecasts forecasts) {
                String result = "";
                for (Forecast forecast : forecasts.getList()) {
                    list.add(forecast);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                if (volleyError != null) Log.e("MainActivity", volleyError.getMessage());
            }
        });

        VolleyHelper.getInstance(getApplicationContext()).addToRequestQueue(gsonRequest);
    }
}