public class S_S {
    public static void main(String[] args) {
        String input = "Hello,World,Java,Programming";
        String delimiter = ",";

        String[] substrings = input.split(delimiter);

        System.out.println("Original String: " + input);
        System.out.println("Substrings:");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
