package vn.edu.tinhoc123.quizz_da;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inf, ViewGroup c, Bundle b) {
        View v = inf.inflate(R.layout.fragment_home, c, false);

        ganSuKien(v, R.id.btnSoDen10, "Các số đến 10");
        ganSuKien(v, R.id.btnCong10, "Phép cộng phạm vi 10");
        ganSuKien(v, R.id.btnTru10, "Phép trừ phạm vi 10");
        ganSuKien(v, R.id.btnSoDen100, "Các số đến 100");
        ganSuKien(v, R.id.btnCong100, "Phép cộng phạm vi 100");
        ganSuKien(v, R.id.btnTru100, "Phép trừ phạm vi 100");
        ganSuKien(v, R.id.btnOnTapHK1, "Ôn tập học kỳ 1");
        ganSuKien(v, R.id.btnOnTapHK2, "Ôn tập học kỳ 2");

        ImageButton btnTheory = v.findViewById(R.id.btnTheory);
        btnTheory.setOnClickListener(x -> {
            Intent intent = new Intent(getContext(), LtActivity.class);
            startActivity(intent);
        });

        return v;
    }

    private void ganSuKien(View v, int id, String chuDe) {
        Button btn = v.findViewById(id);
        btn.setOnClickListener(x -> moQuiz(chuDe));
    }

    private void moQuiz(String chuDe) {
        QuizFragment qf = new QuizFragment();
        Bundle args = new Bundle();
        args.putString("chuDe", chuDe);
        qf.setArguments(args);
        requireActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, qf)
                .addToBackStack(null)
                .commit();
    }
}
