package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count1=0,count2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addThreeForTeamA(View v){
        count1=count1+3;
        dispalyForTeam_A(count1);
    }

    public void addTwoForTeamA(View v){
        count1=count1+2;
        dispalyForTeam_A(count1);
    }
    public void addOneForTeamA(View v){
        count1=count1+1;
        dispalyForTeam_A(count1);
    }

    public void addThreeForTeamB(View v){
        count2=count2+3;
        dispalyForTeam_B(count2);
    }

    public void addTwoForTeamB(View v){
        count2=count2+2;
        dispalyForTeam_B(count2);
    }

    public void addOneForTeamB(View v){
        count2=count2+1;
        dispalyForTeam_B(count2);
    }




    public void resetScore(View v){
        count1=0;
        count2=0;
        dispalyForTeam_B(count2);
        dispalyForTeam_A(count1);
    }

    public void dispalyForTeam_A(int score){
        TextView View_Score_A=(TextView) findViewById(R.id.team_a_score);
        View_Score_A.setText(String.valueOf(score));
    }
    public void dispalyForTeam_B(int score1){
        TextView View_Score_B=(TextView) findViewById(R.id.team_b_score);
        View_Score_B.setText(String.valueOf(score1));
    }
}