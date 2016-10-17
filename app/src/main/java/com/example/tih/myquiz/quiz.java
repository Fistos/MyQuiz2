package com.example.tih.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quiz extends AppCompatActivity {

    Button firstscreenbtns,firstscreenbtnl,firstscreenbtnh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //@is for the President button
        firstscreenbtns = (Button) findViewById(R.id.btn1);
        firstscreenbtns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(quiz.this,President.class);
                startActivity(in);

            }
        });
        //@is for the Language button
        firstscreenbtnl =(Button) findViewById(R.id.btn2);
        firstscreenbtnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quiz.this,languages.class);
                startActivity(intent);
            }
        });

        //@is for the history button
        firstscreenbtnh = (Button) findViewById(R.id.btn3);
        firstscreenbtnh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(quiz.this,history.class);
                startActivity(i);
            }
        });
    }
}
