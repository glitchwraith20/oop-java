public class arithmetic {
    public static void main(String[] args) {
        

        // Arithmetic Operators

        int x = 10;
        int y = 3;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        z = x % y;

        System.out.println(z);

        // Augmented Assignment Operators

        //x += y;
        //x -= y;
        //x *= y;
        //x /= y;
        //x %= y;

        //System.out.println(x);

        // Increment and Decrement

        //x += 1;
        //x++;
        //x--;

        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        /*
        P = Parenthesis;
        E = Exponent;
        M = Multiplication;
        D = Division;
        A = Addition;
        S = Subtraction;
        */

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

    }
}
