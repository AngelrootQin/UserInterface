package cn.edu.zucc.angelroot.actionbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setHomeButtonEnabled(true);
        ActionBar.Tab tab1 = actionBar.newTab().setText(R.string.tab_one);
        tab1.setTabListener(new ClockTabListener(new DigitalColckFragment()));
        ActionBar.Tab tab2 = actionBar.newTab().setText(R.string.tab_two);
        tab2.setTabListener(new ClockTabListener(new AnalogClockFragment()));
        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
    }

    class ClockTabListener implements ActionBar.TabListener {

        private Fragment fragment;

        public ClockTabListener(Fragment fragment) {
            this.fragment = fragment;
        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.replace(R.id.context, fragment);
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.remove(fragment);
        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

        }
    }
}
