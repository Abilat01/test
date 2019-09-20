package com.example.p0261intentfilter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class ActivitiWeather extends AppCompatActivity {

    TextView TvT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activiti_weather);

        TextView TvT = (TextView) findViewById(R.id.TvT);
        TvT.setText("КОЛЯ ПИДР!");

    }

}
