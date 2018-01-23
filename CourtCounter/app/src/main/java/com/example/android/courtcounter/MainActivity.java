package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_team_a=0;
    int score_team_b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView =  findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void show_three_a(View view)
    {
        score_team_a+=3;
        displayForTeamA(score_team_a);
    }

    public void show_two_a(View view)
    {
        score_team_a+=2;
        displayForTeamA(score_team_a);
    }

    public void show_one_a(View view)
    {
        score_team_a+=1;
        displayForTeamA(score_team_a);
    }

    public void displayForTeamB(int score) {
        TextView scoreView =  findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void show_three_b(View view)
    {
        score_team_b+=3;
        displayForTeamB(score_team_b);
    }

    public void show_two_b(View view)
    {
        score_team_b+=2;
        displayForTeamB(score_team_b);
    }

    public void show_one_b(View view)
    {
        score_team_b+=1;
        displayForTeamB(score_team_b);
    }

    public void reset(View view)
    {
        score_team_a=0;
        score_team_b=0;
        displayForTeamA(score_team_a);
        displayForTeamB(score_team_b);
    }

}
