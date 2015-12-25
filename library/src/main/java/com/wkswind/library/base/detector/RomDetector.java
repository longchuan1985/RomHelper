package com.wkswind.library.base.detector;

import android.os.Build;

/**
 * Rom Detector
 * Created by Administrator on 2015-11-23.
 */
public class RomDetector {
    private static final String FLYME = "Flyme";
    private static final String MIUI = "miui";

    public static boolean isMIUI() {
        return MIUIDetector.isMIUI();
    }

    public static String getRomName(){
        return Build.DISPLAY;
    }

    public static boolean aboveVersion(int versionCode){
        return Build.VERSION.SDK_INT >= versionCode;
    }

    public static boolean isFlyme(){
        return FlymeDetector.isFlyme();
    }
}
