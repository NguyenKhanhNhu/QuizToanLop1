package vn.edu.tinhoc123.quizz_da;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.Arrays;
import java.util.List;

public class LtActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lt);

        viewPager = findViewById(R.id.viewPagerTheory);
        btnBack = findViewById(R.id.btnBack);

        List<Integer> images = Arrays.asList(
                R.drawable.lt01,
                R.drawable.lt02,
                R.drawable.lt03,
                R.drawable.lt04,
                R.drawable.lt05,
                R.drawable.lt06
        );

        viewPager.setAdapter(new ImageAdapter(images));

        btnBack.setOnClickListener(v -> finish());
    }
}