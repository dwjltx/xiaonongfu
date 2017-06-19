package com.example.lenovo.myapp67;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainPage extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ArrayList<String> menuList;
    private ArrayAdapter<String> adapter;
    private Button buton1,button2,button3,button4,tuichu_button,xiugai_button;
    private Intent intent1,intent2,intent3,intent4,intent_tuichu;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList=(ListView) findViewById(R.id.left_drawr);
        menuList=new ArrayList<String>();
        //for(int i=0;i<8;i++)
           // menuList.add("zhangyifei"+i);
        Calendar cal=Calendar.getInstance();
        int age=cal.get(Calendar.YEAR)-1996;//获取年龄信息
        int yy=cal.get(Calendar.YEAR);
        int mm=cal.get(Calendar.MONTH)+1;
        int dd=cal.get(Calendar.DATE);
        int h=cal.get(Calendar.HOUR_OF_DAY)+8;
        int mi=cal.get(Calendar.MINUTE);
        int s=cal.get(Calendar.SECOND);
        menuList.add("性别：男");
        menuList.add("年龄："+age);
        menuList.add("班级：计科1401");
        menuList.add("学号：00104");
        menuList.add("毕业院校：HZAU");
        menuList.add("所有棚区："+4);
        menuList.add("当前时间："+h+":"+mi+":"+s);
        menuList.add("当前日期："+yy+"年"+mm+"月"+dd+"日");



        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, menuList);
        mDrawerList.setAdapter(adapter);
        buton1=(Button)findViewById(R.id.gengdi1);
        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this,"正在跳转本棚区作物情况",Toast.LENGTH_SHORT).show();
                intent1=new Intent(MainPage.this,GengDi1.class);
                startActivity(intent1);
            }
        });
        button2=(Button)findViewById(R.id.gengdi2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this,"正在跳转本棚区作物情况",Toast.LENGTH_SHORT).show();
                intent2=new Intent(MainPage.this,GengDi2.class);
                startActivity(intent2);
            }
        });
        button3=(Button)findViewById(R.id.gengdi3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this,"正在跳转本棚区作物情况",Toast.LENGTH_SHORT).show();
                intent3=new Intent(MainPage.this,GengDi1.class);
                startActivity(intent3);
            }
        });
        button4=(Button)findViewById(R.id.gengdi4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this,"正在跳转本棚区作物情况",Toast.LENGTH_SHORT).show();
                intent4=new Intent(MainPage.this,GengDi2.class);
                startActivity(intent4);
            }
        });
        tuichu_button=(Button)findViewById(R.id.button_tuichu);
        tuichu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this,"您选择退出了,将跳回主页面",Toast.LENGTH_LONG).show();
                intent_tuichu=new Intent(MainPage.this,MainActivity.class);
                startActivity(intent_tuichu);
            }
        });
        xiugai_button=(Button)findViewById(R.id.button_xiugai);
        xiugai_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this,"暂未设置",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
