package com.example.wassim.dynamicgrid;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StartFragment st = new StartFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,st,"tag").commit();
    }



    public void startGame(View v) {

        System.out.println("clicked");
        PlayFragment pl = new PlayFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,pl,"tag").commit();

        // does something very interesting
    }
}
