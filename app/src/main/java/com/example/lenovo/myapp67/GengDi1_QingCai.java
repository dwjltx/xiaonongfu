package com.example.lenovo.myapp67;

import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GengDi1_QingCai extends AppCompatActivity {
    private ListView QClist;
    private ArrayList<String> array;
    private ArrayAdapter<String> adapter;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geng_di1__qing_cai);
        Calendar cal=Calendar.getInstance();
        final int mm=cal.get(Calendar.MONTH);
        final int dd=cal.get(Calendar.DATE);

        QClist=(ListView)findViewById(R.id.qingcai_liebiao);
        array=new ArrayList<String>();
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,array);
        QClist.setAdapter(adapter);
        array.add("名称：青菜");
        array.add("播种时间：3月1日");
        array.add("上市时间：4月1日");
        array.add("下架时间：5月1日");
        array.add("次供量：200吨");
        array.add("种植面积：2000亩");
        if(mm<3 || mm>4) {
            if(mm<5){
                array.add("距离上市时间:（正在上市时间）");
                array.add("距离播种时间：(正在上市时间)");
            }
            else{
                array.add("距离上市时间：（已经下架）");
                if(mm>=5 ){
                    array.add("距离播种时间："+((12-mm)*30+dd-1+120)+"天");
                }
                else{
                    array.add("距离播种时间："+((3-mm)*30+dd-1)+"天");
                }
            }
        }
        else{
            array.add("距离上市时间："+((4-mm)*30+dd-1)+"天");
            array.add("距离播种时间：(已经播种)");
        }

    }
}
