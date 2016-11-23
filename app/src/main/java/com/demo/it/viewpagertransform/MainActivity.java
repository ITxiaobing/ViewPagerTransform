package com.demo.it.viewpagertransform;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<Integer> mPicLst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setPageTransformer(true, new ScalePageTransformer());
        initData();
        mViewPager.setAdapter(new AnimatorPageAdapter(this,mPicLst));
    }

    private void initData() {
        mPicLst = new ArrayList<>();
        mPicLst.add(R.drawable.style_xiandai);
        mPicLst.add(R.drawable.style_jianyue);
        mPicLst.add(R.drawable.style_oushi);
        mPicLst.add(R.drawable.style_zhongshi);
        mPicLst.add(R.drawable.style_meishi);
        mPicLst.add(R.drawable.style_dzh);
        mPicLst.add(R.drawable.style_dny);
        mPicLst.add(R.drawable.style_rishi);

        mPicLst.add(R.drawable.style_xiandai);
        mPicLst.add(R.drawable.style_jianyue);
        mPicLst.add(R.drawable.style_oushi);
        mPicLst.add(R.drawable.style_zhongshi);
        mPicLst.add(R.drawable.style_meishi);
        mPicLst.add(R.drawable.style_dzh);
        mPicLst.add(R.drawable.style_dny);
        mPicLst.add(R.drawable.style_rishi);
    }
}
