package com.example.marcadordeplacar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String nameTeamA = "";
    String nameTeamB = "";
    TextView t1, t2;
    public static final String SHARED_PREFS = "sharedPrefs";

    /* Team A */
    int goloTeamA = 0;
    int penaltiTeamA = 0;
    int cantosTeamA = 0;
    int faltasTeamA = 0;
    int vermelhosTeamA = 0;
    int amarelosTeamA = 0;

    /* Team B */
    int goloTeamB = 0;
    int penaltiTeamB = 0;
    int cantosTeamB = 0;
    int faltasTeamB = 0;
    int vermelhosTeamB = 0;
    int amarelosTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.iconapp);

        t1 = (TextView) findViewById(R.id.TEAMA);
        t2 = (TextView) findViewById(R.id.TEAMB);

        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
        nameTeamA = sharedPreferences.getString("Team_A","");
        nameTeamB = sharedPreferences.getString("Team_B","");

        t1.setText(nameTeamA);
        t1.setTextColor(Color.BLUE);
        t2.setText(nameTeamB);
        t2.setTextColor(Color.BLUE);
    }
    /* ---------------------------------Team A------------------------- */
    /* Golo Team A */
    public void addGoloTeamA(View view) {
        goloTeamA = goloTeamA + 1;
        displayGoloTeamA(goloTeamA);
    }

    public void displayGoloTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goloA);
        scoreView.setText(String.valueOf(score));
    }

    /* Penalti Team A */
    public void addPenaltiTeamA(View view) {
        penaltiTeamA = penaltiTeamA + 1;
        displayPenaltiTeamA(penaltiTeamA);
    }

    public void displayPenaltiTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltiA);
        scoreView.setText(String.valueOf(score));
    }

    /* Cantos Team A */
    public void addCantosTeamA(View view) {
        cantosTeamA = cantosTeamA + 1;
        displayCantosTeamA(cantosTeamA);
    }

    public void displayCantosTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cantoA);
        scoreView.setText(String.valueOf(score));
    }

    /* Faltas Team B. */
    public void addFaltasTeamA(View view) {
        faltasTeamA = faltasTeamA + 1;
        displayFaltasTeamA(faltasTeamA);
    }

    public void displayFaltasTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltaA);
        scoreView.setText(String.valueOf(score));
    }

    /* Vermelhos Team B. */
    public void addVermelhosTeamA(View view) {
        vermelhosTeamA = vermelhosTeamA + 1;
        displayVermelhosTeamA(vermelhosTeamA);
    }

    public void displayVermelhosTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.vermelhoA);
        scoreView.setText(String.valueOf(score));
    }

    /* Amarelos Team B. */
    public void addAmarelosTeamA(View view) {
        amarelosTeamA = amarelosTeamA + 1;
        displayAmarelosTeamA(amarelosTeamA);
    }

    public void displayAmarelosTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.amareloA);
        scoreView.setText(String.valueOf(score));
    }

    /* -------------------------- Team B -------------------------------- */
    /* Golo Team B */
    public void addGoloTeamb(View view) {
        goloTeamB = goloTeamB + 1;
        displayGoloTeamB(goloTeamB);
    }

    public void displayGoloTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goloB);
        scoreView.setText(String.valueOf(score));
    }

    /* Penalti Team B */
    public void addPenaltiTeamB(View view) {
        penaltiTeamB = penaltiTeamB + 1;
        displayPenaltiTeamB(penaltiTeamB);
    }

    public void displayPenaltiTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltiB);
        scoreView.setText(String.valueOf(score));
    }

    /* Cantos Team B */
    public void addCantosTeamB(View view) {
        cantosTeamB = cantosTeamB + 1;
        displayCantosTeamB(cantosTeamB);
    }

    public void displayCantosTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cantoB);
        scoreView.setText(String.valueOf(score));
    }

    /* Faltas Team B */
    public void addFaltasTeamB(View view) {
        faltasTeamB = faltasTeamB + 1;
        displayFaltasTeamB(faltasTeamB);
    }

    public void displayFaltasTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltaB);
        scoreView.setText(String.valueOf(score));
    }

    /* Vermelhos Team B */
    public void addVermelhosTeamB(View view) {
        vermelhosTeamB = vermelhosTeamB + 1;
        displayVermelhosTeamB(vermelhosTeamB);
    }

    public void displayVermelhosTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.vermelhoB);
        scoreView.setText(String.valueOf(score));
    }

    /* Amarelos Team A. */
    public void addAmarelosTeamB(View view) {
        amarelosTeamB = amarelosTeamB + 1;
        displayAmarelosTeamB(amarelosTeamB);
    }

    public void displayAmarelosTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.amareloB);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {

        /* Team A */
        goloTeamA = 0;
        penaltiTeamA = 0;
        cantosTeamA = 0;
        faltasTeamA = 0;
        vermelhosTeamA = 0;
        amarelosTeamA = 0;

        /* Team B */
        goloTeamB = 0;
        penaltiTeamB = 0;
        cantosTeamB = 0;
        faltasTeamB = 0;
        vermelhosTeamB = 0;
        amarelosTeamB = 0;

        displayGoloTeamA(goloTeamA);
        displayPenaltiTeamA(penaltiTeamA);
        displayCantosTeamA(cantosTeamA);
        displayFaltasTeamA(faltasTeamA);
        displayVermelhosTeamA(vermelhosTeamA);
        displayAmarelosTeamA(amarelosTeamA);

        displayGoloTeamB(goloTeamB);
        displayPenaltiTeamB(penaltiTeamB);
        displayCantosTeamB(cantosTeamB);
        displayFaltasTeamB(faltasTeamB);
        displayVermelhosTeamB(vermelhosTeamB);
        displayAmarelosTeamB(amarelosTeamB);
    }

    public void newTeams(View view) {

        /* Team A */
        goloTeamA = 0;
        penaltiTeamA = 0;
        cantosTeamA = 0;
        faltasTeamA = 0;
        vermelhosTeamA = 0;
        amarelosTeamA = 0;

        /* Team B */
        goloTeamB = 0;
        penaltiTeamB = 0;
        cantosTeamB = 0;
        faltasTeamB = 0;
        vermelhosTeamB = 0;
        amarelosTeamB = 0;

        displayGoloTeamA(goloTeamA);
        displayPenaltiTeamA(penaltiTeamA);
        displayCantosTeamA(cantosTeamA);
        displayFaltasTeamA(faltasTeamA);
        displayVermelhosTeamA(vermelhosTeamA);
        displayAmarelosTeamA(amarelosTeamA);

        displayGoloTeamB(goloTeamB);
        displayPenaltiTeamB(penaltiTeamB);
        displayCantosTeamB(cantosTeamB);
        displayFaltasTeamB(faltasTeamB);
        displayVermelhosTeamB(vermelhosTeamB);
        displayAmarelosTeamB(amarelosTeamB);

        Intent intent = new Intent(this, Teams.class);
        startActivity(intent);

    }
}
