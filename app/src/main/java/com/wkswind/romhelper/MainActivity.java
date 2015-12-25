package com.wkswind.romhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wkswind.library.base.RomHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        RomHelper.toast(this);
//        Toast.makeText(MainActivity.this, new RomHelper().getClass().getSimpleName() + "", Toast.LENGTH_SHORT).show();
    }
}
