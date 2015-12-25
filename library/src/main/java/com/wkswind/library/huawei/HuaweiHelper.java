package com.wkswind.library.huawei;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.wkswind.library.base.ThirdPartyROMHelper;
import com.wkswind.library.base.detector.RomDetector;

/**
 * Created by Administrator on 2015-12-24.
 */
public class HuaweiHelper extends ThirdPartyROMHelper {
    @Override
    public Intent gotoPermissionManage(Context context) {
        Intent intent = new Intent("huawei.intent.action.NOTIFICATIONMANAGER");
        intent.putExtra("showTabsNumber", 1);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        return intent;
    }

    @Override
    public Intent gotoAutoStartPermission(Context context) {
        return gotoPermissionManage(context);
    }

    @Override
    public Intent gotoRootPermission(Context context) {
        return gotoPermissionManage(context);
    }

    @Override
    public Intent gotoFloatWindowPermission(Context context) {
        return gotoFloatWindowPermission(context);
    }

    @Override
    public boolean hasFloatWindowPermission(Context context) {
        if(!RomDetector.aboveVersion(Build.VERSION_CODES.KITKAT)){
            return true;
        }else{
            // TODO: 2015-12-24  
            return false;
        }
    }
}
