package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setNavigationGraph();
    }

    private void initView() {
        bottomNavigation = findViewById(R.id.bottom_navigation);
    }

    private void setNavigationGraph() {
        NavController navController = Navigation.findNavController(this, R.id.my_nav_host_fragment);
        NavigationUI.setupWithNavController(bottomNavigation, navController);
        bottomNavigation.setItemIconTintList(null);
    }

}