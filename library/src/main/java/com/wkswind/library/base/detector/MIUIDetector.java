package com.wkswind.library.base.detector;

import com.wkswind.library.base.SysUtils;

/**
 * MIUI detector
 */
public class MIUIDetector {
    private static final String KEY_MIUI_VERSION_CODE = "ro.miui.ui.version.code";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String KEY_MIUI_INTERNAL_STORAGE = "ro.miui.internal.storage";

    public static boolean isMIUI() {
        return SysUtils.getSystemProperty(KEY_MIUI_VERSION_CODE) != null
                || SysUtils.getSystemProperty(KEY_MIUI_VERSION_NAME) != null
                || SysUtils.getSystemProperty(KEY_MIUI_INTERNAL_STORAGE) != null;
    }

    /**
     * 获取MIUI版本
     *
     * @return
     */
    public static String getMIUIVersionName() {
        return SysUtils.getSystemProperty(KEY_MIUI_VERSION_NAME);
    }

    public static boolean isMIUIV7(){
        return getMIUIVersionName().toLowerCase().equals("v7");
    }

    public static boolean isMIUIV6(){
        return getMIUIVersionName().toLowerCase().equals("v6");
    }
}