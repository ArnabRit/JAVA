import java.util.Scanner;

public class extractsubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
	int length = inputString.length();
        System.out.println("Length of the string: " + length);

        System.out.print("Enter the starting index : ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the number of characters to extract: ");
        int numCharacters = scanner.nextInt();

        if (startIndex < 0 || startIndex >= inputString.length() ||
            numCharacters <= 0 || startIndex + numCharacters > inputString.length()) {
            System.out.println("Invalid input parameters.");
        } else {
            String extractedSubstring = extractSubstring(inputString, startIndex, numCharacters);
            System.out.println("Extracted substring: " + extractedSubstring);
        }

        scanner.close();
    }

    public static String extractSubstring(String str, int startIndex, int numCharacters) {
        char[] extractedChars = new char[numCharacters];
        for (int i = 0; i < numCharacters; i++) {
            extractedChars[i] = str.charAt(startIndex + i);
        }
        return new String(extractedChars);
    }
}
