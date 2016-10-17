package com.example.tih.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.tih.myquiz.R.id.scoreH;

public class history extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{


    Button btn;
    String scoreH;
    int finalscore = 0;
    RadioGroup rg1, rg2, rg3;
    public String answer = "";
    public String answer1 = "";
    public String answer2 = "";
    public String expectedAnswer = "1994";
    public String expectedAnswer1 = "Nelson Mandela";
    public String expectedAnswer2 = "ANC";
    RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        //Assigning
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        rg3 = (RadioGroup) findViewById(R.id.rg3);
        rbtn1 = (RadioButton) findViewById(R.id.D1);
        rbtn2 = (RadioButton) findViewById(R.id.D2);
        rbtn3 = (RadioButton) findViewById(R.id.a1);
        rbtn4 = (RadioButton) findViewById(R.id.a2);
        rbtn5 = (RadioButton) findViewById(R.id.r1);
        rbtn6 = (RadioButton) findViewById(R.id.r2);

        rg1.setOnCheckedChangeListener(this);
        rg2.setOnCheckedChangeListener(this);
        rg3.setOnCheckedChangeListener(this);

        btn = (Button)findViewById(R.id.historybtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display();
                Intent i = new Intent(history.this,historyResult.class);
                i.putExtra("answer", answer);
                i.putExtra("answer1", answer1);
                i.putExtra("answer2", answer2);
                i.putExtra("score", finalscore);
                i.putExtra("scoreH",scoreH);
                startActivity(i);
                finalscore = 0;
            }
        });
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //RadioGroup1
        if (checkedId == R.id.D1) {
            answer = rbtn1.getText().toString();
        } else if (checkedId == R.id.D2) {
            answer = rbtn2.getText().toString();
        }
        //RadioGroup2
        if (checkedId == R.id.a1) {
            answer1 = rbtn3.getText().toString();
        } else if (checkedId == R.id.a2) {
            answer1 = rbtn4.getText().toString();
        }
        //RadioGroup3
        if (checkedId == R.id.r1) {
            answer2 = rbtn5.getText().toString();
        } else if (checkedId == R.id.r2) {
            answer2 = rbtn6.getText().toString();
        }
    }


    public void display() {
        if (answer.equals(expectedAnswer)) {
            finalscore += 1;
        }
        if (answer1.equals(expectedAnswer1)) {
            finalscore += 1;
        }
        if (answer2.equalsIgnoreCase(expectedAnswer2)) {
            finalscore += 1;
        };

    }
}

