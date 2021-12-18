package com.example.unit10_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String make, model;
    int year, miles;
    double price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        make = getIntent().getStringExtra("mainmenu_make");
        model = getIntent().getStringExtra("mainmenu_model") ;
        year = getIntent().getIntExtra("mainmenu_year", 1993);
        miles = getIntent().getIntExtra("mainmenu_miles", 95000);
        price = getIntent().getDoubleExtra("mainmenu_price",1999999);
        EditText ed1, ed2, ed3, ed4, ed5;
        ed1 = (EditText)findViewById(R.id.ed_make);
        ed1.setText(make);
        ed2 = (EditText)findViewById(R.id.ed_model);
        ed2.setText(model);
        ed3 = (EditText)findViewById(R.id.ed_year);
        ed3.setText(String.valueOf(year));
        ed4 = (EditText)findViewById(R.id.ed_miles);
        ed4.setText(String.valueOf(miles));
        ed5 = (EditText)findViewById(R.id.ed_price);
        ed5.setText(String.valueOf(price));
    }
    public void btnclick(View v)
    {

        EditText ed1, ed2, ed3, ed4, ed5;
        String make, model;
        int year, miles;
        double price;
        ed1 = (EditText)findViewById(R.id.ed_make);
        ed2 = (EditText)findViewById(R.id.ed_model);
        ed3 = (EditText)findViewById(R.id.ed_year);
        ed4 = (EditText)findViewById(R.id.ed_miles);
        ed5 = (EditText)findViewById(R.id.ed_price);
        make = ed1.getText().toString();
        model = ed2.getText().toString();
        year = Integer.parseInt(ed3.getText().toString());
        miles = Integer.parseInt(ed4.getText().toString());
        price = Double.parseDouble(ed5.getText().toString());
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("mainmenu_make",make);
        intent.putExtra("mainmenu_model",model);
        intent.putExtra("mainmenu_year",year);
        intent.putExtra("mainmenu_miles",miles);
        intent.putExtra("mainmenu_price",price);


        startActivity(intent);

    }
}