package com.example.testlast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class TestflipperActivity extends AppCompatActivity {

    Button btPrev, btNext;
    ViewFlipper vfMyFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_flipper);

        btPrev = findViewById(R.id.bt_Prev);
        btNext = findViewById(R.id.bt_Next);
        vfMyFlipper = findViewById(R.id.vf_MyFlipper);

        btPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vfMyFlipper.showPrevious();
            }
        });

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vfMyFlipper.showNext();
            }
        });
    }
}