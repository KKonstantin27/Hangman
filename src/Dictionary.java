import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
    private List<String> dictionary = new ArrayList<>();
    private int dictionarySize;

    public Dictionary() {
        Path russian_nouns = Path.of("resources/russian_nouns.txt");
        try (Scanner scanner = new Scanner(russian_nouns)) {
            while (scanner.hasNextLine()) {
                dictionary.add(scanner.nextLine());
            }
            dictionarySize = dictionary.size();
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
    public List<String> getDictionary() {
        return dictionary;
    }

    public int getDictionarySize() {
        return dictionarySize;
    }

}
