// class prasad{
//     public static void main(Strings[] args){
//         System.out.println("prasad");
//     }
// }
import java.util.Scanner;

public class rasad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repeat;

        do {
            // Ask the user to enter two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate and display the sum
            int sum = num1 + num2;
            System.out.println("Sum: " + sum);

            // Display multiplication table for the sum
            System.out.println("Multiplication Table for " + sum + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(sum + " x " + i + " = " + (sum * i));
            }

            // Ask the user if they want to repeat the operation
            System.out.print("Do you want to perform the operation again? (y/n): ");
            repeat = scanner.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        // Close the scanner
        scanner.close();
    }
}
