package com.example.tih.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class historyResult extends AppCompatActivity {

    Button btn;
    TextView yourAnswer;
    TextView yourAnswer1;
    TextView yourAnswer2;
    TextView yourAnswer3;
    String scoreText;
    private String answer,answer2,answer1;
    int score =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_result);

        //Get Intents
        answer = getIntent().getStringExtra("answer");
        answer1 = getIntent().getStringExtra("answer1");
        answer2 = getIntent().getStringExtra("answer2");
        score = getIntent().getIntExtra("score",0);
        scoreText =getIntent().getStringExtra("scoreH");
        //Assigning
        yourAnswer = (TextView)findViewById(R.id.youranswer1);
        yourAnswer1 = (TextView)findViewById(R.id.youranswer2);
        yourAnswer2 = (TextView)findViewById(R.id.youranswer3);
        yourAnswer3 = (TextView) findViewById(R.id.scoreH);
        yourAnswer.setText("Your Answer: "+answer);
        yourAnswer1.setText("Your Answer: "+answer1);
        yourAnswer2.setText("Your Answer: "+answer2);
        yourAnswer3.setText("Your Score is: "+score);

        btn =(Button)findViewById(R.id.buttonq1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(historyResult.this,quiz.class);
                startActivity(i);
            }
        });
    }
}
