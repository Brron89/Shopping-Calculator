package com.example.nick.shoppingcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText name,price,tax,quantity;
    TextView total;
    Button compute,show,add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.item_name);
        price = findViewById(R.id.item_price);
        tax = findViewById(R.id.sales_tax);
        quantity = findViewById(R.id.item_quantity);
        total = findViewById(R.id.total);
        compute = findViewById(R.id.compute_button);
        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double getPrice =  Double.parseDouble(price.getText().toString());
                double getQuan = Double.parseDouble(quantity.getText().toString());
                double getTax = Double.parseDouble(tax.getText().toString());
                getTax = getPrice*(getTax/100);
                double setTotal = (getPrice*getQuan) + getTax;
                //String newTotal = String.format("%,.2f",setTotal);
                price.setText("$" +(String.format("%,.2f", getPrice)));
                tax.setText("$" +(String.format("%,.2f", getTax)));
                total.setText("$" +(String.format("%,.2f", setTotal)));


            }
        });
    }
}
