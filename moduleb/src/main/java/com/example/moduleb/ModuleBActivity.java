package com.example.moduleb;

import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.basemodule.ARouterPath;
import com.example.basemodule.BaseActivity;


@Route(path = ARouterPath.PATH_MOUDULE_B)
public class ModuleBActivity extends BaseActivity {

    @Autowired(name = "key")
    String data;
    /**
     * TextView
     */
    private TextView mTextViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moduleb_activity_module_b);
        ARouter.getInstance().inject(this);
        initView();
    }
    private void initView() {
        mTextViewB = (TextView) findViewById(R.id.textViewB);
        mTextViewB.setText(data);
    }
}
