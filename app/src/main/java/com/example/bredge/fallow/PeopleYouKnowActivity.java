package com.example.bredge.fallow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.example.bredge.R;
import com.example.bredge.login.LoginActivity;
import com.example.bredge.signup.SignupActivity;
import com.example.bredge.successfulaccount.Successful_AccountyActivity;

import java.util.ArrayList;
import java.util.List;

public class PeopleYouKnowActivity extends AppCompatActivity {

    RecyclerView follow_recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people_you_know);
        follow_recycler=findViewById(R.id.follow_recycler);
        ArrayList<FallowModel>list=new ArrayList<>();
        list.add(new FallowModel("Mike Gosling",R.drawable.img,"Follow"));
        list.add(new FallowModel("Tahira Laetitia",R.drawable.img,"Follow"));
        list.add(new FallowModel("Benjamin Hyacinthe",R.drawable.img,"Follow"));
        list.add(new FallowModel("Elpidius Chaska",R.drawable.img,"Follow"));
        list.add(new FallowModel("Heidrich Keanna",R.drawable.img,"Follow"));
        list.add(new FallowModel("Marwin Callista",R.drawable.img,"Follow"));
        list.add(new FallowModel("Tiwonge Nacho",R.drawable.img,"Follow"));
        list.add(new FallowModel("Meryem Alaya",R.drawable.img,"Follow"));
        list.add(new FallowModel("Meryem Alaya",R.drawable.img,"Follow"));
        FallowAdapter fallowAdapter=new FallowAdapter(PeopleYouKnowActivity.this,list);
        follow_recycler.setAdapter(fallowAdapter);

    }

    public void accountSuccess(View view) {
        Intent intent=new Intent(PeopleYouKnowActivity.this, Successful_AccountyActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}