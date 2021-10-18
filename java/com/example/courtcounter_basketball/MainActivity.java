package com.example.courtcounter_basketball;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity { int scorea=0;
    int scoreb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void score3a(View view) {
        scorea=scorea+3;
        displayteama(scorea);}
    public void score3b(View view) {
        scoreb=scoreb+3;
        displayteamb(scoreb);}
    public void score2a(View view) {
        scorea=scorea+2;
        displayteama(scorea);}
    public void score2b(View view) {
        scoreb=scoreb+2;
        displayteamb(scoreb);}
    public void freea(View view) {
        scorea=scorea+1;
        displayteama(scorea);}
    public void freeb(View view) {
        scoreb=scoreb+1;
        displayteamb(scoreb);}
    public void reset(View view) {
        scorea=0;
        scoreb=0;
        displayteama(scorea);
        displayteamb(scoreb);}
    public void  displayteama(int score)
    {
        TextView scoreView= (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void  displayteamb(int score)
    {
        TextView scoreView= (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}

