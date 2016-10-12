package com.example.joane14.luminous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    ImageView image;
    Boolean seen=true;
    ToggleButton text ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (ToggleButton) findViewById(R.id.btnSwitch);
    }

    public void switchThis(View view){

        image = (ImageView) findViewById(R.id.imgThis);

        if(seen==true){
            seen=false;
            image.setImageResource(R.drawable.bulb_on);
        }
        else if(seen==false){
            seen=true;
            image.setImageResource(R.drawable.bulb_off);
        }

    }

}
