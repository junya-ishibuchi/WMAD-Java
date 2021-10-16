package MiniProject1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Path file = Paths.get("src/MiniProject1/cities.txt");
        List<String> cities = Files.readAllLines(file);

        Random rnd = new Random();
        int index = rnd.nextInt(cities.size());

        GuessTheCity guessTheCity = new GuessTheCity(cities.get(index));

        System.out.println("Here's the question.");
        System.out.println("_________");
        while (guessTheCity.canGuess()) {
            System.out.print("Guess a letter: ");
            String letter = scanner.nextLine();
            guessTheCity.guess(letter);

            System.out.println("You are guessing: " + guessTheCity.getMaskedCity().toString());
            System.out.print("You have guessed (" + guessTheCity.getGuessedCount() + ")");
            System.out.println(
                    " wrong letters: "
                            + (guessTheCity.getWrongLetters().size() > 0 ? String.join(" ", guessTheCity.getWrongLetters()) : "")
            );
        }

        if (guessTheCity.isGameClear()) {
            System.out.println("You win!");
            System.out.println("You have guessed '" + guessTheCity.getCity() + "' correctly.");
            return;
        }

        if (guessTheCity.isGameOver()) {
            System.out.println("You lose!");
            System.out.println("The correct word was'" + guessTheCity.getCity() + "'!");
            return;
        }
    }
}
