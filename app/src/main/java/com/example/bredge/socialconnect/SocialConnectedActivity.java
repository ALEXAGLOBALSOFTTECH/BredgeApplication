package com.example.bredge.socialconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bredge.R;
import com.example.bredge.fallow.PeopleYouKnowActivity;
import com.example.bredge.interests.InterestsActivity;

public class SocialConnectedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_connected);
    }

    public void follow(View view) {
        Intent intent=new Intent(SocialConnectedActivity.this, PeopleYouKnowActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}