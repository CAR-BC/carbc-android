package com.example.madhushika.carbc_android_v2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import Fragments.ConfirmTransaction;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        android.support.v4.app.Fragment myFragment = null;
        Class fragmentClass;

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;

                case R.id.navigation_add_event:
                    fragmentClass = ConfirmTransaction.class;
                    return true;
//                    mTextMessage.setText(R.string.title_dashboard);
//                    return true;
                case R.id.navigation_view_vehicle:
                    mTextMessage.setText("search vehicle");
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.navigation_my_vehicle:
                    mTextMessage.setText("my vehicle");
                    return true;
            }try {
                myFragment = (android.support.v4.app.Fragment) fragmentClass.newInstance();

            }catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
