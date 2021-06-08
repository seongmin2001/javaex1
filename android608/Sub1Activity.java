package com.example.testintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Sub1Activity extends AppCompatActivity {

    TextView tvSub1UserID,tvSub1UserPhone,tvSub1Age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
        tvSub1UserID = findViewById(R.id.tv_Sub1UserID);
        tvSub1UserPhone = findViewById(R.id.tv_UserPhone);
        tvSub1Age = findViewById(R.id.tv_sub1Age);

        Intent MyIntent = getIntent();

        String sUserID = MyIntent.getStringExtra("MyID");
        String sPhone = MyIntent.getStringExtra("MyPhone");
        tvSub1UserID.setText(sUserID);
        tvSub1UserPhone.setText(sPhone);
        int nAge = MyIntent.getIntExtra("MyAge",-1);
        tvSub1Age.setText(Integer.toString(nAge));
    }
}