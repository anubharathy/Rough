package com.example.rough;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class Main7Activity extends AppCompatActivity {
    ImageButton ii1;
    ImageButton ii2;
    ImageButton ii3;
    ImageButton ii4;
    ImageButton ii5;
    Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        i = new Intent(Main7Activity.this,Main8Activity.class);



        ii1 =(ImageButton) findViewById(R.id.ii1);
        ii2 =(ImageButton) findViewById(R.id.ii2);
        ii3 =(ImageButton) findViewById(R.id.ii3);
        ii4 =(ImageButton) findViewById(R.id.ii4);
        ii5 =(ImageButton) findViewById(R.id.ii5);

        ii1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("resId1",R.drawable.beds);
            }
        });

        ii2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("resId",R.drawable.sofa);
            }
        });

        ii3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("resId11",R.drawable.tv);

            }
        });

        ii4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i.putExtra("resId111",R.drawable.table);

            }
        });

        ii5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i.putExtra("resId1111",R.drawable.chair);

            }
        });







        Button btn =(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(i);

            }
        });




    }






}


