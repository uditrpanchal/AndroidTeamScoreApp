package com.example.android.teamscore;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.view.View.*;


/**
 * Author : Udit Panchal
 * Application : Basketball Team Score Tracker
 */
public class MainActivity extends AppCompatActivity{

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

       /* Button btnA1 = (Button) findViewById(R.id.A_button_3_points);
        Button btnA2 = (Button) findViewById(R.id.A_button_2_points);
        Button btnA3 = (Button) findViewById(R.id.A_button_free_throw);
        Button btnB1 = (Button) findViewById(R.id.B_button_3_points);
        Button btnB2 = (Button) findViewById(R.id.B_button_2_points);
        Button btnB3 = (Button) findViewById(R.id.B_button_free_throw);

        btnA1.setOnClickListener(this);
        btnA2.setOnClickListener(this);
        btnA3.setOnClickListener(this);
        btnB1.setOnClickListener(this);
        btnB2.setOnClickListener(this);
        btnB3.setOnClickListener(this); */

    }

    int teamAscores = 0;
    int teamBscores = 0;






    private void displayForTeamA(int scoreA) {
        TextView teamAscore = (TextView) findViewById(R.id.team_A_score);
        teamAscore.setText(String.valueOf(teamAscores));

        if(scoreA > 0)
        {
            Button resetBtn = (Button) findViewById(R.id.reset);
            resetBtn.setVisibility(VISIBLE);
        }

    }

    private void displayForTeamB(int scoreB) {
        TextView teamBscore = (TextView) findViewById(R.id.team_B_score);
        teamBscore.setText(String.valueOf(teamBscores));

        if(scoreB > 0)
        {
            Button resetBtn = (Button) findViewById(R.id.reset);
            resetBtn.setVisibility(VISIBLE);
        }
    }

    private void invisibleResetButton(int teamAscores, int teamBscores) {
        if (teamAscores == 0 && teamBscores == 0) {

        }
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
        Button resetBtn = (Button) findViewById(R.id.reset);
        resetBtn.setVisibility(view.INVISIBLE);
    }



    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
