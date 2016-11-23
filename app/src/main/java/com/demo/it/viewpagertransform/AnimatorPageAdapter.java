package com.demo.it.viewpagertransform;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;


public class AnimatorPageAdapter extends PagerAdapter {
    private Context mContext;
    private List<Integer> mPicLst;

    public AnimatorPageAdapter(MainActivity mainActivity, List<Integer> mPicLst) {
        mContext = mainActivity;
        this.mPicLst = mPicLst;
    }

    @Override
    public int getCount() {
        return mPicLst.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup convertView, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mPicLst.get(position));
        convertView.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
