package com.example.a15017591.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 = (RadioGroup)findViewById(R.id.radiogroup1);
                int sID1 = rg1.getCheckedRadioButtonId();
                RadioButton rb1 = (RadioButton)findViewById(sID1);

                RadioGroup rg2 = (RadioGroup)findViewById(R.id.radiogroup2);
                int sID2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = (RadioButton)findViewById(sID2);

                RadioGroup rg3 = (RadioGroup)findViewById(R.id.radiogroup3);
                int sID3 = rg3.getCheckedRadioButtonId();
                RadioButton rb3 = (RadioButton)findViewById(sID3);

                EditText et = (EditText)findViewById(R.id.editText);


                String[] replies = {rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString(), et.getText().toString()};

                Intent i = new Intent(MainActivity.this, Summary.class);

                i.putExtra("replies", replies);

                startActivity(i);


            }
        });

    }


}
