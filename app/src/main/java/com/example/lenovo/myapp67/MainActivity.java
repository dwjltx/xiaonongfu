package com.example.lenovo.myapp67;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tt1;
    private Button button1;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.e_user);
        et2 = (EditText) findViewById(R.id.e_password);
        tt1=(TextView)findViewById(R.id.zhuye_1);

        button1 = (Button) findViewById(R.id.queding);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("123") && et2.getText().toString().equals("123")) {
                    intent=new Intent(MainActivity.this,MainPage.class);
                    startActivity(intent);
                }
                else{
                    tt1.setText("请重新输入学号密码");
                }
            }
        });


    }
}
