package com.example.bredge.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bredge.R;
import com.example.bredge.verification.VerificationActivity;

public class SignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void verification(View view) {
        Intent intent=new Intent(SignupActivity.this, VerificationActivity.class);
        startActivity(intent);
    }
}