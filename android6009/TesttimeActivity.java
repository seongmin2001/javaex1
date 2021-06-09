package com.example.testlast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

public class TesttimeActivity extends AppCompatActivity {

    TimePicker tpMyTime;
    Button btReadTime,btTimeToMain;
    TextView tvReadTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testtime);

        tpMyTime = findViewById(R.id.tp_MyTime);
        btReadTime = findViewById(R.id.bt_ReadTime);
        tvReadTime = findViewById(R.id.tv_ReadTime);
        btTimeToMain = findViewById(R.id.bt_TimeToMain);

        tpMyTime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                int nHour = hourOfDay;
                int nMinute = minute;
                String sTime = Integer.toString(nHour) + ":" + Integer.toString(nMinute);
                tvReadTime.setText(sTime);
            }
        });

        btReadTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int nHour = tpMyTime.getHour();
                int nHour = tpMyTime.getCurrentHour();
                int nMinute = tpMyTime.getCurrentMinute();
                String sTime = Integer.toString(nHour) + ":" + Integer.toString(nMinute);
                tvReadTime.setText(sTime);
            }
        });

        btTimeToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(TesttimeActivity.this, MainActivity.class);

//                int nHour = tpMyTime.getCurrentHour();
//                int nMinute = tpMyTime.getCurrentMinute();
//                String sTime = Integer.toString(nHour) + ":" + Integer.toString(nMinute);
//                tvReadTime.setText(sTime);


                mIntent.putExtra("MyTime",tvReadTime.getText().toString());

                startActivity(mIntent);
            }
        });
    }
}