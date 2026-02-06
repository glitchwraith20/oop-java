

public class variables {
    
    public static void main(String[] args) {
        
        // Primitive data types

        // int data types
        int age = 21; 
        int year = 2026;
        int quantity = 1;

        System.out.println(age);
        System.out.println("The year is " + year);
        System.out.println(quantity);

        // double data types
        double price = 89000;
        double gpa = 3.4;
        double temperature = 12.5;

        System.out.println("$" + price);
        System.out.println("GPA: " + gpa);
        System.out.println(temperature);

        // char data type
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        // boolean data typ
        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;

        System.out.println(forSale);

        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are NOT a student!");
        }

        if (isOnline) {
            System.out.println("You are online!");
        } else {
            System.out.println("You are NOT online!");
        }


        // Reference data types

        // string data type
        String name = "GlitchWraith";
        String food = "pizza";
        String email = "ghostguy20@proton.me";
        String car = "Dodge Hellcat Challenger";
        String color = "blue";

        System.out.println("Hello " + name);
        System.out.println("Your email is " + email + " and your favorite food is " + food);
       System.out.println("Your choice is a " + color + " " + year + " " + car);
       System.out.println("The price is " +
        price
       );
       
       if (forSale) {
        System.out.println("There is a " + car + " for sale");
       } else {
        System.out.println("The " + car + " is not for sale");
       }


    }
}
