package com.ctnels.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;
    TextView txtTeamAScore;
    TextView txtTeamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTeamAScore = (TextView) findViewById(R.id.txt_team_a_score);
        txtTeamBScore = (TextView) findViewById(R.id.txt_team_b_score);
    }

    private void notifyUser() {
        Toast notifyUser = Toast.makeText(this, "More points added", Toast.LENGTH_SHORT);
        notifyUser.show();
    }

    // TEAM A

    void teamA3Points(View view){
        teamAScore += 3;
        txtTeamAScore.setText("" + teamAScore);
        notifyUser();
    }
    void teamA2Points(View view){
        teamAScore += 2;
        txtTeamAScore.setText("" + teamAScore);
        notifyUser();
    }
    void teamAFreeThrow(View view){
        teamAScore += 1;
        txtTeamAScore.setText("" + teamAScore);
        notifyUser();
    }
    void teamAReset(View view){
        teamAScore = 0;
        txtTeamAScore.setText("" + teamAScore);
    }

    // TEAM B

    void teamB3Points(View view){
        teamBScore += 3;
        txtTeamBScore.setText("" + teamBScore);
        notifyUser();
    }
    void teamB2Points(View view){
        teamBScore += 2;
        txtTeamBScore.setText("" + teamBScore);
        notifyUser();
    }
    void teamBFreeThrow(View view){
        teamBScore += 1;
        txtTeamBScore.setText("" + teamBScore);
        notifyUser();
    }
    void teamBReset(View view){
        teamBScore = 0;
        txtTeamBScore.setText("" + teamBScore);
    }
}
