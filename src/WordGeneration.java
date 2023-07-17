import java.util.Random;

public class WordGeneration {
    private String word;
    private int wordSize;

    public WordGeneration(Dictionary dictionary) {
        Random random = new Random();
        word = dictionary.getDictionary().get(random.nextInt(dictionary.getDictionarySize()));
        wordSize = word.length();
    }

    public String getWord() {
        return word;
    }
    public int getWordSize() {
        return wordSize;
    }
}
