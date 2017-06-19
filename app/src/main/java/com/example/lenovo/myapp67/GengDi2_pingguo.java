package com.example.lenovo.myapp67;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class GengDi2_pingguo extends AppCompatActivity {
    private ListView QClist;
    private ArrayList<String> array;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geng_di2_pingguo);
        QClist=(ListView)findViewById(R.id.pingguo_liebiao);
        array=new ArrayList<String>();
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,array);
        QClist.setAdapter(adapter);
        array.add("名称：苹果");
        array.add("上市时间：4月1日");
        array.add("下架时间：8月1日");
        array.add("次供量：200吨");
        array.add("种植面积：12亩");
    }
}
