package com.example.lenovo.myapp67;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GengDi2 extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geng_di2);
        btn1=(Button)findViewById(R.id.btn_pingguo);
        btn2=(Button)findViewById(R.id.btn_mihoutao);
        btn3=(Button)findViewById(R.id.btn_hamigua);
        btn4=(Button)findViewById(R.id.btn_chengzi);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(GengDi2.this,GengDi2_pingguo.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(GengDi2.this,GengDi2_pingguo.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(GengDi2.this,GengDi2_pingguo.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent=new Intent(GengDi2.this,GengDi2_pingguo.class);
                startActivity(intent);
            }
        });

    }
}
