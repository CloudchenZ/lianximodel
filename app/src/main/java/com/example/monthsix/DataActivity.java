package com.example.monthsix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import com.example.monthsix.databinding.ActivityDataBinding;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_data);
        UserBean userBean = new UserBean("亚东", "女人");
        viewDataBinding.setUser(userBean);
    }
}
