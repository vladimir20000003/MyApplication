package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Courier courier;
    ListView list;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listView);

        /*courier = Menu.algo();

        TextView info = (TextView) findViewById(R.id.textView);
        info.setText(courier.getFIO() + "\n" + courier.getAbilities());
        OrderAdapter orderAdapter = new OrderAdapter(this, R.layout.list_item,
                courier.getSends());
        list.setAdapter(orderAdapter);*/

    }



    public void myclick(View view){
        TextView mTextView = (TextView) findViewById(R.id.total);
        String s = "Итог: " + Order.total;
        mTextView.setText(s);
    }

    public void clear(View view){
        CheckBox checkBox;
        for(int i = 0; i < list.getChildCount(); i++){
            checkBox = (CheckBox)list.getChildAt(i).findViewById(R.id.checkBox);
            checkBox.setChecked(false);
        }
        Order.total = 0;
    }

    public void Filter(View view){
        CheckBox car = (CheckBox) findViewById(R.id.car);
        CheckBox fragility = (CheckBox) findViewById(R.id.fragility);
        courier = Menu.algo();
        ArrayList<Order> orders = courier.getSends();
        if(!car.isChecked()){
            for (int i = 0; i < orders.size(); i++){
                if(orders.get(i).getReq().equals("Car")){
                    orders.remove(i);
                }
            }
        }
        if(!fragility.isChecked()){
            for (int i = 0; i < orders.size(); i++){
                if(orders.get(i).isFra()){
                    orders.remove(i);
                }
            }
        }
        TextView info = (TextView) findViewById(R.id.textView);
        info.setText(courier.getFIO());
        OrderAdapter orderAdapter = new OrderAdapter(this, R.layout.list_item,
                orders);
        list.setAdapter(orderAdapter);

    }
    /*расширить инф про курьера- чекбоксы - машина, доки - использование заранее известных строковых
    * констант enum - если нет машины, не выводить посылки с машины. */
}