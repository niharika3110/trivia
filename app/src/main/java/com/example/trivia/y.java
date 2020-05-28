package com.example.trivia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class y extends AppCompatActivity {
    Button exity;


    ImageButton nexty;
    ImageButton previousy;
    TextView questionsy;
    TextView atexty,btexty,ctexty,dtexty;
    ImageButton abuttony,bbuttony,cbuttony,dbuttony;
    TextView scorey;

    int QuestionNnumbery=-1;
    Integer score=0;

    yquestions[] questionBanky=new yquestions[]{
            new yquestions(R.string.y1,"a"),
            new yquestions(R.string.y2,"c"),
            new yquestions(R.string.y3,"b"),
            new yquestions(R.string.y4,"c"),
            new yquestions(R.string.y5,"d"),
            new yquestions(R.string.y6,"a"),
            new yquestions(R.string.y7,"c"),
            new yquestions(R.string.y8,"b"),
            new yquestions(R.string.y9,"c"),
            new yquestions(R.string.y10,"d"),

    };

    String[] ay=new String[]{
            "y1a","y2a","y3a","y4a","y5a","y6a","y7a","y8a","y9a","y10a"
    };
    String[] by=new String[]{
            "y1b","y2b","y3b","y4b","y5b","y6b","y7b","y8b","y9b","y10b"
    };
    String[] cy=new String[]{
            "y1c","y2c","y3c","y4c","y5c","y6c","y7c","y8c","x9c","y10c"
    };
    String[] dy=new String[]{
            "y1d","y2d","y3d","y4d","y5d","y6d","y7d","y8d","y9d","y10d"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y);

        exity=findViewById(R.id.exity);
        nexty=findViewById(R.id.nexty);
        previousy=findViewById(R.id.previousy);
        questionsy=findViewById(R.id.textViewy);
        atexty=findViewById(R.id.atexty);
        btexty=findViewById(R.id.btexty);
        ctexty=findViewById(R.id.ctexty);
        dtexty=findViewById(R.id.dtexty);
        abuttony=findViewById(R.id.abuttony);
        bbuttony=findViewById(R.id.bbuttony);
        cbuttony=findViewById(R.id.cbuttony);
        dbuttony=findViewById(R.id.dbuttony);
        scorey=findViewById(R.id.scorey);



        exity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(y.this ,MainActivity.class);
                startActivity(intent);
            }
        });

        abuttony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionNnumbery != -1) {
                    checkanswery("a");
                    QuestionNnumbery = QuestionNnumbery + 1;
                    if (QuestionNnumbery == 10) {
                        questionsy.setText("Game over...\n Your score is " + score.toString());
                        atexty.setText(" ");
                        btexty.setText("");
                        ctexty.setText(" ");
                        dtexty.setText("");
                    } else {
                        questionsy.setText(questionBanky[QuestionNnumbery].getQuestionId());
                        atexty.setText(ay[QuestionNnumbery]);
                        btexty.setText(by[QuestionNnumbery]);
                        ctexty.setText(cy[QuestionNnumbery]);
                        dtexty.setText(dy[QuestionNnumbery]);
                    }
                }
                else
                    questionsy.setText("Press next or exit to continue");
            }

        });
        bbuttony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionNnumbery != -1) {
                    checkanswery("b");
                    QuestionNnumbery = QuestionNnumbery + 1;
                    if (QuestionNnumbery == 10) {
                        questionsy.setText("Game over...\n Your score is " + score.toString());
                        atexty.setText(" ");
                        btexty.setText("");
                        ctexty.setText(" ");
                        dtexty.setText("");
                    } else {
                        questionsy.setText(questionBanky[QuestionNnumbery].getQuestionId());
                        atexty.setText(ay[QuestionNnumbery]);
                        btexty.setText(by[QuestionNnumbery]);
                        ctexty.setText(cy[QuestionNnumbery]);
                        dtexty.setText(dy[QuestionNnumbery]);
                    }
                }
                else
                    questionsy.setText("Press next or exit to continue");
            }
        });
        cbuttony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionNnumbery != -1) {
                    checkanswery("c");
                    QuestionNnumbery = QuestionNnumbery + 1;
                    if (QuestionNnumbery == 10) {
                        questionsy.setText("Game over...\n Your score is " + score.toString());
                        atexty.setText(" ");
                        btexty.setText("");
                        ctexty.setText(" ");
                        dtexty.setText("");
                    } else {
                        questionsy.setText(questionBanky[QuestionNnumbery].getQuestionId());
                        atexty.setText(ay[QuestionNnumbery]);
                        btexty.setText(by[QuestionNnumbery]);
                        ctexty.setText(cy[QuestionNnumbery]);
                        dtexty.setText(dy[QuestionNnumbery]);
                    }

                }
                else
                    questionsy.setText("Press next or exit to continue");
            }
        });
        dbuttony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (QuestionNnumbery != -1) {


                    checkanswery("d");
                    QuestionNnumbery = QuestionNnumbery + 1;
                    if (QuestionNnumbery == 10) {
                        questionsy.setText("Game over...\n Your score is " + score.toString());
                        atexty.setText(" ");
                        btexty.setText("");
                        ctexty.setText(" ");
                        dtexty.setText("");
                    } else {
                        questionsy.setText(questionBanky[QuestionNnumbery].getQuestionId());
                        atexty.setText(ay[QuestionNnumbery]);
                        btexty.setText(by[QuestionNnumbery]);
                        ctexty.setText(cy[QuestionNnumbery]);
                        dtexty.setText(dy[QuestionNnumbery]);
                    }
                }
                else
                    questionsy.setText("Press next or exit to continue");
            }
        });

        nexty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuestionNnumbery=QuestionNnumbery+1;
                if(QuestionNnumbery==10)
                {questionsy.setText("Game over...\n Your score is "+score.toString());
                    atexty.setText(" ");
                    btexty.setText("");
                    ctexty.setText(" ");
                    dtexty.setText("");}
                else
                {questionsy.setText(questionBanky[QuestionNnumbery].getQuestionId());
                    atexty.setText(ay[QuestionNnumbery]);
                    btexty.setText(by[QuestionNnumbery]);
                    ctexty.setText(cy[QuestionNnumbery]);
                    dtexty.setText(dy[QuestionNnumbery]);}
            }
        });
        previousy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuestionNnumbery=QuestionNnumbery-1;
                if(QuestionNnumbery==-1)

                {
                    questionsy.setText("Press next to continue");
                    atexty.setText(" ");
                    btexty.setText("");
                    ctexty.setText(" ");
                    dtexty.setText("");
                }
                else
                {
                    questionsy.setText(questionBanky[QuestionNnumbery].getQuestionId());
                    atexty.setText(ay[QuestionNnumbery]);
                    btexty.setText(by[QuestionNnumbery]);
                    ctexty.setText(cy[QuestionNnumbery]);
                    dtexty.setText(dy[QuestionNnumbery]);
                }
            }
        });

    }

    public void checkanswery(String Answer){
        String actualAnswer=questionBanky[QuestionNnumbery].getAnswer();
        int toast=0;
        if(Answer==actualAnswer){
            toast=R.string.correct;
            score=score+1;
            scorey.setText(score.toString());

        }
        else{
            toast=R.string.wrong;
        }
        Toast.makeText(y.this, toast, Toast.LENGTH_SHORT).show();


    }
}

