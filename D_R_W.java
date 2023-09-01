import java.util.HashMap;

public class DeleteRepeatedWords {
    public static void main(String[] args) {
        String input = "Arnab Pramanick Arnab rit TINT TINT JAVA.";
        String result = deleteRepeatedWords(input);
        System.out.println(result);
    }

    public static String deleteRepeatedWords(String input) {
        String[] words = input.split("\\s+");
        HashMap<String, Integer> wordFrequency = new HashMap<>();

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