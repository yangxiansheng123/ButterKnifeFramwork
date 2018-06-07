package com.butterknifeframwork;

import android.app.Activity;

/**
 * Created by Administrator on 2018/6/1.
 */

public class ButterKnife {
    public static void bind(Activity activity) {
        String className = activity.getClass().getName() + "$ViewBinder";

        try {
            Class<?>  viewBindClass=Class.forName(className);
            ViewBinder  viewBinder= (ViewBinder) viewBindClass.newInstance();
            viewBinder.bind(activity);
        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}

