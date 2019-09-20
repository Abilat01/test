package com.example.p0261intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTime;
    Button btnDate;
    Button btnWew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = (Button) findViewById(R.id.btnTime);
        btnDate = (Button) findViewById(R.id.btnDate);
        btnWew = (Button) findViewById(R.id.btnWew);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
        btnWew.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.btnTime:
                intent = new Intent(this, ActivityTime.class);
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent(this, ActivityDate.class);
                startActivity(intent);
                break;
            case R.id.btnWew:
                intent = new Intent(this, ActivitiWeather.class);
                startActivity(intent);
                break;
        }
    }
}
