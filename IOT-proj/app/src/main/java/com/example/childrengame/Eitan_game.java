package com.example.childrengame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class Eitan_game extends AppCompatActivity {

    String SentencesOpt[][] = {{"השמש ____ בלילה","תשקע","ישקע","תשקע"},{} };
    ArrayList<Integer> optionsList= new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14) );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eitan_game);
    }
}