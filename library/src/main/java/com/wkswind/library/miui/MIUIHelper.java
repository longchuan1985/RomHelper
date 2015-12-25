package com.wkswind.library.miui;

import android.content.Context;
import android.content.Intent;

import com.wkswind.library.base.ThirdPartyROMHelper;
import com.wkswind.library.base.detector.MIUIDetector;

/**
 * Created by Administrator on 2015-11-23.
 */
public class MIUIHelper extends ThirdPartyROMHelper {
    @Override
    public String getRomVersionName(Context context) {
        return MIUIDetector.getMIUIVersionName();
    }

    @Override
    public Intent gotoPermissionManage(Context context) {
        String s = context.getPackageName();
        boolean hasAppPermissionEditor = MIUIDetector.isMIUIV6() || MIUIDetector.isMIUIV7();
        if (hasAppPermissionEditor) {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent.putExtra("extra_pkgname", s);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            return intent;
        } else {
            return gotoAppDetails(context);
        }
    }

    @Override
    public Intent gotoAutoStartPermission(Context context) {
        Intent intent = new Intent();
        intent.setAction("miui.intent.action.OP_AUTO_START");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        return intent;
    }

    @Override
    public Intent gotoRootPermission(Context context) {
        Intent intent = new Intent();
        intent.setAction("miui.intent.action.ROOT_MANAGER");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        return intent;
    }

    @Override
    public Intent gotoFloatWindowPermission(Context context) {
        return gotoAppDetails(context);
    }

}
