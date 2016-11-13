package com.example.ss.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    EditText t2;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    TextView tv;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.edit1);
        t2 = (EditText) findViewById(R.id.edit2);

        tv = (TextView) findViewById(R.id.textView2);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc(1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc(2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc(3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc(4);
            }

        });
    }
    private void calc(int a){
        switch (a){
            case 1:
                result = Integer.parseInt(t1.getText().toString())+Integer.parseInt(t2.getText().toString());
                break;
            case 2:
                result = Integer.parseInt(t1.getText().toString())-Integer.parseInt(t2.getText().toString());
                break;
            case 3:
                result = Integer.parseInt(t1.getText().toString())*Integer.parseInt(t2.getText().toString());
                break;
            case 4:
                result = Integer.parseInt(t1.getText().toString())/Integer.parseInt(t2.getText().toString());
                break;
        }
        tv.setText("계산결과:"+result);
    }

}

