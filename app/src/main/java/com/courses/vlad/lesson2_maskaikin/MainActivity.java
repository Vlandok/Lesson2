package com.courses.vlad.lesson2_maskaikin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.courses.vlad.lesson2_maskaikin.Task1Activity.createStartIntent;

public class MainActivity extends AppCompatActivity {

    private Button buttonTask1;
    private Button buttonTask2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTask1 = findViewById(R.id.buttonTask1);
        buttonTask2 = findViewById(R.id.buttonTask2);

        buttonTask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Task1Activity.createStartIntent(MainActivity.this));
            }
        });

        buttonTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(Task2Activity.createStartIntent(MainActivity.this));
            }
        });

    }
}
