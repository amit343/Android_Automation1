package com.example.hackbar;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity<onClickListener> extends AppCompatActivity {
private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       final Button btnokay = (Button) findViewById(R.id.btnokay);
        final Button btnokay1 = (Button) findViewById(R.id.btnokay1);
        final Button btnokay2 = (Button) findViewById(R.id.btnokay2);

        btnokay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(launchIntent);
            }
        });


        btnokay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.linkedin.android");
                startActivity(launchIntent);
            }
        });


        btnokay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.twitter.android");
                startActivity(launchIntent);
            }
        });


    }

}


