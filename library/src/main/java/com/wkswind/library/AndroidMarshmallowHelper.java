package com.wkswind.library;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

import com.wkswind.library.base.AndroidHelper;

/**
 * Helper for Android M <br>
 * only works above Android M {@link android.os.Build.VERSION_CODES#M}
 * Created by Administrator on 2015-12-4.
 */
@TargetApi(Build.VERSION_CODES.M)
public class AndroidMarshmallowHelper extends AndroidHelper {
    @Override
    public Intent gotoPermissionManage(Context context) {
        return null;
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
        Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                Uri.parse("package:" + context.getPackageName()));
        return intent;
    }

    @Override
    public boolean hasFloatWindowPermission(Context context) {
        return Settings.canDrawOverlays(context);
//        return super.hasFloatWindowPermission(context);
    }
}
