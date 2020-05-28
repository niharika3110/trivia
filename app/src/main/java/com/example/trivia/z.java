package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class z extends AppCompatActivity {
    Button exit;
    ImageButton next;
    ImageButton previous;
    TextView questions;
    TextView atext,btext,ctext,dtext;
    ImageButton abutton,bbutton,cbutton,dbutton;
    TextView scorez;

    int QuestionNnumber=-1;
    Integer score=0;

    zquestions[] questionBankz=new zquestions[]{
            new zquestions(R.string.z1,"a"),
            new zquestions(R.string.z2,"c"),
            new zquestions(R.string.z3,"b"),
            new zquestions(R.string.z4,"c"),
            new zquestions(R.string.z5,"d"),
            new zquestions(R.string.z6,"a"),
            new zquestions(R.string.z7,"c"),
            new zquestions(R.string.z8,"b"),
            new zquestions(R.string.z9,"c"),
            new zquestions(R.string.z10,"d"),

    };

    String[] a=new String[]{
            "z1a","z2a","z3a","z4a","z5a","z6a","z7a","z8a","z9a","z10a"
    };
    String[] b=new String[]{
            "z1b","z2b","z3b","z4b","z5b","z6b","z7b","z8b","z9b","z10b"
    };
    String[] c=new String[]{
            "z1c","z2c","z3c","z4c","z5c","z6c","z7c","z8c","z9c","z10c"
    };
    String[] d=new String[]{
            "z1d","z2d","z3d","z4d","z5d","z6d","z7d","z8d","z9d","z10d"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z);

        exit=findViewById(R.id.exitz);
        next=findViewById(R.id.nextz);
        previous=findViewById(R.id.previousz);
        questions=findViewById(R.id.textViewz);
        atext=findViewById(R.id.atextz);
        btext=findViewById(R.id.btextz);
        ctext=findViewById(R.id.ctextz);
        dtext=findViewById(R.id.dtextz);
        abutton=findViewById(R.id.abuttonz);
        bbutton=findViewById(R.id.bbuttonz);
        cbutton=findViewById(R.id.cbuttonz);
        dbutton=findViewById(R.id.dbuttonz);
        scorez=findViewById(R.id.scorez);


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(z.this ,MainActivity.class);
                startActivity(intent);
            }
        });

        abutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionNnumber != -1) {
                    checkanswer("a");
                    QuestionNnumber = QuestionNnumber + 1;
                    if (QuestionNnumber == 10) {
                        questions.setText("Game over...\n Your score is " + score.toString());
                        atext.setText(" ");
                        btext.setText("");
                        ctext.setText(" ");
                        dtext.setText("");
                    } else {
                        questions.setText(questionBankz[QuestionNnumber].getQuestionId());
                        atext.setText(a[QuestionNnumber]);
                        btext.setText(b[QuestionNnumber]);
                        ctext.setText(c[QuestionNnumber]);
                        dtext.setText(d[QuestionNnumber]);
                    }
                }
                else
                    questions.setText("Press next or exit to continue");
            }
        });
        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionNnumber != -1) {
                    checkanswer("b");
                    QuestionNnumber = QuestionNnumber + 1;
                    if (QuestionNnumber == 10) {
                        questions.setText("Game over...\n Your score is " + score.toString());
                        atext.setText(" ");
                        btext.setText("");
                        ctext.setText(" ");
                        dtext.setText("");
                    } else {
                        questions.setText(questionBankz[QuestionNnumber].getQuestionId());
                        atext.setText(a[QuestionNnumber]);
                        btext.setText(b[QuestionNnumber]);
                        ctext.setText(c[QuestionNnumber]);
                        dtext.setText(d[QuestionNnumber]);
                    }
                }
                else
                    questions.setText("Press next or exit to continue");

            }
        });
        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionNnumber != -1) {
                    checkanswer("c");
                    QuestionNnumber = QuestionNnumber + 1;
                    if (QuestionNnumber == 10) {
                        questions.setText("Game over...\n Your score is " + score.toString());
                        atext.setText(" ");
                        btext.setText("");
                        ctext.setText(" ");
                        dtext.setText("");
                    } else {
                        questions.setText(questionBankz[QuestionNnumber].getQuestionId());
                        atext.setText(a[QuestionNnumber]);
                        btext.setText(b[QuestionNnumber]);
                        ctext.setText(c[QuestionNnumber]);
                        dtext.setText(d[QuestionNnumber]);
                    }

                }
                else
                    questions.setText("Press next or exit to continue");
            }
        });
        dbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionNnumber != -1) {
                    checkanswer("d");
                    QuestionNnumber = QuestionNnumber + 1;
                    if (QuestionNnumber == 10) {
                        questions.setText("Game over...\n Your score is " + score.toString());
                        atext.setText(" ");
                        btext.setText("");
                        ctext.setText(" ");
                        dtext.setText("");
                    } else {
                        questions.setText(questionBankz[QuestionNnumber].getQuestionId());
                        atext.setText(a[QuestionNnumber]);
                        btext.setText(b[QuestionNnumber]);
                        ctext.setText(c[QuestionNnumber]);
                        dtext.setText(d[QuestionNnumber]);
                    }
                }
                else
                    questions.setText("Press next or exit to continue");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuestionNnumber=QuestionNnumber+1;
                if(QuestionNnumber==10)
                {questions.setText("Game over...\n Your score is "+score.toString());
                    atext.setText(" ");
                    btext.setText("");
                    ctext.setText(" ");
                    dtext.setText("");}
                else
                {questions.setText(questionBankz[QuestionNnumber].getQuestionId());
                    atext.setText(a[QuestionNnumber]);
                    btext.setText(b[QuestionNnumber]);
                    ctext.setText(c[QuestionNnumber]);
                    dtext.setText(d[QuestionNnumber]);}
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuestionNnumber=QuestionNnumber-1;
                if(QuestionNnumber==-1)

                {
                    questions.setText("Press next to continue");
                    atext.setText(" ");
                    btext.setText("");
                    ctext.setText(" ");
                    dtext.setText("");
                }
                else
                {
                    questions.setText(questionBankz[QuestionNnumber].getQuestionId());
                    atext.setText(a[QuestionNnumber]);
                    btext.setText(b[QuestionNnumber]);
                    ctext.setText(c[QuestionNnumber]);
                    dtext.setText(d[QuestionNnumber]);
                }
            }
        });

    }

    public void checkanswer(String Answer){
        String actualAnswer=questionBankz[QuestionNnumber].getAnswer();
        int toast=0;
        if(Answer==actualAnswer){
            toast=R.string.correct;
            score=score+1;
            scorez.setText(score.toString());

        }
        else{
            toast=R.string.wrong;
        }
        Toast.makeText(z.this, toast, Toast.LENGTH_SHORT).show();


    }
}

