package com.example.android.teamscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 * Author : Udit Panchal
 * Application : Basketball Team Score Tracker
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamAscores = 0;
    int teamBscores = 0;

    private void displayForTeamA(int scoreA){
        TextView teamAscore = (TextView) findViewById(R.id.team_A_score);
        teamAscore.setText(String.valueOf(teamAscores));

    }

    private void displayForTeamB(int scoreB){
        TextView teamBscore = (TextView) findViewById(R.id.team_B_score);
        teamBscore.setText(String.valueOf(teamBscores));
    }

    public void buttonA_3points(View view) {
        teamAscores += 3;
        displayForTeamA(teamAscores);
    }

    public void buttonA_2points(View view) {
        teamAscores += 2;
        displayForTeamA(teamAscores);
    }

    public void buttonA_freeThrow(View view) {
        teamAscores += 1;
        displayForTeamA(teamAscores);
    }

    public void buttonB_3points(View view) {
        teamBscores += 3;
        displayForTeamB(teamBscores);
    }

    public void buttonB_2points(View view) {
        teamBscores += 2;
        displayForTeamB(teamBscores);
    }

    public void buttonB_freeThrow(View view) {
        teamBscores += 1;
        displayForTeamB(teamBscores);
    }

    public void buttonReset(View view) {
        teamAscores = 0;
        teamBscores = 0;
        displayForTeamA(teamAscores);
        displayForTeamB(teamBscores);
    }
}
