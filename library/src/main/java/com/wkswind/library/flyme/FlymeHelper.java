package com.wkswind.library.flyme;

import android.content.Context;
import android.content.Intent;

import com.wkswind.library.base.ThirdPartyROMHelper;

/**
 * Created by Administrator on 2015-11-23.
 */
public class FlymeHelper extends ThirdPartyROMHelper {
    @Override
    public Intent gotoPermissionManage(Context context) {
        return gotoAppDetails(context);
    }

    @Override
    public Intent gotoAutoStartPermission(Context context) {
        return gotoAppDetails(context);
    }

    @Override
    public Intent gotoRootPermission(Context context) {
        return null;
    }

    @Override
    public Intent gotoFloatWindowPermission(Context context) {
        return gotoAppDetails(context);
    }
}
