//Android Developer Training Session 5 - Assignment 5.1
//Problem Statement- Implement options menu having option "TEXT COLOR" and its sub  menu of  at least  3  colors.
//On click of each color should change the activity TextView color.

package com.example.sandeep.menucolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;

/*
1.Create new resource "menu" folder under res.
2.Create custom sub_menu.xml under menu folder.
3.After creating sub_menu.xml add the new items Red,Green,Blue.
4.Inflate the custom menu layout into activity_main.xml layout.
* */


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method to inflate the sub_menu into activity_main.xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.sub_menu, menu);
        return true;
    }

    //Method to show what happens when the items in the menu is clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout relativeLayout;
        relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout);

        switch (item.getItemId()) {
            case R.id.red_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                break;

            case R.id.green_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                break;

            case R.id.blue_color:
                relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                break;

        }

        return true;
    }

}

