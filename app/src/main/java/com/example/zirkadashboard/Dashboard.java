package com.example.zirkadashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.zirkadashboard.base.BaseActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Dashboard extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @Override
    public int getFragmentLayout() {
        return R.layout.activity_dashboard;
    }
    @OnClick(R.id.dashboard_to_earnings)
    public void onButtonClick(){
        Intent i= new Intent(Dashboard.this,Earnings.class);
        startActivity(i);
    }
    @OnClick(R.id.dashboard_to_event)
    public void onButtonClickToEvent(){
        Intent i= new Intent(Dashboard.this,Events.class);
        startActivity(i);
    }
    @OnClick(R.id.dashboard_to_users)
    public void onButtonClickToUsers(){
        Intent i= new Intent(Dashboard.this,Users.class);
        startActivity(i);
    }
}
