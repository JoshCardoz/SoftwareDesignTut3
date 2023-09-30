import java.util.Scanner;

public class Keyboard {
    public static int getInput(){

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a valid ID: ");


        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please try again.");
            scanner.next();
        }
        int userNumber = scanner.nextInt();


        System.out.println("You entered: " + userNumber);


        scanner.close();

        return userNumber;

        }
    }
