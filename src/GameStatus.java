import java.util.ArrayList;
import java.util.List;

public class GameStatus {
    private int mistakeCounter;
    private String[] currentWordStatus;
    private String currentWord;
    private List<Character> mistakeLetters = new ArrayList<>();


    public GameStatus() {
        Dictionary dictionary = new Dictionary();
        WordGeneration wordGeneration = new WordGeneration(dictionary);
        currentWord = wordGeneration.getWord();
        currentWordStatus = new String[wordGeneration.getWordSize()];
        for (int i = 0; i < wordGeneration.getWordSize(); i++) {
            currentWordStatus[i] = "_";
        }
    }
    public String displayLetters() {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < currentWordStatus.length; i++) {
            word.append(currentWordStatus[i] + " ");
        }
        return word.toString();
    }

    public boolean isGameWon() {
        boolean isWordGuess = true;
        for (int i = 0; i < currentWordStatus.length; i++) {
            if (currentWordStatus[i] == "_") {
                isWordGuess = false;
            }
        }
        if (mistakeCounter < 6 && isWordGuess) {
            return true;
        }
        return false;
    }

    public boolean isGameLost() {
        if (mistakeCounter == 6) {
            return true;
        }
        return false;
    }

    public int getMistakeCounter() {
        return mistakeCounter;
    }
    public void setMistakeCounter(int mistakeCounter) {
        this.mistakeCounter = mistakeCounter;
    }
    public String[] getCurrentWordStatus() {
        return currentWordStatus;
    }
    public List<Character> getMistakeLetters() {
        return mistakeLetters;
    }
    public String getCurrentWord() {
        return currentWord;
    }
}
