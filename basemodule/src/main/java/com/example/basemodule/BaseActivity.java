package com.example.basemodule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.utilmodule.LogUtils;
import com.example.utilmodule.StringUtils;

public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        boolean result = StringUtils.isEmpty("test");
        LogUtils.d(getClass().getName(), "onCreate:" + result);
    }
}
