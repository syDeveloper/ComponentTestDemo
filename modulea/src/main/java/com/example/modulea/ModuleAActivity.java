package com.example.modulea;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.basemodule.ARouterPath;
import com.example.basemodule.BaseActivity;

@Route(path = ARouterPath.PATH_MOUDULE_A)
public class ModuleAActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulea_activity_module_a);
    }
}
