package com.example.intent1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        final Button btnokay = (Button) findViewById(R.id.btn2);

        btnokay.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText message = (EditText)findViewById( R.id.msg );
                EditText phone =  findViewById( R.id.phone1 );
                String text =  message.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                message.setText(text);
                i.setData(Uri.parse("https://api.whatsapp.com/send?phone=91"+ phone.getText()+"&text="+message.getText() ));
                startActivity(i);
            }
        } );
    }
}
