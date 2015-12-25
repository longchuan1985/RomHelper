package com.wkswind.library.base.detector;

import android.os.Build;

import java.lang.reflect.Method;

/**
 * Flyme Detector
 */
public class FlymeDetector {
    public static boolean isFlyme() {
        Method method = null;
        try {
            method = Build.class.getMethod("hasSmartBar");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } finally {
            return null != method;
        }
    }

    public static String getFlymeVersionName() {
        return null;
    }
}