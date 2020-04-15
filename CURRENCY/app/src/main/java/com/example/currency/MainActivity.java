package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity implements OnClickListener {


    private String xuatRaManHinh="0";
    private String xuatRaManHinh2="0";
    //Khai báo các View
    private TextView tvResult;
    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btnCham;
    private Button btnBS;
    private Button btnCE;

    List<String> list_view;
    List<String> list_view1;
    ArrayAdapter<String> adapter;
    ArrayAdapter<String> adapter1;
    Spinner spin1, spin2;
    TextView tv_donvi1, tv_quy_doi,tv_updated_last, tv_donvi2;
    TextView  tvResult2;

    Currency money_USD = new Currency("$",23000.00);
    Currency money_Thailand = new Currency("฿",718.75);
    Currency money_VND = new Currency("₫",1.00);
    Currency money_china = new Currency("¥",3318.79);
    Currency money_japam = new Currency("¥",218.31);

    Currency from = money_USD;
    Currency to = money_VND;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickViews();

        list_view = new ArrayList<>();
        list_view.add("United States - Dollar");
        list_view.add("Japan - Yen");
        list_view.add("ThaiLand - baht");
        list_view.add("VietNam - Dong");
        list_view.add("China - Yuan");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,list_view);

        spin1= findViewById(R.id.spinner1);
        spin1.setAdapter(adapter);

        list_view1 = new ArrayList<>();
        list_view1.add("VietNam - Dong");
        list_view1.add("United States - Dollar");
        list_view.add("Japan - Yen");
        list_view1.add("ThaiLand - baht");
        list_view1.add("China - Yuan");

        adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,list_view1);
        spin2 = findViewById(R.id.spinner2);
        spin2.setAdapter(adapter1);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        from = money_USD;
                        break;
                    case 1:
                        from = money_japam;
                        break;
                    case 2:
                        from = money_Thailand;
                        break;
                    case 3:
                        from = money_VND;
                        break;
                    default:
                        from = money_china;
                        break;
                }
                tv_donvi1.setText(from.text);
                tv_quy_doi.setText("1 "+from.text + "="+ from.getRate(to) + to.text);
                xuatRaManHinh2 = String.valueOf((double)Math.round(Double.parseDouble(xuatRaManHinh)*from.getRate(to)*100)/100);
                tvResult2.setText(xuatRaManHinh2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        to = money_VND;
                        break;
                    case 1:
                        to = money_USD;
                        break;
                    case 2:
                        to = money_japam;
                        break;
                    case 3:
                        to = money_Thailand;
                        break;
                    default:
                        to = money_china;
                        break;
                }
                tv_donvi2.setText(to.text);
                tv_quy_doi.setText("1 "+from.text + "="+ from.getRate(to) + to.text);
                xuatRaManHinh2 = String.valueOf((double)Math.round(Double.parseDouble(xuatRaManHinh)*from.getRate(to)*100)/100);
                tvResult2.setText(xuatRaManHinh2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    // Khởi tạo gán gtri các id cho button tương ứng
    public void initWidget() {
        tv_donvi2 = findViewById(R.id.tv_donvi2);
        tv_donvi1 = findViewById(R.id.tv_donvi1);
        tv_quy_doi = findViewById(R.id.tv_quy_doi);
        tv_updated_last = findViewById(R.id.tv_updated_last);
        tvResult = findViewById(R.id.tvResult);
        tvResult2 = findViewById(R.id.tvResult2);
        btn_0 =  findViewById(R.id.So0);
        btn_1 =  findViewById(R.id.So1);
        btn_2 =  findViewById(R.id.So2);
        btn_3 = findViewById(R.id.So3);
        btn_4 = findViewById(R.id.So4);
        btn_5 =  findViewById(R.id.So5);
        btn_6 = findViewById(R.id.So6);
        btn_7 = findViewById(R.id.So7);
        btn_8 =  findViewById(R.id.So8);
        btn_9 =  findViewById(R.id.So9);
        btnCham =  findViewById(R.id.dauCham);
        btnBS = findViewById(R.id.nutBS);
        btnCE = findViewById(R.id.CE);
    }

    // Lắng nghe sự kiện
    public void setEventClickViews() {
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btnCham.setOnClickListener(this);
        btnBS.setOnClickListener(this);
        btnCE.setOnClickListener(this);
    }

    //chạy vào hàm onClick khi có sự kiện click
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.CE:
                xuatRaManHinh="0";
                xuatRaManHinh2="0";
                break;

            // Xoá 1 ký tự vừa nhập
            case R.id.nutBS:
                String newNumber = deleteAString(xuatRaManHinh);
                xuatRaManHinh=newNumber;
                break;

            // Nối chuỗi các toán hạng và loại bỏ số 0 ở đầu toán hạng
            default:
                if(xuatRaManHinh.equals("0")){
                    xuatRaManHinh="";
                }

                xuatRaManHinh+=((Button)v).getText().toString();
                break;
        }
        // xu ly input
        xuatRaManHinh2 = String.valueOf((double)Math.round(Double.parseDouble(xuatRaManHinh)*from.getRate(to)*100)/100);
        //output
        tvResult.setText(xuatRaManHinh);
        tvResult2.setText(xuatRaManHinh2);

    }
    // Xoá ký tự vừa nhập vào
    public String deleteAString(String number) {
        if(number.length()>1) {
            String temp = number.substring(0, number.length() - 1);
            return temp;
        }
        else if(number.length() == 1){
            return "0";
        }
        return xuatRaManHinh ;
    }


}