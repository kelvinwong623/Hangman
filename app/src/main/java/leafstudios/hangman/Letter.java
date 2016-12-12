package leafstudios.hangman;

/**
 * Created by Kelvin Wong on 12/11/2016.
 */

public class Letter {
    private char character;
    private boolean used;

    public Letter(char letter) {
        character = letter;
        used = false;
    }

    public char getLetter() {
        return character;
    }

    public boolean isUsed() {
        return used;
    }

    public void changeUsed() {
        if (used) {
            used = false;
        } else{
                used = true;
        }
    }
}
