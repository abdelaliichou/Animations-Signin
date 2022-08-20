package com.example.signin_signup;

import static android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.animation.AnimationUtils;

import java.util.Timer;
import java.util.TimerTask;

public class Second extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        SettingTheUi();
        SettingAnimation();

        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Second.this,MainActivity.class));
                finish();
            }
        });
        findViewById(R.id.login_button).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(Second.this,Welcom.class));
                return true;
            }
        });
    }
    public void SettingAnimation(){

        findViewById(R.id.google).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in));
        findViewById(R.id.apple).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in));
        findViewById(R.id.main_img).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in2));
        findViewById(R.id.succes).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in3));
        Animations.FromeRightToLeftEditetext2(findViewById(R.id.email_parent_login));
        Animations.FromeRightToLeftEditetext3(findViewById(R.id.password_parent_login));
        Animations.FromeRightToLeftCard(findViewById(R.id.login_button));
        Animations.FromeRightToLeftLinear2(findViewById(R.id.or_login_with_layout));
        Animations.FromeRightToLeftLinear1(findViewById(R.id.support_linear_layout));
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void SettingTheUi(){
        // setting the keyboard
        Utils.setUpKeybaord(findViewById(R.id.succes),Second.this);

        getSupportActionBar().hide();
        this.getWindow().setStatusBarColor(this.getColor(R.color.white));

//        // to change the color of the icons in status bar to dark
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            this.getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
        }
        // to change the color of the icons in the navigation bar to dark
        getWindow().setNavigationBarColor(ContextCompat.getColor(Second.this,R.color.white)); //setting bar color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            this.getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS, WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS);
        }
    }

}