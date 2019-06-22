package com.example.androidauto;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class user extends AppCompatActivity {
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_user );

        TextView res1 = (TextView) findViewById( R.id.result1 );
        int sum = getIntent().getExtras().getInt( "value" );
        res1.setText( Integer.toString( sum ) );


    }
}

