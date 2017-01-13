package com.muddzdev.viewtobitmap;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.muddzdev.viewtobitmaplibrary.ViewToBitmap;
import com.muddzdev.viewtobitmaplibrary.OnBitmapSaveListener;

public class MainActivity extends AppCompatActivity implements OnBitmapSaveListener{

    private RelativeLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PermissionRequester permissionRequester = new PermissionRequester(this, this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        permissionRequester.request();

        container = (RelativeLayout) findViewById(R.id.container);
    }


    public void bitmapSave(View v) {

        ViewToBitmap toBitmap = new ViewToBitmap(this, container, "ViewToBitmap Sample");
        toBitmap.setOnBitmapSaveListener(this);
        toBitmap.saveToBitmap();
    }


    @Override
    public void onBitmapSaved(final boolean isSaved, final String path) {

        runOnUiThread(new Runnable() {
            @Override
            public void run() {

                if (isSaved) {
                    Toast.makeText(MainActivity.this, "Bitmap Saved at; " + path, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
