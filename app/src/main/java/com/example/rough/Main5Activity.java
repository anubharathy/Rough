package com.example.rough;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {
Button b;
EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b=findViewById(R.id.bb);
        e1=findViewById(R.id.e1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().isEmpty())
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(Main5Activity.this);
                    alertDialog.setTitle("Alert");
                    alertDialog.setMessage("Pls enter email");
                    alertDialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    alertDialog.show();
                }
                else {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://" + e1.getText().toString()));
                    startActivity(intent);
                }

            }
        });
    }
}
