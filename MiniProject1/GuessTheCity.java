package MiniProject1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GuessTheCity {
    private final int MAX_GUESS_COUNT = 10;
    private final String CHEAT_CODE = "plz tell me the answer!";

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

    private boolean canGuess() {
        return !this.isGameOver() && !this.isGameClear();
    }

    private boolean isGameOver() {
        return this.guessedCount >= this.MAX_GUESS_COUNT;
    }

    private boolean isGameClear() {
        return this.city.equals(this.maskedCity.toString());
    }

    private void guess(String letter) throws Exception {
        if (this.guessedCount >= this.MAX_GUESS_COUNT) {
            throw new Exception("You can't guess anymore.");
        }

        if (letter.length() != 1) {
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

    private boolean isCheatCode(String code) {
        return Objects.equals(code, CHEAT_CODE);
    }

    public void startGame() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Here's the question.");
        System.out.println(this.maskedCity.toString());
        while (this.canGuess()) {
            System.out.print("Guess a letter: ");
            String letter = scanner.nextLine();
            if (this.isCheatCode(letter)) {
                System.out.println();
                System.out.println("Psst! The answer: " + this.city);
                System.out.println();
            }
            this.guess(letter);

            System.out.println("You are guessing: " + this.maskedCity.toString());
            System.out.print("You have guessed (" + this.guessedCount + ")");
            System.out.println(
                    " wrong letters: "
                            + (this.wrongLetters.size() > 0 ? String.join(" ", this.wrongLetters) : "")
            );
        }

        if (this.isGameClear()) {
            System.out.println("You win!");
            System.out.println("You have guessed '" + this.city + "' correctly.");
        }

        if (this.isGameOver()) {
            System.out.println("You lose!");
            System.out.println("The correct word was'" + this.city + "'!");
        }
    }
}
