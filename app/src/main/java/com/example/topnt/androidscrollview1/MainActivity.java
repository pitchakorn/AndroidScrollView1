package com.example.topnt.androidscrollview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textshow);

        StringBuilder stringBuilder = new StringBuilder();
        String alltext = "This is Scroll View !!! \n";

        for (int i=0 ; i<50 ;i++){
            stringBuilder.append(alltext);
        }
        textView.setText(stringBuilder.toString());
    }
}
