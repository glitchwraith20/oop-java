import java.util.Scanner;

public class enhancedswitch {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //                   (Java14 features)

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It is a week day");
            case "Saturday","Sunday" -> 
                System.out.println("It is a weekend day");
            default -> System.out.println(day + " not a day");
        }
        
        scanner.close();
    }
}
