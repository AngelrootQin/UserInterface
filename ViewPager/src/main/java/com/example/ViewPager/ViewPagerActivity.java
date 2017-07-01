package com.example.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
//    private int[] space = {R.layout.activity_drawer, R.layout.activity_relative, R.layout.activity_sliding_pane, R.layout.activity_linear};
        private int[] space = {R.mipmap.plasma480, R.mipmap.plasma720,R.mipmap.plasma1080, R.mipmap.plasma480};
   private static final String[] pageTitle = {"start 480", "galaxy480", "start 720", "galaxy1080"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        List<View> viewList = new ArrayList<View>();
//        for (int i = 0; i < space.length; i++) {
//            viewList.add(View.inflate(this, space[i], null));
//        }
//        viewPagerAdapter = new ViewPagerAdapter<View>(viewList);

        List<ImageView> viewList = new ArrayList<ImageView>();
        for (int i = 0; i < space.length; i++) {
            ImageView imageView = new ImageView(this);
            viewList.add(imageView) ;
            imageView.setImageResource(space[i]);
        }
        viewPagerAdapter = new ViewPagerAdapter<ImageView>(viewList);
        viewPager = (ViewPager) findViewById(R.id.plantViewPager);
        viewPager.setAdapter(viewPagerAdapter);
        final PagerTabStrip pagerTabStrip = (PagerTabStrip) findViewById(R.id.pagerTabStrip);
        pagerTabStrip.setTextSize(TypedValue.COMPLEX_UNIT_SP,12);
        pagerTabStrip.setTextColor(Color.CYAN);
        pagerTabStrip.setNonPrimaryAlpha(0.64f);
        pagerTabStrip.setTextSpacing(4);
        pagerTabStrip.setBackgroundColor(Color.DKGRAY);
        pagerTabStrip.setTabIndicatorColor(Color.YELLOW);
        pagerTabStrip.setPadding(0,10,0,0);
    }

    private class ViewPagerAdapter<T extends View> extends PagerAdapter {
        private List<T> viewList;

        public ViewPagerAdapter(List<T> views) {
            viewList = views;
        }

        @Override
        public int getCount() {
            return viewList.size();
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(viewList.get(position));
            return viewList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(viewList.get(position));
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return pageTitle[position];
        }
    }
}
