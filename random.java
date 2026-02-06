import java.util.Random;

public class random {
    public static void main(String[] args) {
        
        Random random = new Random();

        double number;
        boolean isHeads;

        isHeads = random.nextBoolean();

        number = random.nextDouble(1, 7);
        
        if (isHeads) {
            System.out.println("HEADS");
        }
        else {
            System.out.println("TAILS");
        }
        
        System.out.println(number);

    }
}
