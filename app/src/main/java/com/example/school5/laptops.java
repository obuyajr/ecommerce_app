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

public class laptops extends AppCompatActivity implements View.OnClickListener{
    ImageView L1,L2,L3,L4,L5,L6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptops);
        //
        //call action bar
        ActionBar actionBar = getSupportActionBar();
        //customize back button
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        //show back arrow in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
        //

                L1 = findViewById(R.id.l1);
                L2 = findViewById(R.id.l2);
                L3 = findViewById(R.id.l3);
                L4 = findViewById(R.id.l4);
                L5 = findViewById(R.id.l5);
                L6 = findViewById(R.id.l6);

                L1.setOnClickListener((View.OnClickListener) this);
                L2.setOnClickListener((View.OnClickListener) this);
                L3.setOnClickListener((View.OnClickListener) this);
                L4.setOnClickListener((View.OnClickListener) this);
                L5.setOnClickListener((View.OnClickListener) this);
                L6.setOnClickListener((View.OnClickListener) this);


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
                    case R.id.l5:
                        Toast.makeText(this, "HP pavilion", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(laptops.this,MainActivity.class));
                        break;
                    case R.id.l1:
                        Toast.makeText(this, "Hp probook", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.l2:
                        Toast.makeText(this, "Dell Xps", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.l3:
                        Toast.makeText(this, "Dell x13", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.l4:
                        Toast.makeText(this, "Macbook Pro", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.l6:
                        Toast.makeText(this, "HP spectre", Toast.LENGTH_SHORT).show();
                        break;

                }
            }}
