package cn.edu.zucc.angelroot.toolbardrawerlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class RelativeActivity extends AppCompatActivity {
    private TextView earthText2;
    private TextView earthText3;
    private TextView venusText2;
    private TextView venusText3;
    private TextView jupiterText2;
    private TextView jupiterText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        earthText2 = (TextView) findViewById(R.id.tv2_earth);
        earthText3 = (TextView) findViewById(R.id.tv3_earth);
        venusText2 = (TextView) findViewById(R.id.tv2_venus);
        venusText3 = (TextView) findViewById(R.id.tv3_venus);
        jupiterText2 = (TextView) findViewById(R.id.tv2_jupiter);
        jupiterText3 = (TextView) findViewById(R.id.tv3_jupiter);
        ImageButton earthButton = (ImageButton) findViewById(R.id.ib_earth);
        earthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                earthText2.setVisibility(View.VISIBLE);
                earthText3.setVisibility(View.VISIBLE);
                venusText2.setVisibility(View.GONE);
                venusText3.setVisibility(View.GONE);
                jupiterText2.setVisibility(View.GONE);
                jupiterText3.setVisibility(View.GONE);
            }
        });
        ImageButton venusButton = (ImageButton) findViewById(R.id.ib_venus);
        venusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                earthText2.setVisibility(View.GONE);
                earthText3.setVisibility(View.GONE);
                venusText2.setVisibility(View.VISIBLE);
                venusText3.setVisibility(View.VISIBLE);
                jupiterText2.setVisibility(View.GONE);
                jupiterText3.setVisibility(View.GONE);
            }
        });
        ImageButton jupiterButton = (ImageButton) findViewById(R.id.ib_jupiter);
        jupiterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                earthText2.setVisibility(View.GONE);
                earthText3.setVisibility(View.GONE);
                venusText2.setVisibility(View.GONE);
                venusText3.setVisibility(View.GONE);
                jupiterText2.setVisibility(View.VISIBLE);
                jupiterText3.setVisibility(View.VISIBLE);
            }
        });

    }
}
