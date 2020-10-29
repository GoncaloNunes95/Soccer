package com.example.marcadordeplacar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Teams extends AppCompatActivity{

    String nameTeamA = "";
    String nameTeamB = "";
    EditText team1, team2;
    public static final String SHARED_PREFS = "sharedPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teams);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.iconapp);

        team1 = (EditText) findViewById(R.id.teamA);
        team2 = (EditText) findViewById(R.id.teamB);
        team1.setTextColor(Color.BLUE);
        team2.setTextColor(Color.BLUE);

    }

    public void PlayGame(View view){

        nameTeamA = team1.getText().toString();
        nameTeamB = team2.getText().toString();

        if (nameTeamA.equals("") || nameTeamB.equals("")) {
            Toast.makeText(Teams.this, "Introduza as duas equipas!",Toast.LENGTH_SHORT).show();
        }
        else {
            SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("Team_A", nameTeamA);
            editor.putString("Team_B", nameTeamB);
            editor.commit();

            Intent goToMain = new Intent(this, MainActivity.class);
            startActivity(goToMain);
        }
    }

}
