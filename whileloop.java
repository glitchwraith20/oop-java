import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        String response ="";

        while (!response.equals("Q")) {
            System.out.println("you are playing a game");
            System.out.println("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");
        */

        /* 
        int age = 0;

        while (age < 0) {
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age =scanner.nextInt();
            
        }

        System.out.printf("You are %d years old\n", age);
        */

        int number = 0;

        do {
            System.out.println("Enter a number between 1-10: ");
            number = scanner.nextInt();
        } 
        while (number < 1 || number > 10);

        System.out.printf("You picked %d\n", number);

        scanner.close();
    }
}
