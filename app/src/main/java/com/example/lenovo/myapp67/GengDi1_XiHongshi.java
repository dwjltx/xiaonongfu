package com.example.lenovo.myapp67;

import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GengDi1_XiHongshi extends AppCompatActivity {
    private ListView XHlist;
    private ArrayList<String> array;
    private ArrayAdapter<String> adapter;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geng_di1__xi_hongshi);
        Calendar cal=Calendar.getInstance();
        final int mm=cal.get(Calendar.MONTH);
        final int dd=cal.get(Calendar.DATE);
        XHlist=(ListView)findViewById(R.id.xihongshi_liebiao);
        array=new ArrayList<String>();
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,array);
        XHlist.setAdapter(adapter);
        array.add("名称：西红柿");
        array.add("播种时间：8月15日");
        array.add("上市时间：11月15日");
        array.add("下架时间：12月15日");
        array.add("次供量：200吨");
        array.add("种植面积：2000亩");
        if(mm<=8 && dd<15 || mm>11 && dd>15) {
            if(mm<=12 && dd<=15){
                array.add("距离上市时间:（正在上市时间）");
                array.add("距离播种时间：(正在上市时间)");
            }
            else{
                array.add("距离上市时间：（已经下架）");
                if(mm>=12 && dd>15 ){
                    array.add("距离播种时间："+((12-mm)*30+dd-1+255)+"天");
                }
            }
        }
        else{
            array.add("距离上市时间："+((11-mm)*30+dd-1)+"天");
            array.add("距离播种时间：(已经播种)");
        }
    }
}
