package com.randomname123.sunflower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button button=findViewById(R.id.newS);
        button.setOnClickListener(this);

        Button button2=findViewById(R.id.prev);
        button2.setOnClickListener(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mode.offlineMode=true;
                Intent intent = new Intent(v.getContext(), afterOfflineActivity.class);
                startActivity(intent);
            }
        });
        if (mode.offlineMode == true){
            button2.setEnabled(false);
        }
    }
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(this,Activity3.class);
        startActivity(intent);
    }
}