import java.util.Scanner;
class D_R_W {
    public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String p= a.nextLine();
        String[] words = p.split("\\s+");
        
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!result.toString().contains(word)) {
                result.append(word).append(" ");
            }
        }
        
        System.out.println("Original String: " + p);
        System.out.println("String with Repeated Words Removed: " + result.toString().trim());
    }
}
