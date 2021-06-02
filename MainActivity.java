package com.example.textcomp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edTitle;
    Button bt_OK, bt_Cancel;
    TextView tvResult;
    CheckBox chkImgView;
    RadioButton rb_Yes;
    RadioButton rb_No;
    ImageView iv_soju;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTitle = findViewById(R.id.ed_title);
        bt_OK = findViewById(R.id.bt_OK);
        bt_Cancel = findViewById(R.id.bt_Cancel);
        tvResult = findViewById(R.id.tv_Result);
        chkImgView = findViewById(R.id.chk_imgV);
        rb_Yes = findViewById(R.id.rb_Yes);
        rb_No = findViewById(R.id.rb_No);
        iv_soju = findViewById(R.id.iv_soju);


        if (!chkImgView.isChecked()){
            chkImgView.setChecked(true);
        };

        chkImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkImgView.isChecked()){
                    iv_soju.setVisibility(View.VISIBLE);
                }
                else{
                    iv_soju.setVisibility(View.INVISIBLE);
                }
            }
        });

        bt_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sTitle = edTitle.getText().toString();
                tvResult.setText(sTitle);
            }
        });

        bt_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edTitle.setText("");
                tvResult.setText("");
            }
        });

        rb_Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        rb_No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        iv_soju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb_Yes.isChecked()){
                    rb_No.setClickable(false);
                    //rb_No.setChecked(true);
                }
                else {
                    rb_Yes.setClickable(false);
                    //rb_Yes.setChecked(true);
                }
            }
        });
    }
}