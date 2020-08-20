package com.example.animalshadows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Settings extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton, radio_3, radio_4, radio_5, radio_7, radio_9;
    int settingSta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        settingSta = getIntent().getExtras().getInt("Value3");

        radioGroup = findViewById(R.id.radioGroup);

        radio_3 = (RadioButton)findViewById(R.id.radio_3);
        radio_4 = (RadioButton)findViewById(R.id.radio_4);
        radio_5 = (RadioButton)findViewById(R.id.radio_5);
        radio_7 = (RadioButton)findViewById(R.id.radio_7);
        radio_9 = (RadioButton)findViewById(R.id.radio_9);

        if (settingSta == 3) {
            radio_3.setChecked(true);
        } else if (settingSta == 4) {
            radio_4.setChecked(true);
        } else if (settingSta == 5) {
            radio_5.setChecked(true);
        } else if (settingSta == 7) {
            radio_7.setChecked(true);
        } else if (settingSta == 9) {
            radio_9.setChecked(true);
        }

        Button buttonApply = findViewById(R.id.button_apply);

        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                String raidoStr = radioButton.getText().toString();
                int radioNum = Integer.parseInt(raidoStr.substring(0,1));
                int empty = -1;
                Intent intent = new Intent(getApplicationContext(), WelcomeScreen2.class);
                intent.putExtra("Value1",radioNum);
                intent.putExtra("Value2",empty);
                startActivity(intent);
                finish();
            }
        });

    }
}
