package com.example.rough;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {
EditText e1,e2;
Button b1;
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        b1=findViewById(R.id.b);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty()) {
                  {
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Main3Activity.this);
                        alertDialog.setTitle("Alert");
                        alertDialog.setMessage("Fill all the details");
                        alertDialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        alertDialog.show();
                    }}
                else
                {
                    Toast.makeText(getApplicationContext(), "Logging in....", Toast.LENGTH_SHORT).show();
                    Intent x = new Intent(Main3Activity.this, Main7Activity.class);
                    startActivity(x);

                }
            }
        });
    }
     public void txt_msg(View view)
    {
        Intent i=new Intent(Main3Activity.this,Main5Activity.class);
        startActivity(i);
    }
    public void txt_msg1(View view)
    {
        Intent ii=new Intent(Main3Activity.this,Main6Activity.class);
        startActivity(ii);
    }

}