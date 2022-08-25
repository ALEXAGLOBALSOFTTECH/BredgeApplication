package com.example.bredge.interests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bredge.R;
import com.example.bredge.login.LoginActivity;
import com.example.bredge.signup.SignupActivity;
import com.example.bredge.socialconnect.SocialConnectedActivity;

public class InterestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

    }

    public void social(View view) {
        Intent intent=new Intent(InterestsActivity.this, SocialConnectedActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}