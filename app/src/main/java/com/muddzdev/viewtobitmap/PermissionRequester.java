package com.muddzdev.viewtobitmap;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/**
 * Created by Muddz on 11-01-2017.
 */

public class PermissionRequester implements ActivityCompat.OnRequestPermissionsResultCallback {


    public static final int PERMISSION_REQUEST_CODE = 1;
    private int permissionCheck;
    private Context context;
    private String permission;
    private Activity activity;
    private PermissionListener permissionListener;


    public PermissionRequester(Context context, Activity activity, String permission) {
        this.context = context;
        this.activity = activity;
        this.permission = permission;
    }

    public void setPermissionListener(PermissionListener permissionListener) {
        this.permissionListener = permissionListener;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    private boolean checkCurrentPermission() {

        boolean result;

        if (ContextCompat.checkSelfPermission(context, getPermission()) != PackageManager.PERMISSION_GRANTED) {
            result = false;
            requestPermission();
        } else {
            result = true;
        }

        return result;
    }


    private void requestPermission() {

        String[] requstedPermission = {getPermission()};
        ActivityCompat.requestPermissions(activity, requstedPermission, PERMISSION_REQUEST_CODE);

    }


    public void request(){
        checkCurrentPermission();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch (requestCode) {
            case PERMISSION_REQUEST_CODE:

                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    permissionListener.onPermissionGranted(true);

                } else {
                    permissionListener.onPermissionGranted(false);
                }

                break;
        }
    }


    public interface PermissionListener {
        void onPermissionGranted(boolean granted);
    }
}
