package com.example.rough;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Main2Activity extends AppCompatActivity {
Button i1,i2,i3,i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

 i1=findViewById(R.id.bu1);
 i2=findViewById(R.id.b2);
 i3=findViewById(R.id.b3);
 i4=findViewById(R.id.b4);

 i1.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
             Intent in=new Intent(Main2Activity.this,Main3Activity.class);
             startActivity(in);
     }
 });

 i4.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent a=new Intent(Main2Activity.this,Main4Activity.class);
         startActivity(a);
     }
 });
 i2.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent b=new Intent(Main2Activity.this,Main9Activity.class);
         startActivity(b);
     }
 });
 i3.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent c=new Intent(Main2Activity.this,Main10Activity.class);
         startActivity(c);
     }
 });
    }
}
