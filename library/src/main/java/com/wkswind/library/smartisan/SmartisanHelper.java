package com.wkswind.library.smartisan;

import android.content.Context;
import android.content.Intent;

import com.wkswind.library.base.ThirdPartyROMHelper;

/**
 * Created by Administrator on 2015-12-24.
 */
public class SmartisanHelper extends ThirdPartyROMHelper {
    @Override
    public Intent gotoPermissionManage(Context context) {
        Intent intent = new Intent("com.smartisanos.security.action.PACKAGE_OVERVIEW");
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        return intent;
    }

    @Override
    public Intent gotoAutoStartPermission(Context context) {
        return null;
    }

    @Override
    public Intent gotoRootPermission(Context context) {
        return null;
    }

    @Override
    public Intent gotoFloatWindowPermission(Context context) {
        return null;
    }
}
