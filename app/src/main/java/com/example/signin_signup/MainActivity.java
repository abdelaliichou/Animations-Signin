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

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SettingTheUi();
        SettingAnimation();

        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Second.class));
                finish();
            }
        });
        findViewById(R.id.login_button).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(MainActivity.this,Welcom.class));
                return true;
            }
        });
    }

    public void SettingAnimation(){
        findViewById(R.id.main_img).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in));
        findViewById(R.id.linear2).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in4));
        Animations.FromeLeftToRight2(findViewById(R.id.email_text));
        Animations.FromeLeftToRight3(findViewById(R.id.password_text));
        Animations.FromeRightToLeftEditetext2(findViewById(R.id.email_parent_login));
        Animations.FromeRightToLeftEditetext3(findViewById(R.id.password_parent_login));
        Animations.FromRightToLeft1(findViewById(R.id.forgot_password_text));
        Animations.FromeRightToLeftCard(findViewById(R.id.login_button));
        Animations.FromeDownToUp(findViewById(R.id.support_linear_layout));
        Animations.FromeLeftToRight(findViewById(R.id.main_text));
        Animations.FromeLeftToRight1(findViewById(R.id.second_main_text));
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void SettingTheUi(){
        // setting the keyboard
        Utils.setUpKeybaord(findViewById(R.id.succes),MainActivity.this);

        getSupportActionBar().hide();
        this.getWindow().setStatusBarColor(this.getColor(R.color.colorfirst));

//        // to change the color of the icons in status bar to dark
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//            this.getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS, APPEARANCE_LIGHT_STATUS_BARS);
//        }
        // to change the color of the icons in the navigation bar to dark
        getWindow().setNavigationBarColor(ContextCompat.getColor(MainActivity.this,R.color.white)); //setting bar color
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            this.getWindow().getDecorView().getWindowInsetsController().setSystemBarsAppearance(WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS, WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS);
        }
    }

}