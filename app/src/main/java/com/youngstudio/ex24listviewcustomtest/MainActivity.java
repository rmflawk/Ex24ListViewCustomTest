package com.youngstudio.ex24listviewcustomtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Member> members= new ArrayList<Member>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


}
