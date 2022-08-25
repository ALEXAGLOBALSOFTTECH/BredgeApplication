package com.example.bredge.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import com.example.bredge.R;
import com.example.bredge.feed.FeedActivity;
import com.example.bredge.signup.SignupActivity;
import com.example.bredge.utils.AnimatorUtils;
import com.example.bredge.verification.VerificationActivity;
import com.ogaclejapan.arclayout.ArcLayout;

import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


    }


    public void feed(View view) {
        Intent intent=new Intent(DashboardActivity.this, FeedActivity.class);
        startActivity(intent);
    }
}