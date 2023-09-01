import java.util.Scanner;
public class splitstring {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int numberOfSubstrings = 4;
        String[] substrings = splitIntoSubstrings(input, numberOfSubstrings);
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
    public static String[] splitIntoSubstrings(String input, int numberOfSubstrings) {
        int length = input.length();
        int substringLength = (int) Math.ceil((double) length / numberOfSubstrings);

        String[] substrings = new String[numberOfSubstrings];
        int startIndex = 0;

        for (int i = 0; i < numberOfSubstrings; i++) {
            int endIndex = Math.min(startIndex + substringLength, length);
            substrings[i] = input.substring(startIndex, endIndex);
            startIndex = endIndex;
        }

        return substrings;
	}
}