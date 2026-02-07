import java.util.Scanner;

public class forloop {
    public static void main(String[] args) throws InterruptedException {

        // for loop  =execute some code a CERTAIN amount of time

        Scanner scanner = new Scanner(System.in);

        /* 
        System.out.println("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for (int i = 1; i < max; i++) {
            System.out.println(i);
        }
        */

        int start;

        System.out.print("How seconds to countdown from: ");
        start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("HAPPY NEW YEAR1");

        scanner.close();
    }
}
