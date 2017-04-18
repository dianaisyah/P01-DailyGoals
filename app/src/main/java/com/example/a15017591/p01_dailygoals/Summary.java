package com.example.a15017591.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        Intent i = getIntent();

        String[] replies = i.getStringArrayExtra("replies");

        TextView tv1 = (TextView)findViewById(R.id.textView12);
        TextView tv2 = (TextView)findViewById(R.id.textView13);
        TextView tv3 = (TextView)findViewById(R.id.textView14);
        TextView tv4 = (TextView)findViewById(R.id.textView15);

        tv1.setText(replies[0]);
        tv2.setText(replies[1]);
        tv3.setText(replies[2]);
        tv4.setText(replies[3]);

    }
}
