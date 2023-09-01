import java.util.Scanner;
public class RemoveRepeatedWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String input = scanner.nextLine();
        String result = removeRepeatedWords(input);
        System.out.println(result);
    }
    
    public static String removeRepeatedWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (!isWordRepeated(words, i)) {
                result.append(words[i]);
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
        }

        return result.toString();
    }

    public static boolean isWordRepeated(String[] words, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (words[i].equals(words[currentIndex])) {
                return true;
            }
        }
        return false;
    }
}
