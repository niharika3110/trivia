package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class x extends AppCompatActivity {
       Button exit;
    ImageButton next;
    ImageButton previous;
    TextView questions;
    TextView atext,btext,ctext,dtext;
    ImageButton abutton,bbutton,cbutton,dbutton;
    TextView scorex;

    int QuestionNnumber=-1;
    Integer score=0;

    xquestions[] questionBankx=new xquestions[]{
            new xquestions(R.string.x1,"a"),
            new xquestions(R.string.x2,"c"),
            new xquestions(R.string.x3,"b"),
            new xquestions(R.string.x4,"c"),
            new xquestions(R.string.x5,"d"),
            new xquestions(R.string.x6,"a"),
            new xquestions(R.string.x7,"c"),
            new xquestions(R.string.x8,"b"),
            new xquestions(R.string.x9,"c"),
            new xquestions(R.string.x10,"d"),

    };

    String[] a=new String[]{
            "x1a","x2a","x3a","x4a","x5a","x6a","x7a","x8a","x9a","x10a"
    };
    String[] b=new String[]{
            "x1b","x2b","x3b","x4b","x5b","x6b","x7b","x8b","x9b","x10b"
    };
    String[] c=new String[]{
            "x1c","x2c","x3c","x4c","x5c","x6c","x7c","x8c","x9c","x10c"
    };
    String[] d=new String[]{
            "x1d","x2d","x3d","x4d","x5d","x6d","x7d","x8d","x9d","x10d"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x);

        exit=findViewById(R.id.exitx);
        next=findViewById(R.id.next);
        previous=findViewById(R.id.previous);
        questions=findViewById(R.id.textViewx);
        atext=findViewById(R.id.atext);
        btext=findViewById(R.id.btext);
        ctext=findViewById(R.id.ctext);
        dtext=findViewById(R.id.dtext);
        abutton=findViewById(R.id.abutton);
        bbutton=findViewById(R.id.bbutton);
        cbutton=findViewById(R.id.cbutton);
        dbutton=findViewById(R.id.dbutton);
        scorex=findViewById(R.id.score);



        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(x.this ,MainActivity.class);
                startActivity(intent);
            }
        });

        abutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(QuestionNnumber!=-1) {


                    checkanswer("a");

                    QuestionNnumber = QuestionNnumber + 1;
                    if (QuestionNnumber == 10) {
                        questions.setText("Game over...\n Your score is " + score.toString());
                        atext.setText(" ");
                        btext.setText("");
                        ctext.setText(" ");
                        dtext.setText("");
                    } else {
                        questions.setText(questionBankx[QuestionNnumber].getQuestionId());
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
                if(QuestionNnumber!=-1) {

                    checkanswer("b");

                    QuestionNnumber = QuestionNnumber + 1;
                    if (QuestionNnumber == 10) {
                        questions.setText("Game over...\n Your score is " + score.toString());
                        atext.setText(" ");
                        btext.setText("");
                        ctext.setText(" ");
                        dtext.setText("");
                    } else {
                        questions.setText(questionBankx[QuestionNnumber].getQuestionId());
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
                if(QuestionNnumber!=-1) {
                    checkanswer("c");

                    QuestionNnumber = QuestionNnumber + 1;
                    if (QuestionNnumber == 10) {
                        questions.setText("Game over...\n Your score is " + score.toString());
                        atext.setText(" ");
                        btext.setText("");
                        ctext.setText(" ");
                        dtext.setText("");
                    } else {
                        questions.setText(questionBankx[QuestionNnumber].getQuestionId());
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
              if(QuestionNnumber!=-1) {
                  checkanswer("d");

                  QuestionNnumber = QuestionNnumber + 1;
                  if (QuestionNnumber == 10) {
                      questions.setText("Game over....\n Your score is " + score.toString());
                      atext.setText(" ");
                      btext.setText("");
                      ctext.setText(" ");
                      dtext.setText("");
                  } else {

                      questions.setText(questionBankx[QuestionNnumber].getQuestionId());
                      atext.setText(a[QuestionNnumber]);
                      btext.setText(b[QuestionNnumber]);
                      ctext.setText(c[QuestionNnumber]);
                      dtext.setText(d[QuestionNnumber]);

                  }
              }
              else
                  questions.setText("Press Next or Exit to continue");
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
                {questions.setText(questionBankx[QuestionNnumber].getQuestionId());
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
                    questions.setText("Press next or exit to continue");
                    atext.setText(" ");
                    btext.setText("");
                    ctext.setText(" ");
                    dtext.setText("");
                }
                else
                {
                    questions.setText(questionBankx[QuestionNnumber].getQuestionId());
                    atext.setText(a[QuestionNnumber]);
                    btext.setText(b[QuestionNnumber]);
                    ctext.setText(c[QuestionNnumber]);
                    dtext.setText(d[QuestionNnumber]);
                }
            }
        });

    }

    public void checkanswer(String Answer){
        String actualAnswer=questionBankx[QuestionNnumber].getAnswer();
        int toast=0;
        if(Answer==actualAnswer){
            toast=R.string.correct;
            score=score+1;
            scorex.setText(score.toString());


        }
        else{
           // shake_animation();
            toast=R.string.wrong;
        }
        Toast.makeText(x.this, toast, Toast.LENGTH_SHORT).show();


    }
    //private void shake_animation(){
        //Animation shake= AnimationUtils.loadAnimation(x.this,R.anim.anim_shake);
       // questions.setAnimation(shake);
    //}




    }

