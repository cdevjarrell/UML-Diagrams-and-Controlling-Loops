import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int x = 0;
        int y = 0;

        // Keep displaying menu until choose to exit
        while (choice != 5) {

            // Display menu options
            System.out.println("1 - Enter two (2) numbers (x and y)");
            System.out.println("2 - Print all numbers between x and y");
            System.out.println("3 - FInd the average of all numbers between x and y");
            System.out.println("4 - Find all prime numbers between x and y");
            System.out.println("5 - Exit");

            // Read menu selection
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();

            // Option 1: Get x and y from input
            if (choice == 1) {
                System.out.print("Enter x value: ");
                x = scanner.nextInt();
                System.out.print("Enter y value: ");
                y = scanner.nextInt();
                System.out.println("You enetered x = " + x + " and y = " + y);
            }

            // Option 2: Print all numbers between x and y
            else if (choice == 2) {
                System.out.println("Numbers between " + x + " and " + y + ":");
                // Loop from x to y and print
                for (int i = x; i <= y; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            // Option 3: Find the average of all numbers between x and y
            else if (choice == 3) {
                int sum = 0;
                int count = 0;
                // Loop from x to y, add each number to the sum
                for (int i = x; i <= y; i++) {
                    sum += i;
                    count++;
                }
                // Calculate and display average
                double average = (double) sum / count;
                System.out.println("The average of all numbers between " + x + " and " + y + " is: " + average);
            }
        }

        // Exit message when choice 5 is selected
        System.out.println("Until next time!");
        scanner.close();
    }
}