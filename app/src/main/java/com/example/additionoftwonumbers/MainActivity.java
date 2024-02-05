package com.example.additionoftwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View view){
    //listeners
        try {
            TextView maintext = (TextView) findViewById(R.id.mainText);
            EditText input1 = (EditText) findViewById(R.id.input1);
            EditText input2 = (EditText) findViewById(R.id.input2);

            int a = Integer.parseInt(input1.getText().toString());
            int b = Integer.parseInt(input2.getText().toString());
            int c = a + b;


            maintext.setText("Sum ="+c);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}