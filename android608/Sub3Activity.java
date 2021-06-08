package com.example.testintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Sub3Activity extends AppCompatActivity {

    Button btGoMain;
    ImageView imvDrum;
    TextView tvSub3 , tvSub3Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        tvSub3 = findViewById(R.id.tv_Sub3);
        tvSub3Name = findViewById(R.id.tv_Sub3Name);
        btGoMain = findViewById(R.id.bt_GoMain);
        imvDrum = findViewById(R.id.imv_drum);

        Intent Sub3Intent = getIntent();
        String sName = Sub3Intent.getStringExtra("MyName");
        tvSub3Name.setText(sName);

        int nImg = Sub3Intent.getIntExtra("ImgCheck",0);
        if(nImg == 1){
            imvDrum.setVisibility(View.VISIBLE);
        }else{
            imvDrum.setVisibility(View.INVISIBLE);
        }

        btGoMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Sub3Activity.this, MainActivity.class);
                startActivity(mIntent);


            }
        });


    }
}