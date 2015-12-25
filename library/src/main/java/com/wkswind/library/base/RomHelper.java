package com.wkswind.library.base;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;

import com.wkswind.library.AndroidMarshmallowHelper;
import com.wkswind.library.BelowMHelper;
import com.wkswind.library.base.detector.RomDetector;
import com.wkswind.library.flyme.FlymeHelper;
import com.wkswind.library.miui.MIUIHelper;

/**
 * Created by Administrator on 2015-12-4.
 */
public class RomHelper {
    private static final RomAction action;
    static {
        if(RomDetector.aboveVersion(Build.VERSION_CODES.M)){
            action = new AndroidMarshmallowHelper();
        }else if(RomDetector.isFlyme()){
            action = new FlymeHelper();
        }else if(RomDetector.isMIUI()){
            action = new MIUIHelper();
        }else{
            action = new BelowMHelper();
        }
    }

    public static boolean isThridPartyROM() {
        return action.isThridPartyROM();
    }

    public static  Intent gotoAppDetails(Context context) {
        return action.gotoAppDetails(context);
    }

    public static  boolean hasPermissionManager() {
        return action.hasPermissionManager();
    }

    public static  Intent gotoPermissionManage(Context context) {
        return action.gotoPermissionManage(context);
    }

    public static  boolean isAutoStart(Context context) {
        return action.isAutoStart(context);
    }

    public static  Intent gotoAutoStartPermission(Context context) {
        return action.gotoAutoStartPermission(context);
    }

    public static  boolean isRooted(Context context) {
        return action.isRooted(context);
    }

    public static  Intent gotoRootPermission(Context context) {
        return action.gotoRootPermission(context);
    }

    public static  boolean hasFloatWindowPermission(Context context) {
        return action.hasFloatWindowPermission(context);
    }

    public static  Intent gotoFloatWindowPermission(Context context) {
        return action.gotoFloatWindowPermission(context);
    }

    public static void toast(Context context){
        Toast.makeText(context,action.getClass().getSimpleName() +  " # " + RomDetector.getRomName(), Toast.LENGTH_SHORT).show();
    }
}
