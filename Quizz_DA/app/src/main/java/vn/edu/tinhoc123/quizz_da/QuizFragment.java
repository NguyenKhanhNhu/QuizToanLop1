package vn.edu.tinhoc123.quizz_da;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class QuizFragment extends Fragment {
    TextView tvQuestion, tvA, tvB, tvC, tvD;
    Button btnPrev, btnNext, btnSubmit;
    LinearLayout layoutA, layoutB, layoutC, layoutD;

    List<CauHoi> list;
    String[] userAns;
    int idx = 0;

    public QuizFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_quiz, container, false);

        tvQuestion = v.findViewById(R.id.tvQuestion);
        tvA = v.findViewById(R.id.tvA);
        tvB = v.findViewById(R.id.tvB);
        tvC = v.findViewById(R.id.tvC);
        tvD = v.findViewById(R.id.tvD);

        btnPrev = v.findViewById(R.id.btnPrev);
        btnNext = v.findViewById(R.id.btnNext);
        btnSubmit = v.findViewById(R.id.btnSubmit);

        layoutA = v.findViewById(R.id.layoutA);
        layoutB = v.findViewById(R.id.layoutB);
        layoutC = v.findViewById(R.id.layoutC);
        layoutD = v.findViewById(R.id.layoutD);

        // Lấy chủ đề từ Bundle
        String chuDe = "Các số đến 10"; // Giá trị mặc định
        if (getArguments() != null) {
            chuDe = getArguments().getString("chuDe", "Các số đến 10");
        }

        // Sử dụng DBHelper để lấy câu hỏi theo chủ đề
        DBHelper dbHelper = new DBHelper(getContext());
        list = dbHelper.getCauHoiTheoChuDe(chuDe); // Sử dụng chủ đề động

        if (list.size() == 0) {
            Toast.makeText(getContext(), "Chưa có câu hỏi cho chủ đề " + chuDe, Toast.LENGTH_SHORT).show();
            return v;
        }

        userAns = new String[list.size()];
        loadQ(idx);

        layoutA.setOnClickListener(view -> selectAnswer("A"));
        layoutB.setOnClickListener(view -> selectAnswer("B"));
        layoutC.setOnClickListener(view -> selectAnswer("C"));
        layoutD.setOnClickListener(view -> selectAnswer("D"));

        btnPrev.setOnClickListener(view -> {
            if (idx > 0) {
                idx--;
                loadQ(idx);
            }
        });

        btnNext.setOnClickListener(view -> {
            if (idx < list.size() - 1) {
                idx++;
                loadQ(idx);
            }
        });

        btnSubmit.setOnClickListener(view -> submitQuiz());

        return v;
    }

    private void loadQ(int i) {
        CauHoi q = list.get(i);
        tvQuestion.setText("Câu " + (i + 1) + ": " + q.noiDung);
        tvA.setText(q.dapAnA);
        tvB.setText(q.dapAnB);
        tvC.setText(q.dapAnC);
        tvD.setText(q.dapAnD);

        // reset màu tất cả
        layoutA.setBackgroundResource(R.drawable.answer_option_bg);
        layoutB.setBackgroundResource(R.drawable.answer_option_bg);
        layoutC.setBackgroundResource(R.drawable.answer_option_bg);
        layoutD.setBackgroundResource(R.drawable.answer_option_bg);

        // check đáp án đã chọn nếu có
        String ua = userAns[i];
        if (ua == null) return;
        switch (ua) {
            case "A": layoutA.setBackgroundResource(R.drawable.answer_option_selected_bg); break;
            case "B": layoutB.setBackgroundResource(R.drawable.answer_option_selected_bg); break;
            case "C": layoutC.setBackgroundResource(R.drawable.answer_option_selected_bg); break;
            case "D": layoutD.setBackgroundResource(R.drawable.answer_option_selected_bg); break;
        }
    }

    private void selectAnswer(String ans) {
        // reset tất cả về mặc định
        layoutA.setBackgroundResource(R.drawable.answer_option_bg);
        layoutB.setBackgroundResource(R.drawable.answer_option_bg);
        layoutC.setBackgroundResource(R.drawable.answer_option_bg);
        layoutD.setBackgroundResource(R.drawable.answer_option_bg);

        // set màu đáp án được chọn
        switch (ans) {
            case "A": layoutA.setBackgroundResource(R.drawable.answer_option_selected_bg); break;
            case "B": layoutB.setBackgroundResource(R.drawable.answer_option_selected_bg); break;
            case "C": layoutC.setBackgroundResource(R.drawable.answer_option_selected_bg); break;
            case "D": layoutD.setBackgroundResource(R.drawable.answer_option_selected_bg); break;
        }

        // lưu đáp án người dùng chọn
        userAns[idx] = ans;
    }

    private void submitQuiz() {
        int correct = 0;
        ArrayList<String> details = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            CauHoi q = list.get(i);
            String ua = userAns[i] == null ? "" : userAns[i];
            String trueTxt = getTextByLetter(q, q.dapAnDung);
            String yourTxt = ua.isEmpty() ? "(chưa chọn)" : getTextByLetter(q, ua);
            details.add(
                    "Câu " + (i + 1) + ": " + q.noiDung +
                            "\n→ Đáp án: " + q.dapAnDung + ". " + trueTxt +
                            "\n→ Bé chọn: " + (ua.isEmpty() ? "-" : ua + ". " + yourTxt)
            );
            if (ua.equals(q.dapAnDung)) {
                correct++;
            }
        }

        // chuyển sang ResultFragment
        ResultFragment rf = new ResultFragment();
        Bundle ag = new Bundle();
        ag.putInt("correct", correct);
        ag.putInt("total", list.size());
        ag.putStringArrayList("details", details);
        rf.setArguments(ag);
        getParentFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, rf)
                .commit();
    }

    private String getTextByLetter(CauHoi q, String let) {
        switch (let) {
            case "A": return q.dapAnA;
            case "B": return q.dapAnB;
            case "C": return q.dapAnC;
            case "D": return q.dapAnD;
            default: return "";
        }
    }
}