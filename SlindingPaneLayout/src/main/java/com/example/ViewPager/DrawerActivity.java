package com.example.ViewPager;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawerActivity extends AppCompatActivity {
    private TextView planetText1;
    private TextView planetText2;
    private TextView planetText3;
    private TextView planetText4;
    private ImageView planetImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        planetImageView = (ImageView) findViewById(R.id.imageV1);
        planetText1 = (TextView) findViewById(R.id.tv1);
        planetText2 = (TextView) findViewById(R.id.tv2);
        planetText3 = (TextView) findViewById(R.id.tv3);
        planetText4 = (TextView) findViewById(R.id.tv4);

        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation view item clicks here.
                switch (item.getItemId()) {
                    case R.id.nav_earth:
                        planetText1.setText(R.string.planet_name_earth);
                        planetText2.setText(R.string.planet_mess_earth);
                        planetText3.setText(R.string.planet_grav_earth);
                        planetText4.setText(R.string.planet_size_earth);
                        planetImageView.setImageResource(R.mipmap.ib_earth_normal);
                        drawer.setBackgroundResource(R.mipmap.plasma480);
                        break;
                    case R.id.nav_venus:
                        planetText1.setText(R.string.planet_name_venus);
                        planetText2.setText(R.string.planet_mess_venus);
                        planetText3.setText(R.string.planet_grav_venus);
                        planetText4.setText(R.string.planet_size_venus);
                        planetImageView.setImageResource(R.mipmap.ib_venus_normal);
                        drawer.setBackgroundResource(R.mipmap.plasma720);
                        break;
                    case R.id.nav_jupiter:
                        planetText1.setText(R.string.planet_name_jupiter);
                        planetText2.setText(R.string.planet_mess_jupiter);
                        planetText3.setText(R.string.planet_grav_jupiter);
                        planetText4.setText(R.string.planet_size_jupiter);
                        planetImageView.setImageResource(R.mipmap.ib_jupiter_normal);
                        drawer.setBackgroundResource(R.mipmap.plasma1080);
                        break;
                    case R.id.nav_neptune:
                        planetText1.setText(R.string.planet_name_neptune);
                        planetText2.setText(R.string.planet_mess_neptune);
                        planetText3.setText(R.string.planet_grav_neptune);
                        planetText4.setText(R.string.planet_size_neptune);
                        planetImageView.setImageResource(R.mipmap.ib_neptune_normal);
                        drawer.setBackgroundResource(R.mipmap.plasma1080);
                        break;
                    case R.id.nav_mars:
                        planetText1.setText(R.string.planet_name_mars);
                        planetText2.setText(R.string.planet_mess_mars);
                        planetText3.setText(R.string.planet_grav_mars);
                        planetText4.setText(R.string.planet_size_mars);
                        planetImageView.setImageResource(R.mipmap.ib_mars_normal);
                        drawer.setBackgroundResource(R.mipmap.plasma720);
                        break;
                }
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}


          
   
            