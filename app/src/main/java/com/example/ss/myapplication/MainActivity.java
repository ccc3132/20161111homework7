package com.example.ss.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    EditText t2;

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    void init(){
        t1 = (EditText) findViewById(R.id.edit1);
        t2 = (EditText) findViewById(R.id.edit2);
        tv = (TextView) findViewById(R.id.textView2);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);


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
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calc(5);
            }
        });
    }
    private void calc(int a) {
        if (t1.getText().length() == 0 || t2.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), " 값을 넣지 않으였습니다..", Toast.LENGTH_SHORT).show();
            return;
        }


        double result = 0;
        double num1 = Double.parseDouble(t1.getText().toString());
        double num2 = Double.parseDouble(t2.getText().toString());


        switch (a) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if(num1 == 0 || num2 == 0)
                {
                    Toast.makeText(getApplicationContext(), " 0으로 나눴습니다.", Toast.LENGTH_SHORT).show();
                }
                result = num1 / num2;

                break;
            case 5:
                result = num1 % num2;
                break;
        }
        tv.setText("계산결과:" + result);
    }
}

