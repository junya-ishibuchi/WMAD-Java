package MiniProject1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Driver {
    public static void main(String[] args) throws Exception {
        Path file = Paths.get("src/MiniProject1/cities.txt");
        List<String> cities = Files.readAllLines(file);

        Random random = new Random();
        int index = random.nextInt(cities.size());

        GuessTheCity guessTheCity = new GuessTheCity(cities.get(index));
        guessTheCity.startGame();
    }
}
