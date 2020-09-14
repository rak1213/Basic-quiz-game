package com.rak12.quizgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button tb;
    private Button fb;
    private TextView qt;
    private ImageButton bb;
    private ImageButton nb;
    private int i = 0;
    private question[] qb = new question[]{
            new question(R.string.q1, true),
            new question(R.string.q2, false),
            new question(R.string.q3, false),
            new question(R.string.q4, true),
            new question(R.string.q5, true),
            new question(R.string.q6, true),
            new question(R.string.q7, false),
            new question(R.string.q8, false),
            new question(R.string.q9, false),
            new question(R.string.q3, true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = findViewById(R.id.tb);
        fb = findViewById(R.id.fb);
        qt = findViewById(R.id.t1);
        nb = findViewById(R.id.nextbutton);
        bb=findViewById(R.id.backbutton);
        tb.setOnClickListener(this);
        fb.setOnClickListener(this);
        nb.setOnClickListener(this);
        bb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tb:
                correctans(true);
                break;
            case R.id.fb:
                correctans(false);
                break;
            case R.id.nextbutton:
                i = (i + 1) % qb.length;
                qt.setText(qb[i].getAri());
                break;
            case R.id.backbutton:
                if(i>0)
                {
                    i =i-1;
                    qt.setText(qb[i].getAri());
                }
        }
    }

    private void correctans(boolean ans) {
        boolean actualans = qb[i].isAt();
        int id;
        if (ans == actualans) {
            id = R.string.c;
        } else {
            id = R.string.i;
        }
        Toast.makeText(this,id, Toast.LENGTH_SHORT).show();
    }
}
