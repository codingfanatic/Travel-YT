package com.example.travelyt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Intent intent;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void press(View view){
        //Cast the View object as a TextView
        //Use getText() to obtain text and toString() to obtain a String
        //If the String equals "View List", start ListAddresses
        //Else if the String equals "Search List", start SearchAddresses

        text = ((TextView) view).getText().toString();

        if (text.equals("View List")) {
            intent = new Intent(this, ListAddresses.class);
            startActivity(intent);
        }

        else if (text.equals("Search List")) {
            intent = new Intent(this, SearchAddresses.class);
            startActivity(intent);
        }
    }
}
