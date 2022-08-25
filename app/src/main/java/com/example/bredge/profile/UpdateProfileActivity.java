package com.example.bredge.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.bredge.R;
import com.example.bredge.interests.InterestsActivity;
import com.example.bredge.login.LoginActivity;
import com.example.bredge.signup.SignupActivity;

public class UpdateProfileActivity extends AppCompatActivity {
Spinner select_gender,marital_status;
    // create array of Strings
    // and store name of courses
    String[] gender = { "Select", "Male","Female", "Other"};
    String[] Marital_st1 = { "Select", "Married","UnMarried"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        initeView();

        // Create the instance of ArrayAdapter
        // having the list of courses
        ArrayAdapter ad = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, gender);
        ArrayAdapter marital_st = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, Marital_st1);

        // set simple layout resource file
        // for each item of spinner
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        marital_st.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Set the ArrayAdapter (ad) data on the
        // Spinner which binds data to spinner
        select_gender.setAdapter(ad);
        marital_status.setAdapter(marital_st);
        marital_status.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),
                                Marital_st1[i],
                                Toast.LENGTH_LONG)
                        .show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        select_gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),
                                gender[i],
                                Toast.LENGTH_LONG)
                        .show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void initeView() {
        select_gender=findViewById(R.id.select_gender);
        marital_status=findViewById(R.id.marital_status);
    }
    public void intrest(View view) {
        Intent intent=new Intent(UpdateProfileActivity.this, InterestsActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}