package com.app.chatx;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.spark.submitbutton.SubmitButton;

public class StartActivity extends AppCompatActivity {




    Animation rotateAnimation;
    ImageView chat_x;
    SubmitButton login;
    SubmitButton register;

    FirebaseUser firebaseUser;


    @Override
    protected void onStart() {
        super.onStart();



        //check if user is null

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        if (firebaseUser != null){
            Intent intent = new Intent(StartActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }


        login = findViewById(R.id.login);
        register = findViewById(R.id.btn_register);
        chat_x = findViewById(R.id.chat_x);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(StartActivity.this,LoginActivity.class));

                    }
                },800);


            }
        });



        register.setOnClickListener(new View.OnClickListener() {
            @Override

                public void onClick (View view){
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(StartActivity.this, RegisterActivity.class));

                        }
                    }, 800);

                }

        });

        rotateAnimation();

    }

    private void rotateAnimation(){
        rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        chat_x.startAnimation(rotateAnimation);
    }

}
