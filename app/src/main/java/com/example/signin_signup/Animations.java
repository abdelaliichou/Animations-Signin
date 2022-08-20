package com.example.signin_signup;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;

public class Animations {
    static int DURATION1 = 750;
    static int DURATION2 = 350;
    static int DURATION3 = 450 ;
    static int DURATION4 = 550 ;
    static int DURATION5 = 650 ;
    static int DURATION6 = 750 ;


    public static void FromeRightToLeftCard(MaterialCardView itemView) {
        itemView.setTranslationX(itemView.getX() +900);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 900, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        // animatorTranslateX.setStartDelay(not_first_item ? DURATION : (i * DURATION));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION4);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeLeftToRight(TextView itemView) {

        itemView.setTranslationX(itemView.getX() - 900);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        //  animatorTranslateX.setStartDelay(not_first_item ? DURATION2 : (i * DURATION2));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION3);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeLeftToRight1(TextView itemView) {

        itemView.setTranslationX(itemView.getX() - 900);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        //  animatorTranslateX.setStartDelay(not_first_item ? DURATION2 : (i * DURATION2));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION4);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeLeftToRightlate(MaterialCardView itemView) {

        itemView.setTranslationX(itemView.getX() - 1500);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        animatorTranslateX.setStartDelay(2000);
        animatorTranslateX.setDuration(DURATION6+250);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeLeftToRightlateImage(ImageView itemView) {

        itemView.setTranslationX(itemView.getX() - 1500);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        animatorTranslateX.setStartDelay(3500);
        animatorTranslateX.setDuration(DURATION6);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeLeftToRight2(TextView itemView) {

        itemView.setTranslationX(itemView.getX() - 900);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        //  animatorTranslateX.setStartDelay(not_first_item ? DURATION2 : (i * DURATION2));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION5);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeLeftToRight3(TextView itemView) {

        itemView.setTranslationX(itemView.getX() - 900);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        //  animatorTranslateX.setStartDelay(not_first_item ? DURATION2 : (i * DURATION2));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION6);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromRightToLeft1(TextView itemView) {

        itemView.setTranslationX(itemView.getX() + 300);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        //  animatorTranslateX.setStartDelay(not_first_item ? DURATION2 : (i * DURATION2));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION3);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeDownToUp(LinearLayout itemView) {

        itemView.setTranslationY(itemView.getY() + 300);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationY", itemView.getY() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        // animatorTranslateX.setStartDelay(not_first_item ? DURATION1 : (i * DURATION1));
        animatorTranslateX.setDuration((true ? 2 : 1) * DURATION1);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeRightToLeftEditetext2(TextInputLayout itemView) {

        itemView.setTranslationX(itemView.getX() - 800);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        //  animatorTranslateX.setStartDelay(not_first_item ? DURATION2 : (i * DURATION2));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION4);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeRightToLeftEditetext3(TextInputLayout itemView) {

        itemView.setTranslationX(itemView.getX() - 800);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        //  animatorTranslateX.setStartDelay(not_first_item ? DURATION2 : (i * DURATION2));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION5);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeRightToLeftLinear1(LinearLayout itemView) {

        itemView.setTranslationX(itemView.getX() + 800);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() - 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        //  animatorTranslateX.setStartDelay(not_first_item ? DURATION2 : (i * DURATION2));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION6);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

    public static void FromeRightToLeftLinear2(LinearLayout itemView) {

        itemView.setTranslationX(itemView.getX() - 800);
        itemView.setAlpha(0.f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorTranslateX = ObjectAnimator.ofFloat(itemView, "translationX", itemView.getX() + 300, 0);
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(itemView, "alpha", 1.f);
        ObjectAnimator.ofFloat(itemView, "alpha", 0.f).start();
        //  animatorTranslateX.setStartDelay(not_first_item ? DURATION2 : (i * DURATION2));
        animatorTranslateX.setDuration((/*not_first_item*/true ? 2 : 1) * DURATION6);
        animatorSet.playTogether(animatorTranslateX, animatorAlpha);
        animatorSet.start();
    }

}
