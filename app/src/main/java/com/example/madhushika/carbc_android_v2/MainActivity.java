package com.example.madhushika.carbc_android_v2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import Fragments.ConfirmTransaction;
import Fragments.Home;
import Fragments.MyHistory;
import Fragments.SearchVehicle;
import Fragments.Service_and_Repair;
import Fragments.Service_repair_map;
import Fragments.Transaction_Registered;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bottomnavigation);
        navigationView.setOnNavigationItemSelectedListener( new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment myFragment = null;

                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        myFragment = Home.newInstance();
                        break;

                    case R.id.navigation_add_event:
                        myFragment = Transaction_Registered.newInstance();
                        break;
                    case R.id.navigation_view_vehicle:
//                        myFragment = SearchVehicle.newInstance();
                        myFragment = Service_and_Repair.newInstance();
                        break;
                    case R.id.navigation_notifications:
                        myFragment =  ConfirmTransaction.newInstance();
                        break;
                    case R.id.navigation_my_vehicle:
                        myFragment = MyHistory.newInstance();
                        break;

                }
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, myFragment);
                transaction.commit();
                return true;
            }
        });

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.frame_layout, Home.newInstance());
        transaction.commit();
    }

}
