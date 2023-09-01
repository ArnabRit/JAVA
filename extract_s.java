import java.util.Scanner;

public class extract_s {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String p= a.nextLine();
	int length = p.length();
        System.out.println("Length of the string: " + length);

        System.out.print("Enter the starting index : ");
        int S_I = a.nextInt();

        System.out.print("Enter the number of characters to extract: ");
        int q = a.nextInt();

        if (S_I < 0 || S_I >= p.length()||q<= 0 || (p + q) > p.length()) {
            System.out.println("Invalid input parameters.");
        } else {
            String extract_s = extract_s(p,S_I, q);
            System.out.println("Extracted substring: " + extract_s);
        }

        Scanner.Close();
    }

    public static String extract_s(String str, int S_I, int q) {
        char[] extract_c = new char[q];
        for (int i = 0; i < q; i++) {
            extract_c[i] = str.charAt(S_I + i);
        }
        return new String(extract_c);
    }
}
