package cn.bgs.zidingyi;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by Administrator on 2018/5/9.
 */

public class MeasureScreenUtil{
        private static WindowManager wm;
        private static Display defaultDisplay;
        private static DisplayMetrics displayMetrics;

        public static int getScreenHeight() {
            if (wm == null) {
                wm = (WindowManager) MyApplication.getApp().getSystemService(Context.WINDOW_SERVICE);
                defaultDisplay = wm.getDefaultDisplay();
            }
            //过时的
            return defaultDisplay.getHeight();
        }

        public static int getScreenWidth() {
            if (wm == null) {
                wm = (WindowManager) MyApplication.getApp().getSystemService(Context.WINDOW_SERVICE);
                defaultDisplay = wm.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
            }
            //这个方法是不过时的
            return  displayMetrics.widthPixels;
        }

}