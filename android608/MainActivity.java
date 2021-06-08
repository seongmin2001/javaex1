package com.example.testintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btSub1, btSub3;
    EditText edUserID, edPhone, edAge, edName;
    CheckBox chkImgCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btSub1 = findViewById(R.id.bt_Sub1);
        btSub3 = findViewById(R.id.bt_Sub3);
        edUserID = findViewById(R.id.ed_UserID);
        edPhone = findViewById(R.id.ed_Phone);
        edAge = findViewById(R.id.ed_Age);
        chkImgCheck = findViewById(R.id.chk_imgcheck);
        edName = findViewById(R.id.ed_Name);

        btSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, Sub1Activity.class);

                mIntent.putExtra("MyID",edUserID.getText().toString());
                mIntent.putExtra("MyPhone",edPhone.getText().toString());
                mIntent.putExtra("MyAge",Integer.parseInt(edAge.getText().toString()));

                startActivity(mIntent);

            }
        });
        btSub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(MainActivity.this, Sub3Activity.class);
                startActivity(mIntent);

                mIntent.putExtra("MyName",edName.getText().toString());

                int nImageOK = 0;
                if(chkImgCheck.isChecked()){
                    nImageOK = 1;
                } else {
                    nImageOK = 0;
                }
                mIntent.putExtra("ImgCheck",nImageOK);
                startActivity(mIntent);
            }
        });
        chkImgCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}