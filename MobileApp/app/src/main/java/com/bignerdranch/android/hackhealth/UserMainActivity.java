package com.bignerdranch.android.hackhealth;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserMainActivity extends AppCompatActivity {

    private FirebaseUser user;
    private TextView mWelcomeMessage;
    private String name;
    private Button mEmotionalButton;
    private Button mPhysicalButton;
    private Button mSocialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
        setTitle("Health Pal");
        mWelcomeMessage = (TextView) findViewById(R.id.welcomeMessage);

        user = FirebaseAuth.getInstance().getCurrentUser();
        name = user.getDisplayName();

        mWelcomeMessage.setText("Welcome!");

        mEmotionalButton = (Button) findViewById(R.id.emotionalButton);
        mPhysicalButton = (Button) findViewById(R.id.physicalButton);
        mSocialButton = (Button) findViewById(R.id.socialButton);

        mPhysicalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserMainActivity.this, PhysicalPageActivity.class);
                startActivity(intent);
            }
        });

        mEmotionalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserMainActivity.this, EmotionalPageActivity.class);
                startActivity(intent);
            }
        });

        mSocialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserMainActivity.this, SocialPageActivity.class);
                startActivity(intent);
            }
        });


    }
}
