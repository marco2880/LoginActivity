package com.example.estudio.loginactivity.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.estudio.loginactivity.R;
import com.example.estudio.loginactivity.view.fragment.ProfileFragment;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
    }


    public void goProfileFracment(View view){
        Intent intent = new Intent(this, ProfileFragment.class);
        startActivity(intent);


    }



    public void goHomeFracment(View view){
        Intent intent = new Intent(this, ProfileFragment.class);
        startActivity(intent);


    }


    public void goSearchFracment(View view){
        Intent intent = new Intent(this, ProfileFragment.class);
        startActivity(intent);


    }

}
