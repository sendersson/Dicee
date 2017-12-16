package se.skoglycke.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button kasta_tarning;
        kasta_tarning = (Button) findViewById(R.id.kasta_tarning);

        ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);

        ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        kasta_tarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze button has been pressed!");
            }
        });
    }
}
