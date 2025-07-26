package Scanner;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- User Input with Scanner ---");

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.println("Hello, " + firstName + "!");

        scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        scanner.nextLine();

        System.out.print("Enter your favorite quote: ");
        String quote = scanner.nextLine();
        System.out.println("Your favorite quote: \"" + quote + "\"");

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();
        System.out.println("Your height is " + height + " meters.");

        scanner.nextLine();

        System.out.println("\n--- End of Demo ---");

        scanner.close();
    }
}