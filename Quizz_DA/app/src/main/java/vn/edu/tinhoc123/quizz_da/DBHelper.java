package vn.edu.tinhoc123.quizz_da;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "QuizDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE CauHoi (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "noiDung TEXT," +
                        "dapAnA TEXT," +
                        "dapAnB TEXT," +
                        "dapAnC TEXT," +
                        "dapAnD TEXT," +
                        "dapAnDung TEXT," +
                        "chuDe TEXT" +
                        ")"
        );
        insertSample(db);
    }

    private void insertSample(SQLiteDatabase db) {
        //Các số đến 10
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Sắp xếp các số trong dãy số sau 5, 8, 7, 1 theo thứ tự từ lớn đến bé.'," +
                "'1, 5, 7, 8'," +
                "'8, 7, 5, 1'," +
                "'7, 8, 5, 1'," +
                "'1, 7, 8, 5'," +
                "'B'," +
                "'Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Điền số thích hợp vào chỗ ? trong các phép so sánh: 2 > ? > 0'," +
                "'3','4','1','6','C','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Điền số thích hợp vào chỗ ? trong các phép so sánh: 9 > ? > 7'," +
                "'8','6','5','0','A','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Sắp xếp các số trong dãy số sau 5, 8, 7, 1 theo thứ tự từ bé đến lớn.'," +
                "'1, 5, 7, 8','8, 7, 5, 1','1, 7, 5, 8','5, 1, 8, 7','A','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Sắp xếp các số sau 9, 3, 6, 8, 2, 7 theo thứ tự từ lớn đến bé.'," +
                "'9, 8, 7, 6, 3, 2','9, 7, 6, 8, 3, 2','9, 8, 6, 7, 3, 2','8, 7, 6, 3, 9, 2','A','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Điền số thích hợp vào chỗ ? trong các phép so sánh: 4 > ? > 2'," +
                "'3','5','6','0','A','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Điền số thích hợp vào chỗ ? trong các phép so sánh: 3 > ? > 1'," +
                "'2','4','5','0','A','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Sắp xếp các số trong dãy số sau 5, 8, 7, 1 theo thứ tự từ lớn đến bé.'," +
                "'1, 5, 7, 8','8, 7, 5, 1','7, 8, 5, 1','1, 7, 8, 5','B','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số nhỏ nhất trong dãy số 5, 8, 7, 1 là số nào?'," +
                "'1','5','7','8','A','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số lớn nhất trong dãy số 5, 8, 7, 1 là số nào?'," +
                "'1','5','7','8','D','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Điền số thích hợp vào chỗ ? trong các phép so sánh: 3 > ? > 1'," +
                "'3','2','1','6','B','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số nhỏ nhất trong dãy số 9, 3, 6, 8, 2, 7 là số nào?'," +
                "'9','2','3','6','B','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số lớn nhất trong dãy số 9, 3, 6, 8, 2, 7 là số nào?'," +
                "'3','2','6','9','D','Các số đến 10')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'7 ... 5 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','B','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'3 ... 8 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','A','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'6 ... 6 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','C','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'2 ... 9 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','A','Các số đến 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'10 ... 1 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','B','Các số đến 10')");


// Phép cộng phạm vi 10
        // Dạng a + b = ?
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                        "'4 + 5 = ?'," +
                        "'8','9','10','7','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'1 + 6 = ?'," +
                "'6','7','8','5','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'3 + 4 = ?'," +
                "'6','7','8','5','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'7 + 2 = ?'," +
                "'8','9','10','6','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'5 + 1 = ?'," +
                "'5','6','7','4','B','Phép cộng phạm vi 10')");

        // Dạng a + ? = c
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'2 + ? = 7'," +
                "'4','5','6','3','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'3 + ? = 9'," +
                "'5','6','7','4','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'1 + ? = 5'," +
                "'3','4','5','2','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'6 + ? = 10'," +
                "'3','4','5','2','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'4 + ? = 8'," +
                "'3','4','5','2','B','Phép cộng phạm vi 10')");

        // Dạng toán có lời
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Bạn Lan có 3 quả cam, được mẹ cho thêm 2 quả. Hỏi bạn Lan có bao nhiêu quả cam?'," +
                "'4','5','6','3','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Anh Minh có 1 chiếc bút, nhặt được thêm 4 chiếc. Hỏi anh Minh có bao nhiêu chiếc bút?'," +
                "'4','5','6','3','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Em Hoa có 2 con cá, mua thêm 3 con. Hỏi em Hoa có bao nhiêu con cá?'," +
                "'4','5','6','3','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Bạn Nam có 5 viên bi, được bạn tặng thêm 2 viên. Hỏi bạn Nam có bao nhiêu viên bi?'," +
                "'6','7','8','5','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Chị Hà có 1 quyển sách, mượn thêm 6 quyển. Hỏi chị Hà có bao nhiêu quyển sách?'," +
                "'6','7','8','5','C','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Bạn Mai có 4 quả táo, được cho thêm 3 quả. Hỏi bạn Mai có bao nhiêu quả táo?'," +
                "'6','7','8','5','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Em Long có 2 chiếc ô tô đồ chơi, được tặng thêm 5 chiếc. Hỏi em Long có bao nhiêu chiếc ô tô?'," +
                "'6','7','8','5','C','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Bạn Hùng có 3 con mèo, nhận thêm 4 con. Hỏi bạn Hùng có bao nhiêu con mèo?'," +
                "'6','7','8','5','B','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Chị Linh có 1 hộp bút chì, mua thêm 6 hộp. Hỏi chị Linh có bao nhiêu hộp bút chì?'," +
                "'6','7','8','5','C','Phép cộng phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Em An có 2 quả bóng, được tặng thêm 4 quả. Hỏi em An có bao nhiêu quả bóng?'," +
                "'5','6','7','4','B','Phép cộng phạm vi 10')");

        // Phép trừ phạm vi 10
// Dạng a - b = ?
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'8 - 3 = ?','4','5','6','7','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'6 - 2 = ?','3','4','5','6','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'10 - 4 = ?','5','6','7','4','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'7 - 1 = ?','5','6','7','4','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'9 - 6 = ?','2','3','4','5','B','Phép trừ phạm vi 10')");

// Dạng a - ? = c
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'10 - ? = 6','3','4','5','2','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'7 - ? = 3','3','4','5','2','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'9 - ? = 5','3','4','5','2','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'8 - ? = 4','3','4','5','2','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'6 - ? = 2','3','4','5','8','B','Phép trừ phạm vi 10')");

// Dạng toán có lời
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Bạn Cường có 5 quả táo, cho bạn Duyên 2 quả. Hỏi bạn Cường còn bao nhiêu quả táo?','2','3','4','5','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Anh Minh có 7 chiếc bút, cho em 3 chiếc. Hỏi anh Minh còn bao nhiêu chiếc bút?','3','4','5','6','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Em Hoa có 9 con cá, bán đi 4 con. Hỏi em Hoa còn bao nhiêu con cá?','4','5','6','3','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Bạn Nam có 8 viên bi, mất 3 viên. Hỏi bạn Nam còn bao nhiêu viên bi?','4','5','6','3','B','Phép trừ phạm vi 10')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Chị Hà có 10 quyển sách, cho bạn 6 quyển. Hỏi chị Hà còn bao nhiêu quyển sách?','3','4','5','6','B','Phép trừ phạm vi 10')");
        //các số đến 100
        //dang < > =
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'42 ... 38 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','B','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'19 ... 25 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','A','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'77 ... 77 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','C','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'63 ... 59 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','B','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'88 ... 92 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','A','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'31 ... 28 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','B','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'54 ... 54 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','C','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'95 ... 98 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','A','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'12 ... 21 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','A','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'66 ... 62 (Chọn dấu >, <, hoặc =)','<','>','=','Không rõ','B','Các số đến 100')");


// Dạng toán có lời (đa dạng tình huống)
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Bạn An có 45 quả táo, bạn Bình có 38 quả táo. Ai có nhiều quả táo hơn?','An','Bình','Cả hai bằng nhau','Không rõ','A','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Lan có 60 quyển sách, Minh có 65 quyển sách. Ai có ít sách hơn?','Lan','Minh','Cả hai bằng nhau','Không rõ','A','Các số đến 100')");

        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Nam có 72 viên bi, Hùng có 68 viên bi, Linh có 75 viên bi. Ai có nhiều viên bi nhất?','Nam','Hùng','Linh','Không rõ','C','Các số đến 100')");

// Phép cộng phạm vi 100
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'23 + 5 = ?','28','26','27','29','A','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'41 + 8 = ?','47','49','50','48','B','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'56 + 7 = ?','62','64','63','65','C','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'34 + 9 = ?','44','42','45','43','D','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'67 + 6 = ?','73','72','74','75','A','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'45 + 12 = ?','56','57','58','59','B','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'28 + 34 = ?','63','61','62','64','C','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'53 + 26 = ?','78','79','80','77','B','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'19 + 42 = ?','62','60','63','61','D','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'36 + 47 = ?','83','82','84','85','A','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'64 + 15 = ?','80','78','79','81','C','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'27 + 33 = ?','59','60','61','62','B','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'48 + 21 = ?','70','68','71','69','D','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'55 + 14 = ?','69','68','70','71','A','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'32 + 46 = ?','77','79','78','80','C','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Bạn Mai gấp được 25 chiếc thuyền giấy. Em Mi gấp được 3 chiếc thuyền giấy. Hỏi cả hai chị em gấp được bao nhiêu chiếc thuyền giấy?','27','29','26','28','D','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Trên cây có 15 con chim. Lát sau có thêm 24 con chim bay đến đậu cùng. Hỏi lúc này trên cây có tất cả bao nhiêu con chim?','39','38','40','37','A','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Lan hái được 42 quả táo. Minh hái được 17 quả táo. Hỏi cả hai bạn hái được bao nhiêu quả táo?','58','59','60','57','B','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Một cửa hàng có 36 chiếc bút. Sau đó nhập thêm 23 chiếc bút nữa. Hỏi cửa hàng có tất cả bao nhiêu chiếc bút?','60','58','59','57','C','Phép cộng phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Hùng có 51 viên bi. Nam cho Hùng thêm 28 viên bi. Hỏi Hùng có tất cả bao nhiêu viên bi?','78','79','80','77','B','Phép cộng phạm vi 100')");

// Phép trừ phạm vi 100
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'45 - 8 = ?','37','36','38','39','A','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'63 - 7 = ?','55','56','57','58','B','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'29 - 6 = ?','24','22','23','25','C','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'81 - 9 = ?','71','73','74','72','D','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'54 - 5 = ?','49','48','50','51','A','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'76 - 12 = ?','65','63','64','66','C','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'88 - 34 = ?','54','53','55','56','A','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'67 - 25 = ?','43','42','44','41','B','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'95 - 47 = ?','49','47','48','50','C','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'52 - 19 = ?','34','32','33','35','C','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'71 - 28 = ?','42','43','44','45','B','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'84 - 36 = ?','48','47','49','50','A','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'66 - 13 = ?','52','54','53','55','C','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'93 - 45 = ?','48','47','49','50','A','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'58 - 27 = ?','32','30','31','33','C','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Một cửa hàng có 65 chiếc bút. Sau đó bán đi 18 chiếc bút. Hỏi cửa hàng còn lại bao nhiêu chiếc bút?','46','47','48','49','B','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Trên cây có 52 con chim. Lát sau có 19 con chim bay đi. Hỏi trên cây còn lại bao nhiêu con chim?','33','34','32','35','A','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Mai có 78 viên kẹo. Mai cho Lan 25 viên kẹo. Hỏi Mai còn lại bao nhiêu viên kẹo?','54','53','55','52','C','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Hùng có 91 quả bóng. Hùng làm mất 34 quả bóng. Hỏi Hùng còn lại bao nhiêu quả bóng?','58','56','57','59','C','Phép trừ phạm vi 100')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Một thùng có 85 lít nước. Sau đó lấy đi 47 lít nước. Hỏi thùng còn lại bao nhiêu lít nước?','39','37','38','40','C','Phép trừ phạm vi 100')");

        //Ôn thi hk1
        // Ôn tập học kỳ 1
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số bé nhất trong các số 7, 2, 9, 4, 6 là số nào?','4','2','6','7','B','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số lớn nhất trong các số 3, 8, 5, 1, 9 là số nào?','9','8','5','3','A','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'6 + 3 = ?','7','8','9','10','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'8 - 2 = ?','4','5','7','6','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'? + 4 = 7','4','3','2','5','B','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'? - 3 = 5','6','7','8','9','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'5 + ? = 9','5','4','3','2','B','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'7 - ? = 4','5','4','3','2','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'4 - 2 + 3 = ?','6','3','4','5','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'2 + 3 + 4 = ?','10','7','8','9','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'6 + 2 - 1 = ?','9','8','7','6','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 5 ... 7','=','<','>','Không rõ','B','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 9 ... 9','<','>','=','Không rõ','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 3 ... 1','>','<','=','Không rõ','A','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Mai có 6 quả táo, Lan có 3 quả táo. Hỏi cả hai bạn có bao nhiêu quả táo?','10','7','8','9','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Hùng có 8 viên bi, cho Nam 2 viên. Hỏi Hùng còn lại bao nhiêu viên bi?','7','4','5','6','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Một cửa hàng có 7 chiếc bút, bán đi 3 chiếc. Hỏi cửa hàng còn bao nhiêu chiếc bút?','5','6','4','3','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Trên cây có 5 con chim, thêm 4 con bay đến. Hỏi trên cây có bao nhiêu con chim?','7','8','9','10','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Nam có 9 quả bóng, làm mất 3 quả. Hỏi Nam còn lại bao nhiêu quả bóng?','8','7','6','5','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'3 + 2 + 1 = ?','4','7','5','6','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'7 - 4 + 2 = ?','6','3','4','5','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'5 + 3 - 2 = ?','8','7','6','5','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'? + 2 = 8','7','4','5','6','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'9 - ? = 6','4','5','3','2','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'4 + ? = 7','5','4','3','2','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'? - 2 = 4','8','7','6','5','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số lớn nhất trong các số 2, 6, 4, 8, 3 là số nào?','4','2','6','8','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số bé nhất trong các số 9, 5, 7, 3, 1 là số nào?','7','5','3','1','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 8 ... 6','<','>','=','Không rõ','B','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 4 ... 4','>','<','=','Không rõ','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Mai gấp được 4 chiếc thuyền giấy, Nam gấp được 2 chiếc. Hỏi cả hai gấp được bao nhiêu chiếc thuyền giấy?','8','7','6','5','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Lan có 7 viên kẹo, cho Minh 3 viên. Hỏi Lan còn lại bao nhiêu viên kẹo?','5','6','3','4','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Một giỏ có 8 quả táo, lấy đi 3 quả. Hỏi trong giỏ còn bao nhiêu quả táo?','6','7','5','4','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Hùng có 6 quả bóng, Nam cho thêm 3 quả. Hỏi Hùng có bao nhiêu quả bóng?','10','7','8','9','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'4 + 2 - 1 = ?','7','6','5','4','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'3 + 3 + 2 = ?','6','7','8','5','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'6 - 2 + 1 = ?','6','7','4','5','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'? + 3 = 9','7','8','5','6','D','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'8 - ? = 5','4','5','3','2','C','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'2 + 4 = ?','5','6','7','8','B','Ôn tập học kỳ 1')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'9 - 5 = ?','3','4','5','6','B','Ôn tập học kỳ 1')");

        //Ôn thi hk2
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số “Ba mươi hai” được viết là số nào?','32','23','30','33','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Sắp xếp các số 45, 23, 67, 12 từ bé đến lớn:','12, 23, 45, 67','23, 12, 45, 67','12, 45, 23, 67','67, 45, 23, 12','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Sắp xếp các số 19, 83, 56, 34 từ lớn đến bé:','83, 56, 34, 19','56, 83, 34, 19','19, 34, 56, 83','83, 34, 56, 19','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Từ 11 đến 34 có bao nhiêu số tròn chục?','2 số','3 số','4 số','5 số','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Hôm nay là ngày 14 tháng 4. Vậy 4 ngày nữa là ngày nào?','17 tháng 4','18 tháng 4','19 tháng 4','20 tháng 4','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'56 + 23 = ?','78','79','80','81','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'67 - 19 = ?','47','48','49','50','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'34 + 25 + 13 = ?','70','71','72','73','C','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'45 - 12 + 8 = ?','39','40','41','42','C','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Viết số còn thiếu vào chỗ chấm: 56, …, …, 59, 60','57, 58','56, 57','58, 59','57, 59','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số 49 có số liền trước là số …, có số liền sau là số …','48, 50','47, 49','49, 51','48, 49','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Mai có 42 viên kẹo, Lan có 27 viên kẹo. Hỏi cả hai bạn có bao nhiêu viên kẹo?','68','69','70','71','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Một cửa hàng có 65 chiếc bút, bán đi 18 chiếc. Hỏi cửa hàng còn bao nhiêu chiếc bút?','46','47','48','49','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 56 … 78','>','<','=','Không rõ','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 45 … 45','>','<','=','Không rõ','C','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số “Năm mươi sáu” được viết là số nào?','65','56','50','55','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Sắp xếp các số 72, 19, 45, 88 từ bé đến lớn:','19, 45, 72, 88','45, 19, 72, 88','19, 72, 45, 88','88, 72, 45, 19','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Sắp xếp các số 27, 91, 63, 15 từ lớn đến bé:','91, 63, 27, 15','63, 91, 27, 15','15, 27, 63, 91','91, 27, 63, 15','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Từ 21 đến 50 có bao nhiêu số tròn chục?','4 số','3 số','2 số','5 số','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Hôm nay là ngày 25 tháng 5. Vậy 5 ngày nữa là ngày nào?','30 tháng 5','29 tháng 5','31 tháng 5','1 tháng 6','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'28 + 34 = ?','61','62','63','64','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'76 - 29 = ?','46','47','48','49','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'15 + 27 + 19 = ?','60','61','62','63','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'53 - 17 + 9 = ?','44','45','46','47','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Viết số còn thiếu vào chỗ chấm: 72, …, …, 75, 76','73, 74','72, 73','74, 75','73, 75','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số 67 có số liền trước là số …, có số liền sau là số …','66, 68','65, 67','67, 69','66, 67','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Hùng có 38 quả bóng, Nam cho thêm 24 quả. Hỏi Hùng có bao nhiêu quả bóng?','61','62','63','64','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Một thùng có 84 lít nước, lấy đi 37 lít. Hỏi thùng còn bao nhiêu lít nước?','46','47','48','49','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 82 … 64','>','<','=','Không rõ','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 33 … 39','>','<','=','Không rõ','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Số “Bốn mươi chín” được viết là số nào?','49','94','40','48','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Từ 41 đến 70 có bao nhiêu số tròn chục?','2 số','3 số','4 số','5 số','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Hôm nay là ngày 8 tháng 3. Vậy 6 ngày nữa là ngày nào?','13 tháng 3','14 tháng 3','15 tháng 3','16 tháng 3','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'19 + 43 = ?','61','62','63','64','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'88 - 45 = ?','42','43','44','45','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'23 + 14 + 8 = ?','44','45','46','47','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'64 - 28 + 15 = ?','50','51','52','53','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Viết số còn thiếu vào chỗ chấm: 89, …, …, 92, 93','90, 91','89, 90','91, 92','90, 92','A','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Lan có 55 quả táo, cho Minh 19 quả. Hỏi Lan còn bao nhiêu quả táo?','35','36','37','38','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'Trên cây có 72 con chim, 25 con bay đi. Hỏi trên cây còn bao nhiêu con chim?','46','47','48','49','B','Ôn tập học kỳ 2')");
        db.execSQL("INSERT INTO CauHoi (noiDung, dapAnA, dapAnB, dapAnC, dapAnD, dapAnDung, chuDe) VALUES (" +
                "'So sánh: 91 … 91','>','<','=','Không rõ','C','Ôn tập học kỳ 2')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int o, int n) {
        db.execSQL("DROP TABLE IF EXISTS CauHoi");
        onCreate(db);
    }

    public List<CauHoi> getCauHoiTheoChuDe(String chuDe) {
        List<CauHoi> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery(
                "SELECT * FROM CauHoi WHERE chuDe=? ORDER BY RANDOM() LIMIT 10",
                new String[]{chuDe}
        );
        while(c.moveToNext()) {
            CauHoi q = new CauHoi();
            q.id = c.getInt(0);
            q.noiDung = c.getString(1);
            q.dapAnA = c.getString(2);
            q.dapAnB = c.getString(3);
            q.dapAnC = c.getString(4);
            q.dapAnD = c.getString(5);
            q.dapAnDung = c.getString(6);
            q.chuDe = c.getString(7);
            list.add(q);
        }
        c.close();
        return list;
    }
}