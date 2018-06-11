package com.courses.vlad.lesson2_maskaikin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Task1Activity extends AppCompatActivity {

    public static Intent createStartIntent(Context context) {
        Intent intent = new Intent(context, Task1Activity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
    }
}
