package com.example.pc_31.convertersuhu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button next2 = (Button) findViewById(R.id.buttonfb);
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Facebook.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button next3 = (Button) findViewById(R.id.buttonig);
        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), Instagram.class);
                startActivityForResult(myIntent, 0);

            }
        });
        Button next4 = (Button) findViewById(R.id.buttonweb);
        next4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), WebSmk.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}
