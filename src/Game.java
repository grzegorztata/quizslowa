import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        String[] words = {"zegar", "lampa", "obrazek", "kwiat", "tomek", "stół", "tablica"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String response;
        while (true) { //obraca się w nieskończoność
            String word = words[random.nextInt(words.length)];

            System.out.println("Twoje wylosowane slowo: " + word);
            System.out.print("Podaj Slowo: ");
            response = scanner.nextLine();

            if(word.equalsIgnoreCase(response)) {
                System.out.println("Gratulacje!");
            }
        }
    }
}
