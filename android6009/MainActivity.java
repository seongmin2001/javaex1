package com.example.testlast;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btTestTime, btTestFlipper;
    TextView tvMyTimeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btTestTime = findViewById(R.id.bt_TestTime);
        tvMyTimeView = findViewById(R.id.tv_MyTimeView);
        btTestFlipper = findViewById(R.id.bt_TestFlipper);

        Intent mIntent = getIntent();
        String sMyTime = mIntent.getStringExtra("MyTime");
        tvMyTimeView.setText(sMyTime);

        btTestTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, TesttimeActivity.class);
                startActivity(mIntent);
            }
        });

        btTestFlipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, TestflipperActivity.class);
                startActivity(mIntent);
            }
        });
    }
}