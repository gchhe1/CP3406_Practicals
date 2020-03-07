package au.edu.jcu.cp3406.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Game game;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
    }


    public void checkGuess(View view){
        text = findViewById(R.id.editText);
        int guessNumber = Integer.parseInt(text.getText().toString());

        if(!game.check(guessNumber)){
            Toast.makeText(getApplicationContext(), "Incorrect guess, Try again!",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "You're correct!!", Toast.LENGTH_LONG).show();
            game = new Game();

        }
    }
}
