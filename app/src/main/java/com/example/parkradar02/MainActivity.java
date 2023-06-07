package com.example.parkradar02;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.parkradar02.databinding.ActivityMainBinding;
import com.example.parkradar02.databinding.NavDrawerLayoutBinding;
import com.example.parkradar02.databinding.ToolbarLayoutBinding;
import com.google.firebase.auth.FirebaseAuth;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    private CircleImageView imgHeader;
    private TextView txtName, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.parkradar02.databinding.NavDrawerLayoutBinding navDrawerLayoutBinding = NavDrawerLayoutBinding.inflate(getLayoutInflater());
        setContentView(navDrawerLayoutBinding.getRoot());
        com.example.parkradar02.databinding.ActivityMainBinding activityMainBinding = navDrawerLayoutBinding.mainActivity;
        com.example.parkradar02.databinding.ToolbarLayoutBinding toolbarLayoutBinding = activityMainBinding.toolbar;

        setSupportActionBar(toolbarLayoutBinding.toolbar);

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                navDrawerLayoutBinding.navDrawer,
                toolbarLayoutBinding.toolbar,
                R.string.open_navigation_drawer,
                R.string.close_navigation_drawer
        );

        navDrawerLayoutBinding.navDrawer.addDrawerListener(toggle);
        toggle.syncState();

      /*  NavController navController = Navigation.findNavController(this, R.id.fragmentContainer);
        NavigationUI.setupWithNavController(
                navDrawerLayoutBinding.navigationView,
                navController
        );

        View headerLayout = navDrawerLayoutBinding.navigationView.getHeaderView(0);

        imgHeader = headerLayout.findViewById(R.id.imgHeader);
        txtName = headerLayout.findViewById(R.id.txtHeaderName);
        txtEmail = headerLayout.findViewById(R.id.txtHeaderEmail);

        getUserData();
    */


    }
}