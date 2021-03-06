package com.example.xerox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SupplierActivity1 extends AppCompatActivity {
    private  EditText et_supName;
    String name;
    FloatingActionButton cart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier1);

        cart = findViewById(R.id.cart_btn);
        et_supName = findViewById(R.id.et_supName);

        Intent i = getIntent();
        name = i.getStringExtra("sname");
        et_supName.setText(name);

    }


    public void FruitsPage(View view) {
        Intent intent1 = new Intent(this,VIEWFRUIT.class);
        startActivity(intent1);
    }

    public void VegPage(View view) {
        Intent intent1 = new Intent(this,VIEWFRUIT.class);
        startActivity(intent1);
    }

    public void myCart(View view) {
        Intent intent1 = new Intent(this,SupplierCartActivity4.class);
        startActivity(intent1);
    }



}