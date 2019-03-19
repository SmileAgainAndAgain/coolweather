package com.example.littlexin.olderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //显示系统时间
        TextView time1 = (TextView) findViewById(R.id.tv_time1);
        TextView time2 = (TextView) findViewById(R.id.tv_time2);
        Calendar calendar = Calendar.getInstance();
        //获取系统的日期
        //年
        int year = calendar.get(Calendar.YEAR);
        //月
        int month = calendar.get(Calendar.MONTH)+1;
        //日
        int day = calendar.get(Calendar.DAY_OF_MONTH );
        //获取系统时间
        //小时
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        //分钟
        int minute = calendar.get(Calendar.MINUTE);
        //秒
        //int second = calendar.get(Calendar.SECOND);
        time1.setText(hour+":"+minute);
        time2.setText(year+"年"+month+"月"+day+"日");

        //显示地区
        TextView tv_locate =findViewById(R.id.tv_locate);
        //显示天气
        TextView tv_weather =findViewById(R.id.tv_weather);
        //显示温度
        TextView tv_temperature =findViewById(R.id.tv_temperature);


    }
}
