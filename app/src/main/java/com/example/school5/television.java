package com.example.school5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class television extends AppCompatActivity implements View.OnClickListener {
    ImageView J1,J2,J3,J4,J5,J6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television);


        //
               //call action bar
                ActionBar actionBar = getSupportActionBar();
                //customize back button
                actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
                //show back arrow in action bar
                actionBar.setDisplayHomeAsUpEnabled(true);
                //
                J1 = findViewById(R.id.j1);
                J2 = findViewById(R.id.j2);
                J3 = findViewById(R.id.j3);
                J4 = findViewById(R.id.j4);
                J5 = findViewById(R.id.j5);
                J6 = findViewById(R.id.j6);

                J1.setOnClickListener((View.OnClickListener) this);
                J2.setOnClickListener((View.OnClickListener) this);
                J3.setOnClickListener((View.OnClickListener) this);
                J4.setOnClickListener((View.OnClickListener) this);
                J5.setOnClickListener((View.OnClickListener) this);
                J6.setOnClickListener((View.OnClickListener) this);


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
                    case R.id.j1:
                        Toast.makeText(this, "Jordan 1s", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.j2:
                        Toast.makeText(this, "J Retros", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.j3:
                        Toast.makeText(this, "Nike Boss", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.j4:
                        Toast.makeText(this, "Airfoce 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.j5:
                        Toast.makeText(this, "J7 Retro", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.j6:
                        Toast.makeText(this, "LV Red Bottoms", Toast.LENGTH_SHORT).show();
                        break;

                }
            }}