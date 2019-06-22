package com.example.androidauto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button click = (Button) findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edt1 =  (EditText)findViewById(R.id.text1);
                EditText edt2 =  (EditText)findViewById(R.id.text2);
                TextView t1 =  (TextView) findViewById(R.id.result1);
                int num1 = Integer.parseInt(edt1.getText().toString());
                int num2 = Integer.parseInt(edt2.getText().toString());
                int sum =   num1+num2;
                Intent  res =  new Intent(MainActivity.this,user.class);

                res.putExtra("value",sum);
                startActivity(res);
                finish();



            }
        });
    }
}
