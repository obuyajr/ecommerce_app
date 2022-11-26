package com.example.school5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class phones extends AppCompatActivity implements View.OnClickListener{
    ImageView samA13,Iphone14,Iphone12,Camon13,Nokia10,Infinix10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phones);
        //call action bar
        ActionBar actionBar = getSupportActionBar();
        //customize back button
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        //show back arrow in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        samA13 = findViewById(R.id.sam13);
        Camon13 = findViewById(R.id.camon13);
        Nokia10 = findViewById(R.id.nokia10);
        Iphone12 = findViewById(R.id.iphone12);
        Iphone14 = findViewById(R.id.iphone14);
        Infinix10 = findViewById(R.id.hot10);

        samA13.setOnClickListener((View.OnClickListener) this);
        Camon13.setOnClickListener((View.OnClickListener) this);
        Nokia10.setOnClickListener((View.OnClickListener) this);
        Iphone12.setOnClickListener((View.OnClickListener) this);
        Iphone14.setOnClickListener((View.OnClickListener) this);
        Infinix10.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    //onlclick listener for all the image buttons
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sam13:
                Toast.makeText(this, "SAMSUNG A13", Toast.LENGTH_SHORT).show();

                break;
            case R.id.camon13:
                Toast.makeText(this, "CAMON 13", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nokia10:
                Toast.makeText(this, "NOKIA 10", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iphone12:
                Toast.makeText(this, "IPHONE 12", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iphone14:
                Toast.makeText(this, "IPHONE 14", Toast.LENGTH_SHORT).show();
                break;
            case R.id.hot10:
                Toast.makeText(this, "INFINIX HOT 10", Toast.LENGTH_SHORT).show();
                break;

        }
}}