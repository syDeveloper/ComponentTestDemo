package com.example.modulemain;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.basemodule.ARouterPath;
import com.example.basemodule.BaseActivity;


public class MainActivity extends BaseActivity {
    /**
     * toA
     */
    private Button mModulemainA;
    /**
     * toB
     */
    private Button mModulemainB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulemain_activity_main);
        initView();
        initEvent();
    }

    private void initEvent() {
        mModulemainA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(ARouterPath.PATH_MOUDULE_A).navigation();

            }
        });

        mModulemainB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(ARouterPath.PATH_MOUDULE_B).withString("key","传递的数据").navigation();

            }
        });
    }

    private void initView() {
        mModulemainA = (Button) findViewById(R.id.modulemain_a);
        mModulemainB = (Button) findViewById(R.id.modulemain_b);
    }

}
