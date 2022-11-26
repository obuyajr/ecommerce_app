package com.example.school5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    ImageButton teleV, mobileP, Laptop, Shoe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teleV = findViewById(R.id.Telev);
        mobileP = findViewById(R.id.Phones);
        Laptop = findViewById(R.id.laptops);
        Shoe = findViewById(R.id.Shoes);

        teleV.setOnClickListener((View.OnClickListener) this);
        mobileP.setOnClickListener((View.OnClickListener) this);
        Laptop.setOnClickListener((View.OnClickListener) this);
        Shoe.setOnClickListener((View.OnClickListener) this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Telev:
                Toast.makeText(this, "TELEVISIONS SELECTED", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,television.class));
                break;
            case R.id.Phones:
                Toast.makeText(this, "PHONES SELECTED", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,phones.class));
                break;
            case R.id.laptops:
                Toast.makeText(this, "LAPTOPS SELECTED", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,laptops.class));
                break;
            case R.id.Shoes:
                Toast.makeText(this, "SHOES SELECTED", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,Shoez.class));
                break;

        }
    }
}