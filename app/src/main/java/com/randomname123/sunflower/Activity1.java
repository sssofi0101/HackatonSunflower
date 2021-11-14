package com.randomname123.sunflower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button button=findViewById(R.id.offline);
        button.setOnClickListener(this);

        Button button2=findViewById(R.id.online);
        button.setOnClickListener(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(),Activity2.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v) {
        mode.offlineMode=true;
        Intent intent =new Intent(this,Activity2.class);
        startActivity(intent);
    }
}