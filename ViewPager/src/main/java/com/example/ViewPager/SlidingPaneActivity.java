package com.example.ViewPager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlidingPaneActivity extends AppCompatActivity {
   private LinearLayout uiPaneLinearLayout;
    private TextView planetText1;
    private TextView planetText2;
    private TextView planetText3;
    private TextView planetText4;
    private ImageView planetImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_pane);
        uiPaneLinearLayout = (LinearLayout) findViewById(R.id.uiPane);
        planetText1 = (TextView) findViewById(R.id.tv1);
        planetText2 = (TextView) findViewById(R.id.tv2);
        planetText3 = (TextView) findViewById(R.id.tv3);
        planetText4 = (TextView) findViewById(R.id.tv4);
        planetImageView = (ImageView) findViewById(R.id.iv1);
        ImageButton earthButton = (ImageButton) findViewById(R.id.ib_earth);
        earthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uiPaneLinearLayout.setBackgroundResource(R.mipmap.plasma1080);
                planetText1.setText(R.string.planet_name_earth);
                planetText2.setText(R.string.planet_mess_earth);
                planetText3.setText(R.string.planet_grav_earth);
                planetText4.setText(R.string.planet_size_earth);
                planetImageView.setImageResource(R.mipmap.ib_earth_normal);
            }
        });
        ImageButton venusButton = (ImageButton) findViewById(R.id.ib_venus);
        venusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uiPaneLinearLayout.setBackgroundResource(R.mipmap.plasma1080);
                planetText1.setText(R.string.planet_name_venus);
                planetText2.setText(R.string.planet_mess_venus);
                planetText3.setText(R.string.planet_grav_venus);
                planetText4.setText(R.string.planet_size_venus);
                planetImageView.setImageResource(R.mipmap.ib_venus_normal);
            }
        });
        ImageButton jupiterButton = (ImageButton) findViewById(R.id.ib_jupiter);
        jupiterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uiPaneLinearLayout.setBackgroundResource(R.mipmap.plasma1080);
                planetText1.setText(R.string.planet_name_jupiter);
                planetText2.setText(R.string.planet_mess_jupiter);
                planetText3.setText(R.string.planet_grav_jupiter);
                planetText4.setText(R.string.planet_size_jupiter);
                planetImageView.setImageResource(R.mipmap.ib_jupiter_normal);
            }
        });
        ImageButton neptuneButton = (ImageButton) findViewById(R.id.ib_neptune);
        neptuneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uiPaneLinearLayout.setBackgroundResource(R.mipmap.plasma1080);
                planetText1.setText(R.string.planet_name_neptune);
                planetText2.setText(R.string.planet_mess_neptune);
                planetText3.setText(R.string.planet_grav_neptune);
                planetText4.setText(R.string.planet_size_neptune);
                planetImageView.setImageResource(R.mipmap.ib_neptune_normal);
            }
        });
        ImageButton marsButton = (ImageButton) findViewById(R.id.ib_mars);
        marsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uiPaneLinearLayout.setBackgroundResource(R.mipmap.plasma1080);
                planetText1.setText(R.string.planet_name_mars);
                planetText2.setText(R.string.planet_mess_mars);
                planetText3.setText(R.string.planet_grav_mars);
                planetText4.setText(R.string.planet_size_mars);
                planetImageView.setImageResource(R.mipmap.ib_mars_normal);
            }
        });
    }
}
