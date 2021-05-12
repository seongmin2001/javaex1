package com.example.apptest1;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button btExit, btMsg,btURL,btPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btExit = findViewById(R.id.bt_Exit);
        btMsg = findViewById(R.id.bt_Msg);
        btURL = findViewById(R.id.bt_URL);
        btPhone = findViewById(R.id.bt_Phone);

        btPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/01099811072"));
                startActivity(mIntent);
            }
        });

        btURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.daelim.ac.kr"));
                startActivity(mIntent);
            }
        });

        btMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Button Click!!!",Toast.LENGTH_SHORT).show();
                //Toast 잠시 보여줬다가 사라짐
            }
        });

        btExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}