package com.example.lenovo.myapp67;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class GengDi1 extends AppCompatActivity {
    private ImageButton ib1,ib2,ib3,ib4;
    private Intent in1,in2,in3,in4;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geng_di1);

        Calendar cal=Calendar.getInstance();
        final int mm=cal.get(Calendar.MONTH);
        final int dd=cal.get(Calendar.DATE);
        ib1=(ImageButton)findViewById(R.id.gd1_qingcai);
        ib2=(ImageButton)findViewById(R.id.gd1_xihongshi);
        ib3=(ImageButton)findViewById(R.id.gd1_qiezi);
        ib4=(ImageButton)findViewById(R.id.gd1_kugua);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mm<3 || mm>5){
                    Toast.makeText(GengDi1.this,"还未播种",Toast.LENGTH_SHORT).show();

                }
                in1=new Intent(GengDi1.this,GengDi1_QingCai.class);
                startActivity(in1);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mm<=8 && dd<15 || mm>=12 && dd>15){
                    Toast.makeText(GengDi1.this,"还未播种",Toast.LENGTH_SHORT).show();

                }
                in2=new Intent(GengDi1.this,GengDi1_XiHongshi.class);
                startActivity(in2);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GengDi1.this,"没有该作物，请换一个",Toast.LENGTH_SHORT).show();
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GengDi1.this,"没有该作物，请换一个",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
