package com.example.myapplicatijkn;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_dot,
            btn_plus, btn_minus, btn_multiply, btn_divide, btn_equals,
            btn_memMinus, btn_memPlus, btn_memRead,
            btn_openBracket, btn_closeBracket,
            btn_sin, btn_cos;

    TextView expression, answer;

    ImageView btn_clear;

    StringBuilder str;

    float memValue = 0;

    int bracketsCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        str = new StringBuilder();

        btn_0 = (Button) findViewById(R.id.n0);
        btn_1 = (Button) findViewById(R.id.n1);
        btn_2 = (Button) findViewById(R.id.n2);
        btn_3 = (Button) findViewById(R.id.n3);
        btn_4 = (Button) findViewById(R.id.n4);
        btn_5 = (Button) findViewById(R.id.n5);
        btn_6 = (Button) findViewById(R.id.n6);
        btn_7 = (Button) findViewById(R.id.n7);
        btn_8 = (Button) findViewById(R.id.n8);
        btn_9 = (Button) findViewById(R.id.n9);
        btn_dot = (Button) findViewById(R.id.dot);


        btn_plus = (Button) findViewById(R.id.plus);
        btn_minus = (Button) findViewById(R.id.minus);
        btn_multiply = (Button) findViewById(R.id.multiplication);
        btn_divide = (Button) findViewById(R.id.division);
        btn_equals = (Button) findViewById(R.id.equals);
        btn_clear = (ImageView) findViewById(R.id.del);


        btn_memMinus = (Button) findViewById(R.id.mMinus);
        btn_memPlus = (Button) findViewById(R.id.mPlus);
        btn_memRead = (Button) findViewById(R.id.mr);


        btn_openBracket = (Button) findViewById(R.id.firstSkobka);
        btn_closeBracket = (Button) findViewById(R.id.secondSkobka);

        btn_sin = (Button) findViewById(R.id.sin);
        btn_cos = (Button) findViewById(R.id.cos);


        expression = (TextView) findViewById(R.id.input);
        answer = (TextView) findViewById(R.id.result);


    }
}
