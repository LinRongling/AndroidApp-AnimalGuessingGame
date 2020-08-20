package com.example.animalshadows;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main5Activity extends AppCompatActivity {

    ImageView image1, image2, image3, image4, mainImage;
    TextView text2, scoreSho, position;
    Button btn1;

    Integer[] images = {
            R.drawable.animal1,
            R.drawable.animal2,
            R.drawable.animal3,
            R.drawable.animal4,
            R.drawable.animal5,
            R.drawable.animal6,
            R.drawable.animal7,
            R.drawable.animal8,
            R.drawable.animal9,
            R.drawable.animal10,
            R.drawable.animal11,
            R.drawable.animal12,
            R.drawable.animal13,
            R.drawable.animal14,
            R.drawable.animal15,
            R.drawable.animal16,
            R.drawable.animal17,
            R.drawable.animal18,
            R.drawable.animal19,
            R.drawable.animal20,
            R.drawable.animal21,
            R.drawable.animal22,

    };

    Integer [] image_bw = {
            R.drawable.animal_bw1,
            R.drawable.animal_bw2,
            R.drawable.animal_bw3,
            R.drawable.animal_bw4,
            R.drawable.animal_bw5,
            R.drawable.animal_bw6,
            R.drawable.animal_bw7,
            R.drawable.animal_bw8,
            R.drawable.animal_bw9,
            R.drawable.animal_bw10,
            R.drawable.animal_bw11,
            R.drawable.animal_bw12,
            R.drawable.animal_bw13,
            R.drawable.animal_bw14,
            R.drawable.animal_bw15,
            R.drawable.animal_bw16,
            R.drawable.animal_bw17,
            R.drawable.animal_bw18,
            R.drawable.animal_bw19,
            R.drawable.animal_bw20,
            R.drawable.animal_bw21,
            R.drawable.animal_bw22,
    };
    Integer[] images_numbers = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
    int correctAnswer = 0;
    int score = 0;
    int turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        image1 = (ImageView)findViewById(R.id.image1);
        image2 = (ImageView)findViewById(R.id.image2);
        image3 = (ImageView)findViewById(R.id.image3);
        image4 = (ImageView)findViewById(R.id.image4);
        mainImage = (ImageView)findViewById(R.id.mainImage);

        text2 = (TextView)findViewById(R.id.text2);
        scoreSho = (TextView)findViewById(R.id.scoreSho);
        position = (TextView)findViewById(R.id.position);

        btn1 = (Button)findViewById(R.id.btn1);
        //random shuffle the image
        Collections.shuffle(Arrays.asList(images_numbers));
        //set images on the screen
        setImages();

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if correct or wrong
                if (correctAnswer == 1){
                    score++;
                    scoreSho.setText("Score: "+score);
                    text2.setText("Correct");
                    btn1.setVisibility(View.VISIBLE);
                } else {
                    text2.setText("Wrong");
                    btn1.setVisibility(View.VISIBLE);
                }
                //disable images
                image1.setEnabled(false);
                image2.setEnabled(false);
                image3.setEnabled(false);
                image4.setEnabled(false);

            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if correct or wrong
                if (correctAnswer == 2){
                    score++;
                    scoreSho.setText("Score: "+score);
                    text2.setText("Correct");
                    btn1.setVisibility(View.VISIBLE);
                } else {
                    text2.setText("Wrong");
                    btn1.setVisibility(View.VISIBLE);
                }
                //disable images
                image1.setEnabled(false);
                image2.setEnabled(false);
                image3.setEnabled(false);
                image4.setEnabled(false);

            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if correct or wrong
                if (correctAnswer == 3){
                    score++;
                    scoreSho.setText("Score: "+score);
                    text2.setText("Correct");
                    btn1.setVisibility(View.VISIBLE);
                } else {
                    text2.setText("Wrong");
                    btn1.setVisibility(View.VISIBLE);
                }
                //disable images
                image1.setEnabled(false);
                image2.setEnabled(false);
                image3.setEnabled(false);
                image4.setEnabled(false);

            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check if correct or wrong
                if (correctAnswer == 4){
                    score++;
                    scoreSho.setText("Score: "+score);
                    text2.setText("Correct");
                    btn1.setVisibility(View.VISIBLE);
                } else {
                    text2.setText("Wrong");
                    btn1.setVisibility(View.VISIBLE);
                }
                //disable images
                image1.setEnabled(false);
                image2.setEnabled(false);
                image3.setEnabled(false);
                image4.setEnabled(false);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //increase the turn finish the game if 1 turns are passed
                turn++;
                if (turn == 6){
                    checkEnd();
                }else {
                    position.setText(turn+"/5");
                    setImages();
                }
            }
        });

    }

    private void setImages(){
        Random r = new Random();
        correctAnswer = r.nextInt(4) +1;

        //generate random wrong answer
        int wrongAnswer1, wrongAnswer2, wrongAnswer3;

        do {
            wrongAnswer1 = r.nextInt(4);

        } while (wrongAnswer1 == images_numbers[turn]);

        do {
            wrongAnswer2 = r.nextInt(4);

        } while (wrongAnswer2 == images_numbers[turn] || wrongAnswer2 == wrongAnswer1);

        do {
            wrongAnswer3 = r.nextInt(4);

        } while (wrongAnswer3 == images_numbers[turn] || wrongAnswer3 == wrongAnswer2 || wrongAnswer3 == wrongAnswer1);

        switch (correctAnswer){
            case 1:
                image1.setImageResource(images[images_numbers[turn]]);
                image2.setImageResource(images[wrongAnswer1]);
                image3.setImageResource(images[wrongAnswer2]);
                image4.setImageResource(images[wrongAnswer3]);
                break;

            case 2:
                image1.setImageResource(images[wrongAnswer1]);
                image2.setImageResource(images[images_numbers[turn]]);
                image3.setImageResource(images[wrongAnswer2]);
                image4.setImageResource(images[wrongAnswer3]);
                break;
            case 3:
                image1.setImageResource(images[wrongAnswer1]);
                image2.setImageResource(images[wrongAnswer2]);
                image3.setImageResource(images[images_numbers[turn]]);
                image4.setImageResource(images[wrongAnswer3]);
                break;
            case 4:
                image1.setImageResource(images[wrongAnswer1]);
                image2.setImageResource(images[wrongAnswer2]);
                image3.setImageResource(images[wrongAnswer3]);
                image4.setImageResource(images[images_numbers[turn]]);
                break;
        }

        //set image for the question
        mainImage.setImageResource(image_bw[images_numbers[turn]]);

        //null stuff
        text2.setText("");
        btn1.setVisibility(View.INVISIBLE);
        image1.setEnabled(true);
        image2.setEnabled(true);
        image3.setEnabled(true);
        image4.setEnabled(true);
    }

    private void checkEnd() {
        showReward();
    }

    public void showReward() {
        final Dialog dialog=new Dialog(Main5Activity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.reward);
        Button home_guide=dialog.findViewById(R.id.home_guide);
        Button sure_guide=dialog.findViewById(R.id.sure_guide);
        TextView tv_score=dialog.findViewById(R.id.tv_score);
        tv_score.setText("Score: "+score);
        home_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WelcomeScreen2.class);
                intent.putExtra("Value2",score);
                intent.putExtra("Value1",turn-1);
                startActivity(intent);
                finish();
            }
        });

        sure_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        dialog.show();
    }

}
