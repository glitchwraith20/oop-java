import java.util.Scanner;

public class inputMethod {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("What's your GPA? ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (yes/no): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);

        if (isStudent) {
            System.out.println("Yuo are enrolled as a student");
        } else {
            System.out.println("You are NOT enrolled as a student");
        }

        scanner.close();
    }    
}
