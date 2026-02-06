import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args) {
        
        // SHOPPING CART PROGRAM
        Scanner cart = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would like to buy? ");
        item = cart.nextLine();

        System.out.print("What's the price for each? ");
        price = cart.nextDouble();

        System.out.print("How many would you like? ");
        quantity = cart.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        cart.close();
    }
}
