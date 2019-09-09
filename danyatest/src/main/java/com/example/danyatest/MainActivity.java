package com.example.danyatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add(0, 1, 0, "Время дуть!");
        menu.add(0, 2, 0, "Достижения");
        menu.add(0, 3, 0, "Рекорды");
        menu.add(0, 4, 0, "Авторы");
        menu.add(0, 5, 0, "Опции");
        menu.add(0, 6, 0, "Выход");

        return super.onCreateOptionsMenu(menu);

    }

}
