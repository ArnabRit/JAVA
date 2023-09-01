import java.util.Scanner;
public class R_R_C {
    public static String removeRepeatedCharacters(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        
        char[] chars = input.toCharArray();
        int length = chars.length;
        int tail = 1;
        
        for (int i = 1; i < length; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if (chars[i] == chars[j]) {
                    break;
                }
            }
            if (j == tail) {
                chars[tail] = chars[i];
                tail++;
            }
        }
        
        return new String(chars, 0, tail);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String input = scanner.nextLine();
        String result = removeRepeatedCharacters(input);
        System.out.println("Original string: " + input);
        System.out.println("String with repeated characters removed: " + result);
    }
}
