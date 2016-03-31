// Author  : Stephen Coffin
// Date    : 3/29/16
// Project : Portfolio Application

package com.example.android.myapplicationportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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



    //Button action for opening SpotStream App
    public void spotStream(View view)
    {
        Toast.makeText(MainActivity.this, "This will open the Spotify Stremer App!", Toast.LENGTH_SHORT).show();
    }

    //Button action for opening Scores App
    public void scoreApp(View view)
    {
        Toast.makeText(MainActivity.this, "This will open the Scores App!", Toast.LENGTH_SHORT).show();
    }

    //Button action for opening Library App
    public void libApp(View view)
    {
        Toast.makeText(MainActivity.this, "This will open the Library App!", Toast.LENGTH_SHORT).show();
    }

    //Button action for opening Build It Bigger App
    public void buildIt(View view)
    {
        Toast.makeText(MainActivity.this, "This will open the Build It Bigger App!", Toast.LENGTH_SHORT).show();
    }

    //Button action for opening XYZ Reader App
    public void xyzReader(View view)
    {
        Toast.makeText(MainActivity.this, "This will open the XYZ Reader App!", Toast.LENGTH_SHORT).show();
    }

    //Button action for opening Capstone App
    public void capStone(View view)
    {
        Toast.makeText(MainActivity.this, "This will open the Capstone App I designed and Created!", Toast.LENGTH_SHORT).show();
    }

}
