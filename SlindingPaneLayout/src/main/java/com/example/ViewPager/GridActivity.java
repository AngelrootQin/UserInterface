package com.example.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;

public class GridActivity extends AppCompatActivity {
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
   final GridLayout gridLayout = (GridLayout) findViewById(R.id.gridLayout);
        final ImageButton earthButton = (ImageButton) findViewById(R.id.ib_earth);
        final ImageButton venusButton = (ImageButton) findViewById(R.id.ib_venus);
        final ImageButton jupiterButton = (ImageButton) findViewById(R.id.ib_jupiter);
        final ImageButton neptuneButton = (ImageButton) findViewById(R.id.ib_neptune);
        text1 = (TextView) findViewById(R.id.tv1);
        text2 = (TextView) findViewById(R.id.tv2);
        text3 = (TextView) findViewById(R.id.tv3);
        text4 = (TextView) findViewById(R.id.tv4);
        earthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置布局背景
      gridLayout.setBackgroundResource(R.mipmap.plasma480);
                earthButton.setBackgroundColor(Color.argb(128, 255, 255, 255));
                venusButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                jupiterButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                neptuneButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                //设置文本
                text1.setText(R.string.planet_name_earth);
                text2.setText(R.string.planet_mess_earth);
                text3.setText(R.string.planet_grav_earth);
                text4.setText(R.string.planet_size_earth);
                //按钮的消失与出现
                earthButton.setVisibility(View.GONE);
                venusButton.setVisibility(View.VISIBLE);
                jupiterButton.setVisibility(View.VISIBLE);
                neptuneButton.setVisibility(View.VISIBLE);
            }
        });

        venusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置布局背景
   gridLayout.setBackgroundResource(R.mipmap.plasma720);
                earthButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                venusButton.setBackgroundColor(Color.argb(128, 255, 255, 255));
                jupiterButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                neptuneButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                //设置文本
                text1.setText(R.string.planet_name_venus);
                text2.setText(R.string.planet_mess_venus);
                text3.setText(R.string.planet_grav_venus);
                text4.setText(R.string.planet_size_venus);
                //按钮的消失与出现
                earthButton.setVisibility(View.VISIBLE);
                venusButton.setVisibility(View.GONE);
                jupiterButton.setVisibility(View.VISIBLE);
                neptuneButton.setVisibility(View.VISIBLE);
            }
        });

        jupiterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //设置布局背景
          gridLayout.setBackgroundResource(R.mipmap.plasma1080);
                earthButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                venusButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                jupiterButton.setBackgroundColor(Color.argb(128, 255, 255, 255));
                neptuneButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                //设置文本
                text1.setText(R.string.planet_name_jupiter);
                text2.setText(R.string.planet_mess_jupiter);
                text3.setText(R.string.planet_grav_jupiter);
                text4.setText(R.string.planet_size_jupiter);
                //按钮的消失与出现
                earthButton.setVisibility(View.VISIBLE);
                venusButton.setVisibility(View.VISIBLE);
                jupiterButton.setVisibility(View.GONE);
                neptuneButton.setVisibility(View.VISIBLE);
            }
        });
        neptuneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gridLayout.setBackgroundResource(R.mipmap.plasma1080);
                earthButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                venusButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                jupiterButton.setBackgroundColor(Color.argb(255, 255, 255, 255));
                neptuneButton.setBackgroundColor(Color.argb(128, 255, 255, 255));
                //设置文本
                text1.setText(R.string.planet_name_neptune);
                text2.setText(R.string.planet_mess_neptune);
                text3.setText(R.string.planet_grav_neptune);
                text4.setText(R.string.planet_size_neptune);
                //按钮的消失与出现
                earthButton.setVisibility(View.VISIBLE);
                venusButton.setVisibility(View.VISIBLE);
                jupiterButton.setVisibility(View.VISIBLE);
                neptuneButton.setVisibility(View.GONE);
            }
        });
    }
}
