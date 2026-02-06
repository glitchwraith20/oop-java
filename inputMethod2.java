import java.util.Scanner;

public class inputMethod2 {
    
    public static void main(String[] args) {
        
        // Calculate the area of a rectangle
        
        double width;
        double height;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextDouble();

        System.out.println("Enter width: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is " + area + " cm^2");

        scanner.close();
    }
}
