package com.jd.demo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jd.demo.dagger.componet.activity.DaggerMainActivityComponet;
import com.jd.demo.dagger.module.activity.MainActivityModule;
import com.jd.demo.presenter.activity.BaseActivity;
import com.jd.demo.presenter.activity.MainActivityPresenter;
import com.jd.demo.util.Constant;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    private EditText content;
    private Button query;
    private TextView result;
    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initDagger();
        initView();
        initListener();
    }

    private void initDagger() {
        DaggerMainActivityComponet componet = (DaggerMainActivityComponet) DaggerMainActivityComponet.builder()
                .mainActivityModule(new MainActivityModule(this))
                .build();
        componet.in(this);
    }

    private void initListener() {
        query.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String city = content.getText().toString();
                presenter.getObserveBean(result, city, Constant.WEATHER_KEY);
            }
        });
    }

    private void initView() {
        content = (EditText) findViewById(R.id.city);
        query = (Button) findViewById(R.id.query);
        result = (TextView) findViewById(R.id.queryresult);
    }
}
