package com.jgato.portfolio.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String toastMessagePre = "This button will launch my";

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void menuButtonClick(View view)
    {
        switch (view.getId())
        {
            case R.id.spotifyStreamer:
                displayToastMessage(toastMessagePre + " Spotify Streamer.");
                break;
            case R.id.footballScroresApp:
                displayToastMessage(toastMessagePre + " Football Scores App.");
                break;
            case R.id.libraryApp:
                displayToastMessage(toastMessagePre + " Library App.");
                break;
            case R.id.buildItBigger:
                displayToastMessage(toastMessagePre + " Build It Bigger App.");
                break;
            case R.id.xyzReader:
                displayToastMessage(toastMessagePre + " XYZ Reader.");
                break;
            case R.id.capstone:
                displayToastMessage(toastMessagePre + " Capstone App.");
                break;
        }
    }

    public void displayToastMessage(String msg)
    {
        //Display short toast message
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
