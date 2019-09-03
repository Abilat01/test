package com.example.p0091onclickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOK;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //поиск viev-элементов
        tvOut = (TextView)  findViewById(R.id.btnCancel);
        btnOK = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener ocLbtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };

        btnCancel.setOnClickListener(ocLbtnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                tvOut.setText("Нажата кнопка ОК");
                // TODO Auto-generated metod stub
            }
        };

        btnOK.setOnClickListener(oclBtnOk);


    }
}
