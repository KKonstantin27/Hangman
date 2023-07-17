import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("Введите: \n 1) \"Старт\", чтобы начать новую игру \n 2) \"Выход\", чтобы выйти из игры");
            String userInput = console.nextLine();
            GameLogic game = new GameLogic();
            if (userInput.equalsIgnoreCase("Старт")) {
                game.gameStart();
            } else if (userInput.equalsIgnoreCase("Выход")) {
                break;
            }
        }
    }
}