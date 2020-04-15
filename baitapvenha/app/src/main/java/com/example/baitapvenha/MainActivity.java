package com.example.baitapvenha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ContactModel> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        contacts = new ArrayList<>();
        contacts.add(new ContactModel("Unity Technologies",R.drawable.thumb1, true,"Free Access to Learn Premium", "07:03 AM"));
        contacts.add(new ContactModel("IT4060- Lập trình mạng",R.drawable.thumb2, true,"Xác nhận nộp bài tuần 3", "21:50 PM"));
        contacts.add(new ContactModel("Noreply@codeforces.com",R.drawable.thumb3, true,"Codeforces Round 633", "08::57 AM"));
        contacts.add(new ContactModel("Unity",R.drawable.thumb4, true,"Create something beautiful: New courses, services and more", "09:42 PM"));
        contacts.add(new ContactModel("Zoom ", R.drawable.thumb5, false,"Please activate your Zoom account", "01:39 AM"));
        contacts.add(new ContactModel("Google", R.drawable.thumb6, false,"Huy ơi, hãy tải các ứng dụng mới nhất của Google để hoàn tất quá trình thiết lập thiết bị Samsung Galaxy S7 của bạn", "18:43 AM"));
        contacts.add(new ContactModel("Twitter", R.drawable.thumb7, false,"New login to Twitter from Chrome on Windows", "19:35 AM"));
        contacts.add(new ContactModel("Bui Trong Tung", R.drawable.thumb8, true,"Tham gia Microsoft Team cho lớp học phần Lập trình mạng học kỳ 20192", "14:42 AM"));
        contacts.add(new ContactModel("Vu Thi Lan  ", R.drawable.thumb9, false,"Chào  các em! Do điều kiện không thể tập trung trên lớp nên trong thời gian này các em tập trung học và thực hiện các bài tập trên LMS theo đúng qui định. ", "13:07 AM"));
        contacts.add(new ContactModel("Duc Nguyen Duc", R.drawable.thumb10, true,"Tài liệu môn học IT3120 - Phân tích thiết kế hệ thống", "13:56 AM"));
        contacts.add(new ContactModel("Le Ba Vui", R.drawable.thumb11, false,"Bài giảng môn học Phát triển ứng dụng cho thiết bị di động kỳ 20192", "13:32 AM"));
        contacts.add(new ContactModel("Unity Technologies", R.drawable.thumb12, true,"Confirm your email address", "11:21 AM"));

        ImageAdapter adapter = new ImageAdapter(contacts);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
