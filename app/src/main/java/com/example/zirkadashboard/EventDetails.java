package com.example.zirkadashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.zirkadashboard.base.BaseActivity;

public class EventDetails extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public int getFragmentLayout() {
        return R.layout.activity_event_details;
    }
}
