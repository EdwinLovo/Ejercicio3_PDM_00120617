package com.example.acer.linearlayoutui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout red, green, blue;
    int cont1 = 1, cont2=1, cont3=1;

    int[] blues = {
            R.color.blue,
            R.color.blue2,
            R.color.blue3
    };

    int[] reds = {
            R.color.red,
            R.color.red2,
            R.color.red3
    };
    int[] greens = {
            R.color.green,
            R.color.green2,
            R.color.green3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        red = (LinearLayout) findViewById(R.id.red);
        green = (LinearLayout) findViewById(R.id.green);
        blue = (LinearLayout) findViewById(R.id.blue);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                red.setBackgroundResource(reds[cont1]);
                cont1++;
                if(cont1==3){
                    cont1=0;
                }
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                green.setBackgroundResource(greens[cont2]);
                cont2++;
                if(cont2==3){
                    cont2=0;
                }
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blue.setBackgroundResource(blues[cont3]);
                cont3++;
                if(cont3==3){
                    cont3=0;
                }
            }
        });

    }
}
