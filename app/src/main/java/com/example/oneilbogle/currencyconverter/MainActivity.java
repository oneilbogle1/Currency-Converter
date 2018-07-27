package com.example.oneilbogle.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertButton(View v){

        EditText getMoney = (EditText) findViewById(R.id.edt);

        double money = Double.parseDouble(getMoney.getText().toString());


        Double convertMoney = money * 0.76;


        Toast.makeText(MainActivity.this,"£" + convertMoney,Toast.LENGTH_LONG).show();




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
