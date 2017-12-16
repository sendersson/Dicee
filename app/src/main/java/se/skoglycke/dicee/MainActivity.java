package se.skoglycke.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Kan skrivas Button kasta_tarning = (Button) findViewById(R.id.rollDice)

        Button kasta_tarning;
        kasta_tarning = (Button) findViewById(R.id.rollDice);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);

        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        kasta_tarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze button has been pressed!");

                Random randomNumberGenerator = new Random();
                Random randomNumberGenerator2 = new Random();

                int number = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator2.nextInt(6);

                leftDice.setImageResource(diceArray[number]);
                rightDice.setImageResource(diceArray[number2]);

                int tarning1 = number + 1;
                int tarning2 = number2 + 1;

                Log.d("Dicee", "The random number is: " +tarning1 +" and " +tarning2);

            }
        });
    }
}
