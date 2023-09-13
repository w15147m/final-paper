package com.example.stylepracticedesingn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button , button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       button = findViewById(R.id.btn);
       button1 = findViewById(R.id.btn1);
       textView = findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setTextSize(50);
                textView.setTextColor(getResources().getColor(R.color.newTextColor));
                int newStyle = Typeface.ITALIC;
                textView.setTypeface(null, newStyle);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextSize(30);
                textView.setTextColor(getResources().getColor(R.color.newTextColor1));
                int newStyle = Typeface.BOLD;
                textView.setTypeface(null, newStyle);
            }
        });





















//       style practice  desingn an app with buutons to change text color, font size and style in a textView in android stoudio java
/*

        I'm not good at programming and especially at android, I've made 2 buttons one for making text size big, one for making text size small, and also i made condition that when text size is reached to limit size the button will stop increasing or decreasing text size. it didn't work, when i press btnSmall or btnBig nothing happen, I don't know what is missing here, please i need help... here's what I've done

        Java file:

        private Button btnSmallTxt, btnBigTxt;
        private tvAdminPosts;
        int txtSize = 14;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.client);
            btnSmallTxt = (Button)findViewById(R.id.btnSmall);
            btnBigTxt = (Button)findViewById(R.id.btnBig);

            btnSmallTxt.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (tvAdminPosts.getTextSize() == 15||tvAdminPosts.getTextSize() ==16||tvAdminPosts.getTextSize() ==17|tvAdminPosts.getTextSize() ==18){
                        txtSize--;
                        tvAdminPosts.setTextSize(txtSize);
                    } else {
                        txtSize += 0;
                        tvAdminPosts.setTextSize(txtSize);
                    }
                }
            });

            btnBigTxt.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if (tvAdminPosts.getTextSize() == 14 ||tvAdminPosts.getTextSize() == 15 || tvAdminPosts.getTextSize() == 16 || tvAdminPosts.getTextSize() == 17){
                        txtSize++;
                        tvAdminPosts.setTextSize(txtSize);
                    } else if (tvAdminPosts.getTextSize() == 18) {
                        txtSize+= 0;
                        tvAdminPosts.setTextSize(txtSize);
                    } else{
                        txtSize+= 0;
                        tvAdminPosts.setTextSize(txtSize);
                    }
                }

        */


    }
}