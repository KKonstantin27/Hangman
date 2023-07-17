import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HangmanDrawing {
    public static void drawHangman(GameStatus gameStatus) {
        switch (gameStatus.getMistakeCounter()) {
            case (0):
                System.out.println("    _______\n" +
                                   "   |       |\n" +
                                   "   |       |\n" +
                                   "   |\n" +
                                   "   |\n" +
                                   "   |\n" +
                                   "   |\n" +
                                   "   |\n" +
                                   "   |\n" +
                                   "-------\n" + "Количество ошибок: " + gameStatus.getMistakeCounter() +
                                   " из 6" + "\n" + "Ошибки: " + gameStatus.getMistakeLetters() + "\n" + gameStatus.displayLetters());
                break;
            case (1):
                System.out.println("    _______\n" +
                        "   |       |\n" +
                        "   |       |\n" +
                        "   |       \uD83D\uDE13\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "-------\n" + "Количество ошибок: " + gameStatus.getMistakeCounter() +
                        " из 6" + "\n" + "Ошибки: " + gameStatus.getMistakeLetters() + "\n" + gameStatus.displayLetters());
                break;
            case (2):
                System.out.println("    _______\n" +
                        "   |       |\n" +
                        "   |       |\n" +
                        "   |       \uD83D\uDE22\n" +
                        "   |       |\n" +
                        "   |       |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "-------\n" + "Количество ошибок: " + gameStatus.getMistakeCounter() +
                        " из 6" + "\n" + "Ошибки: " + gameStatus.getMistakeLetters() + "\n" + gameStatus.displayLetters());
                break;
            case (3):
                System.out.println("    _______\n" +
                        "   |       |\n" +
                        "   |       |\n" +
                        "   |       \uD83D\uDE25\n" +
                        "   |      /|\n" +
                        "   |     / |\n" +
                        "   |    O\n" +
                        "   |\n" +
                        "   |\n" +
                        "-------\n" + "Количество ошибок: " + gameStatus.getMistakeCounter() +
                        " из 6" + "\n" + "Ошибки: " + gameStatus.getMistakeLetters() + "\n" + gameStatus.displayLetters());
                break;
            case (4):
                System.out.println("    _______\n" +
                        "   |       |\n" +
                        "   |       |\n" +
                        "   |       \uD83D\uDE28\n" +
                        "   |      /|\\\n" +
                        "   |     / | \\\n" +
                        "   |    O     O\n" +
                        "   |\n" +
                        "   |\n" +
                        "-------\n" + "Количество ошибок: " + gameStatus.getMistakeCounter() +
                        " из 6" + "\n" + "Ошибки: " + gameStatus.getMistakeLetters() + "\n" + gameStatus.displayLetters());
                break;
            case (5):
                System.out.println("    _______\n" +
                        "   |       |\n" +
                        "   |       |\n" +
                        "   |       \uD83D\uDE30\n" +
                        "   |      /|\\\n" +
                        "   |     / | \\\n" +
                        "   |    O /   O\n" +
                        "   |     /\n" +
                        "   |    O\n" +
                        "-------\n" + "Количество ошибок: " + gameStatus.getMistakeCounter() +
                        " из 6" + "\n" + "Ошибки: " + gameStatus.getMistakeLetters() + "\n" + gameStatus.displayLetters());
                break;
            case (6):
                System.out.println("    _______\n" +
                        "   |       |\n" +
                        "   |       |\n" +
                        "   |       \uD83D\uDC80\n" +
                        "   |      /|\\\n" +
                        "   |     / | \\\n" +
                        "   |    O / \\ O\n" +
                        "   |     /   \\\n" +
                        "   |    O     O\n" +
                        "-------\n" + "Количество ошибок: " + gameStatus.getMistakeCounter() +
                        " из 6" + "\n" + "Ошибки: " + gameStatus.getMistakeLetters() + "\n" + gameStatus.displayLetters());
                break;
        }
    }
}
