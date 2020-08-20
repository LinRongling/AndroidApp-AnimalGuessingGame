package com.example.animalshadows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen2 extends AppCompatActivity {

    Button start, settings, score, quit;
    int score1, score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen2);

        score1 = getIntent().getExtras().getInt("Value1");
        score2 = getIntent().getExtras().getInt("Value2");

        start = (Button)findViewById(R.id.start);
        settings = (Button)findViewById(R.id.settings);
        score = (Button)findViewById(R.id.score);
        quit = (Button)findViewById(R.id.quit);

        start.setText("Start Game\n("+score1+" Guesses)");
        if (score2 == -1) {

        } else {
            score.setText("\uD83D\uDCDCScore Board\n"+"Last Score: "+score2+"/"+score1);
        }

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (score1 == 3) {
                    startActivity(new Intent(WelcomeScreen2.this,MainActivity.class));
                    finish();
                } else if (score1 == 4) {
                    startActivity(new Intent(WelcomeScreen2.this,Main4Activity.class));
                    finish();
                } else if (score1 == 5) {
                    startActivity(new Intent(WelcomeScreen2.this,Main5Activity.class));
                    finish();
                } else if (score1 == 7) {
                    startActivity(new Intent(WelcomeScreen2.this,Main7Activity.class));
                    finish();
                } else if (score1 == 9) {
                    startActivity(new Intent(WelcomeScreen2.this,Main9Activity.class));
                    finish();
                }

            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Settings.class);
                intent.putExtra("Value3",score1);
                startActivity(intent);
                finish();
            }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
