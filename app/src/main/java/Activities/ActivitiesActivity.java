package Activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Classes.databinding.ActivityActivitiesBinding;

public class ActivitiesActivity extends AppCompatActivity {
    private ActivityActivitiesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityActivitiesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

}

