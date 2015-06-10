package com.neilhussain.portfolio.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainViewActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);
        
        createButtons();

    }

    private void createButtons() {

        final Context context = getApplicationContext();
        CharSequence appNameText = "default toast";
        final int duration = Toast.LENGTH_SHORT;


        final Button button1 = (Button) findViewById(R.id.appButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my Spotify Streamer app!", duration);
                toast.show();
            }
        });
        final Button button2 = (Button) findViewById(R.id.appButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my  Scores app!", duration);
                toast.show();
            }
        });
        final Button button3 = (Button) findViewById(R.id.appButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my Library app!", duration);
                toast.show();
            }
        });
        final Button button4 = (Button) findViewById(R.id.appButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my Build It Bigger app!", duration);
                toast.show();
            }
        });
        final Button button5 = (Button) findViewById(R.id.appButton5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch my XYZ Reader app!", duration);
                toast.show();
            }
        });
        final Button button6 = (Button) findViewById(R.id.appButton6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(context, "This button will launch My Own app!", duration);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_view, menu);
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


}
