package cn.edu.zucc.angelroot.toolbardrawerlayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private String[] mTitle = new String[]{"DIGITAL", "ANALOG"};
    private List<Fragment> mFragments;
    private List<View> mViews;
    private View viewDigitalClock;
    private View viewAnalogClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("主标题");
        toolbar.setSubtitle("副标题");
        toolbar.setLogo(R.mipmap.ic_launcher);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        //   toolbar.setNavigationIcon(R.mipmap.ic_launcher_round);
        toolbar.setOnMenuItemClickListener(onMenuItemClick);
        initView();
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        /**
         * 准备数据源
         */
        viewAnalogClock = View.inflate(this, R.layout.activity_analog, null);
        viewDigitalClock = View.inflate(this, R.layout.activity_digital, null);
        mViews = new ArrayList<View>();
        mViews.add(viewAnalogClock);
        mViews.add(viewDigitalClock);
        mViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return mViews.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                container.addView(mViews.get(position));
                return mViews.get(position);
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle[position];
            }
        });

/**
 *   Fragment 实现
 */

//        mFragments = new ArrayList<Fragment>();
//        mFragments.add(new DigitalColckFragment());
//        mFragments.add(new AnalogClockFragment());
//        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
//            @Override
//            public Fragment getItem(int position) {
//                return mFragments.get(position);
//            }
//
//            @Override
//            public int getCount() {
//                return mTitle.length;
//            }
//
//            @Override
//            public CharSequence getPageTitle(int position) {
//                return mTitle[position];
//            }
//
//        });
        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
            case android.R.id.home:
                Toast.makeText(MainActivity.this, "hfskhfsk", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private Toolbar.OnMenuItemClickListener onMenuItemClick = new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
            }
            return true;
        }
    };
}
