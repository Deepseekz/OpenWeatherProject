package Activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.openweathertp.databinding.ActivityDressingBinding;

public class DressingActivity extends AppCompatActivity {
    private ActivityDressingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDressingBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

}

