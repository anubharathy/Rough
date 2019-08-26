package com.example.rough;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main10Activity extends AppCompatActivity {
ImageButton i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        i=findViewById(R.id.ib);
        i.setImageResource(R.drawable.star_premium);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Congrats!!You subscribed to premium...",Toast.LENGTH_LONG).show();
            }
        });
    }
}
