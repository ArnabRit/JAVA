public class stringExample {
    public static void main(String[] args) {
        String str1 = "Arnab Pramanick";
        String str2 = "TINT Student";
        String str3 = str1 + " " + str2;
        System.out.println("Concatenation of two strings: " + str3);
        int length = str1.length();
        System.out.println("Length of the string: " + length);
        int index = str1.indexOf('b');
        System.out.println("Index of 'b' in the string: " + index);
        String str4 = str1.replace('m', 'r');
        System.out.println("String after replacement: " + str4);
        String[] arr = str2.split(" ");
        for (String s : arr) {
            System.out.println(s);
		}
	}
}