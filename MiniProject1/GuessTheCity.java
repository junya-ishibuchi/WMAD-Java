package MiniProject1;

import java.util.ArrayList;

public class GuessTheCity {
    private final int MAX_GUESS_COUNT = 10;

    private final String city;
    private StringBuilder maskedCity;

    private int guessedCount;
    private final ArrayList<String> wrongLetters = new ArrayList<>() ;

    public GuessTheCity(String city) {
        this.city = city;
        this.setMaskedCity();
    }

    private void setMaskedCity() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.city.length(); i++) {
            sb.append("_");
        }

        this.maskedCity = sb;
    }

    public void guess(String letter) throws Exception {
        if (this.guessedCount >= this.MAX_GUESS_COUNT) {
            throw new Exception("You can't guess anymore.");
        }

        if (letter.length() > 1) {
            return;
        }

        int indexOfMaskedLetters = this.maskedCity.indexOf(letter);
        int index = this.city.indexOf(letter, Math.max(indexOfMaskedLetters + 1, 0));
        if (index < 0) {
            this.wrongLetters.add(letter);
            this.guessedCount++;
            return;
        }

        this.maskedCity.setCharAt(index, letter.charAt(0));
    }

    public boolean canGuess() {
        return !this.isGameOver() && !this.isGameClear();
    }

    public boolean isGameOver() {
        return this.guessedCount >= this.MAX_GUESS_COUNT;
    }

    public boolean isGameClear() {
        return this.city.equals(this.maskedCity.toString());
    }

    public String getCity() {
        return city;
    }

    public StringBuilder getMaskedCity() {
        return maskedCity;
    }

    public int getGuessedCount() {
        return guessedCount;
    }

    public ArrayList<String> getWrongLetters() {
        return this.wrongLetters;
    }
}
