import java.util.Scanner;

class grade {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        char grade = calculate(marks);

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }

    public static char calculate(int marks) {
        if (marks >= 90) {
            return 'O';
        } else if (marks >= 80) {
            return 'E';
        } else if (marks >= 70) {
            return 'A';
        } else if (marks >= 60) {
            return 'B';
        } else if (marks >= 50){
	    return 'C';
	} else if (marks >= 40){
	    return 'D';
	}  else {
            return 'F';
        }
    }
}
