package com.example.bredge.verification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bredge.R;
import com.example.bredge.profile.UpdateProfileActivity;
import com.example.bredge.signup.SignupActivity;

public class VerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
    }

    public void profile(View view) {
        Intent intent=new Intent(VerificationActivity.this, UpdateProfileActivity.class);
        startActivity(intent);
    }
}