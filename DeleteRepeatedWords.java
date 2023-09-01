import java.util.HashMap;
import java.util.Scanner;
public class DeleteRepeatedWords {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = deleteRepeatedWords(input);
        System.out.println(result);
    }
    public static String deleteRepeatedWords(String input) {
        String[] words = input.split("\\s+");
        Hashmap<String, Integer> wordFrequency = new HashMap<>();
        StringBuilder resultBuilder = new StringBuilder();

        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                int count = wordFrequency.get(word);
                wordFrequency.put(word, count + 1);
            } else {
                wordFrequency.put(word, 1);
                resultBuilder.append(word).append(" ");
            }
        }

        return resultBuilder.toString().trim();
	}
}