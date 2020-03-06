package au.edu.jcu.cp3406.guessinggame;


import java.lang.Math;

public class Game {
    private int guessNumber = (int)(Math.random() * 9 + 1 );

    public boolean check(int result){
        return (result == guessNumber);
    }
}
