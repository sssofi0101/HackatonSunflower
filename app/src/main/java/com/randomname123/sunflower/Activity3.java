package com.randomname123.sunflower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        Button button=findViewById(R.id.nexta3);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(this,coordinates.class);
        startActivity(intent);
    }
}