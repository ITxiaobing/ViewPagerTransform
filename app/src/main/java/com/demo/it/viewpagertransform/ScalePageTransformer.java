package com.demo.it.viewpagertransform;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by HanHailong on 15/9/27.
 */
public class ScalePageTransformer implements ViewPager.PageTransformer {

    private static float angle = 90;

    @Override
    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();
        int pageHeight = view.getHeight();

        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            view.setAlpha(0);
        } else if (position <= 0) {//0-- -1
            view.setPivotX(pageWidth / 2);
            view.setPivotY(view.getMeasuredHeight());
            view.setRotation(angle * position);
            view.setAlpha(1-Math.abs(position));
        } else if (position <= 1) { //1-- 0
            // Modify the default slide transition to
            // shrink the page as well
            view.setPivotX(pageWidth / 2);
            view.setPivotY(view.getMeasuredHeight());
            view.setRotation(angle * position);

            view.setAlpha(1 - position);
        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            view.setAlpha(0);
        }
    }
}
