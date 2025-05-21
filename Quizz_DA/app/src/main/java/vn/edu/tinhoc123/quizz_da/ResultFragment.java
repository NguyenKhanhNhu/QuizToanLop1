package vn.edu.tinhoc123.quizz_da;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.List;

public class ResultFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_result, container, false);

        // Ánh xạ view
        TextView tvDiem = v.findViewById(R.id.tvDiem);
        TextView tvScore = v.findViewById(R.id.tvScore);
        ImageButton btnHome = v.findViewById(R.id.btnHome);

        // Ánh xạ 10 cặp TextView
        TextView[] tvQuestions = new TextView[]{
                v.findViewById(R.id.tvQuestion1),
                v.findViewById(R.id.tvQuestion2),
                v.findViewById(R.id.tvQuestion3),
                v.findViewById(R.id.tvQuestion4),
                v.findViewById(R.id.tvQuestion5),
                v.findViewById(R.id.tvQuestion6),
                v.findViewById(R.id.tvQuestion7),
                v.findViewById(R.id.tvQuestion8),
                v.findViewById(R.id.tvQuestion9),
                v.findViewById(R.id.tvQuestion10)
        };

        TextView[] tvCorrects = new TextView[]{
                v.findViewById(R.id.tvCorrect1),
                v.findViewById(R.id.tvCorrect2),
                v.findViewById(R.id.tvCorrect3),
                v.findViewById(R.id.tvCorrect4),
                v.findViewById(R.id.tvCorrect5),
                v.findViewById(R.id.tvCorrect6),
                v.findViewById(R.id.tvCorrect7),
                v.findViewById(R.id.tvCorrect8),
                v.findViewById(R.id.tvCorrect9),
                v.findViewById(R.id.tvCorrect10)
        };

        // Nhận dữ liệu từ bundle
        Bundle bundle = getArguments();
        int correct = bundle.getInt("correct");
        int total = bundle.getInt("total");
        List<String> details = bundle.getStringArrayList("details");

        tvDiem.setText(String.valueOf(correct));
        tvScore.setText("Bé đúng " + correct + "/" + total);

        // Hiển thị chi tiết đáp án
        if (details != null && !details.isEmpty()) {
            for (int i = 0; i < Math.min(details.size(), 10); i++) {
                String detail = details.get(i);
                // Tách nội dung detail thành các phần
                String[] parts = detail.split("\n");
                String questionAndUserAns = parts[0] + "\n" + parts[2]; //CHoi và đ.án của ng dùng
                String correctAns = parts[1]; // Đ.án đúng

                // Gán nội dung và hiển thị TextView
                tvQuestions[i].setText(questionAndUserAns);
                tvQuestions[i].setVisibility(View.VISIBLE);
                tvCorrects[i].setText(correctAns);
                tvCorrects[i].setVisibility(View.VISIBLE);
            }
        }

        // Nút về màn hình chính
        btnHome.setOnClickListener(view -> {
            getParentFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new HomeFragment())
                    .commit();
        });

        return v;
    }
}