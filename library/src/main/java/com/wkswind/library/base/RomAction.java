package com.wkswind.library.base;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2015-11-23.
 */
public interface RomAction {
    /**
     * 判断是否第三方ROM
     * @return
     */
    public boolean isThridPartyROM();
    /**
     * Rom版本号，原生系统为19，20，21等api level；小米等为v5,v6,v7等
     * @param context
     * @return
     */
    public String getRomVersionName(Context context);
    /**
     * 跳转至App详情
     * @param context
     * @return
     */
    public Intent gotoAppDetails(Context context);

    /**
     * 是否有权限管理
     * @return
     */
    public boolean hasPermissionManager();
    /**
     * 跳转至权限管理界面
     * @param context
     * @return
     */
    public Intent gotoPermissionManage(Context context);

    /**
     * whether grant the auto-start permission
     * @param context
     * @return
     */
    public boolean isAutoStart(Context context);
    /**
     * 跳转至自启动权限设置界面
     * @param context
     * @return
     */
    public Intent gotoAutoStartPermission(Context context);

    public boolean isRooted(Context context);
    /**
     * 跳转至ROOT权限设置界面
     * @param context
     * @return
     */
    public Intent gotoRootPermission(Context context);

    /**
     * whether grant the float-window permission, as the permission "SYSTEM_ALERT_WINDOW"
     * declared in AndroidManifest.xml
     * @param context
     * @return
     */
    public boolean hasFloatWindowPermission(Context context);
    /**
     * 跳转至浮窗权限设置界面
     * @param context
     * @return
     */
    public Intent gotoFloatWindowPermission(Context context);


}
