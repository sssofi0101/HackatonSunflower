package com.randomname123.sunflower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class afterOfflineActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_offline);

        TextView t=findViewById(R.id.number);
        t.setText(fields.currentField);

        Button button=findViewById(R.id.button7);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        fields.currentField++;
        if (fields.currentField>fields.fieldsCount){
            Intent intent =new Intent(this,OfflineEnd.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, afterOfflineActivity.class);
            startActivity(intent);
        }
    }
}