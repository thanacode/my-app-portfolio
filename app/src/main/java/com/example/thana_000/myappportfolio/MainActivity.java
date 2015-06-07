package com.example.thana_000.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    /**
     * This method is called when the Spotify Streamer app button is clicked.
     */
    public void launch_Spotify_Streamer_app(View view) {
        // displayPrice(quantity * 5);

        String toastMessage = "This button will launch the Spotify Streamer app!";
        displaytoastMessage(toastMessage);
    }


    /**
     * This method is called when the Football Scores app button is clicked.
     */
    public void launch_Football_Scores_app(View view) {
        // displayPrice(quantity * 5);

        String toastMessage = "This button will launch the Football Scores app!";
        displaytoastMessage(toastMessage);
    }


    /**
     * This method is called when the Library app button is clicked.
     */
    public void launch_Library_app(View view) {
        // displayPrice(quantity * 5);

        String toastMessage = "This button will launch the Library app!";
        displaytoastMessage(toastMessage);
    }


    /**
     * This method is called when the Build It Bigger app button is clicked.
     */
    public void launch_Build_It_Bigger_app(View view) {
        // displayPrice(quantity * 5);

        String toastMessage = "This button will launch the Build It Bigger app!";
        displaytoastMessage(toastMessage);
    }


    /**
     * This method is called when the XYZ Reader app button is clicked.
     */
    public void launch_XYZ_Reader_app(View view) {
        // displayPrice(quantity * 5);

        String toastMessage = "This button will launch the XYZ Reader app!";
        displaytoastMessage(toastMessage);
    }


    /**
     * This method is called when the Capstone app button is clicked.
     */
    public void launch_Capstone_app(View view) {
        // displayPrice(quantity * 5);

        String toastMessage = "This button will launch my Capstone app!";
        displaytoastMessage(toastMessage);
    }

     /**
     * This method is use to display toast message.
     */
    private void displaytoastMessage(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
