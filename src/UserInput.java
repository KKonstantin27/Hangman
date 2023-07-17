import java.util.Scanner;

public class UserInput {
    public char userInput() {
        Scanner console = new Scanner(System.in);
        String letter;
        while (true) {
            System.out.println("Введите букву");
            letter = console.nextLine().toLowerCase();
            if (letter.length() == 1 && (letter.charAt(0) >= 'а' && letter.charAt(0) <= 'я' || letter.charAt(0) == 'ё')) {
                return letter.charAt(0);
            }
        }
    }
}
