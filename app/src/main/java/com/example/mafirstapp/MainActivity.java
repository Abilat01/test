package com.example.mafirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.LauncherActivity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnClick;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String newString = getString(R.string.new_text);

        getString(R.string.hello_android);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getColor(R.color.red);

            mText = findViewById(R.id.textView);

            Button mBtnClick = findViewById(R.id.button);
            mBtnClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mText.setText(newString);

                }
            });

            Bundle bundle = new Bundle();
            bundle.putString("KEY", "SAD");
        }

    }
}
