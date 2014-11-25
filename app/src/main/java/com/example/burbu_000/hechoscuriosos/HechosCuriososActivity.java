package com.example.burbu_000.hechoscuriosos;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class HechosCuriososActivity extends Activity {

    private  TextView factLabel;
    private Button showFactButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechos_curiosos);

         factLabel = (TextView)findViewById(R.id.HechoCuriosoTextView);
         showFactButton = (Button) findViewById(R.id.button);

       /* Toast toast = Toast.makeText(this, "Esto es un mensaje", Toast.LENGTH_LONG);
        toast.show();*/


        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String [] array= getResources().getStringArray(R.array.array);
                String[] allColors = getResources().getStringArray(R.array.colors);
                RelativeLayout vista = (RelativeLayout) findViewById(R.id.relativeLayout);
                int x = Math.abs(new Random().nextInt(array.length-0)+0);
                factLabel.setText(array[x]);
                x = Math.abs(new Random().nextInt(allColors.length-0)+0);


                vista.setBackgroundColor(Color.parseColor(allColors[x]));



            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.



        getMenuInflater().inflate(R.menu.hechos_curiosos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
