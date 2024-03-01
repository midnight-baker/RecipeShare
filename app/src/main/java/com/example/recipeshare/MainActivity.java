package com.example.recipeshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin;
    TextView forgotPassword;
    TextView registerSignUp;
    ImageButton loginWGoolge;
    ImageButton loginWMicrosoft;
    ImageButton loginWFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Establish Buttons/Links
        buttonLogin = findViewById(R.id.buttonLogin); //Establish Login Button
        forgotPassword = findViewById(R.id.textViewForgotPassword);//Establish Forgot Password Link
        registerSignUp = findViewById(R.id.textViewRegister);//Establish Sign Up Link
        loginWGoolge = findViewById(R.id.imageSignInWithGoogle);//Establish Google Login Link
        loginWMicrosoft = findViewById(R.id.imageSignInWithMicrosoft);//Establish Microsoft Login Link
        loginWFacebook = findViewById(R.id.imageSignInWithFacebook);//Establish Facebook Login Link

        //Set Buttons/Links Listeners
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });//Set Login Button Listener & Link to Home Page

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, forgot_password.class);
                startActivity(intent);
            }
        });//Set Forgot Password Link & Listener

        registerSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sign_up.class);
                startActivity(intent);
            }
        });//Set Sign Up/Register Link & Listener

        loginWGoolge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, placeholder.class);
                startActivity(intent);
            }
        });//Set Google Login Link & Listener

        loginWMicrosoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, placeholder.class);
                startActivity(intent);
            }
        });//Set Microsoft Login Link & Listener

        loginWFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, placeholder.class);
                startActivity(intent);
            }
        });//Set Facebook Login Link & Listener


    }
}