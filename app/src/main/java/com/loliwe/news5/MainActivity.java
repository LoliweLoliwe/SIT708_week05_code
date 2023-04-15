package com.loliwe.news5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    Button button1, button2, button3, button4;

    TextView txtView1, txtView2, txtView3, txtView4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.Btn1);
        button2 = findViewById(R.id.Btn2);
        button3 = findViewById(R.id.Btn3);
        button4 = findViewById(R.id.Btn4);

        txtView1 = findViewById(R.id.textView3);
        txtView2 = findViewById(R.id.textView4);
        txtView3 = findViewById(R.id.textView5);
        txtView4 = findViewById(R.id.textView6);

        FragmentManager guess = getSupportFragmentManager();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guess.beginTransaction()
                        .replace(R.id.fragmentContainerView1, newsFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guess.beginTransaction()
                        .replace(R.id.fragmentContainerView1, sportsFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guess.beginTransaction()
                        .replace(R.id.fragmentContainerView1, businessFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guess.beginTransaction()
                        .replace(R.id.fragmentContainerView1, weatherFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();
            }
        });

        txtView1.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        FragmentManager guess = getSupportFragmentManager();

        if(event.getAction() == MotionEvent.ACTION_DOWN) {

        }
        return false;
    }
}