public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // unary operators
        int c = 10;
        System.out.println("Value of c: " + c);
        c++; // post-increment
        System.out.println("Value of c after post-increment: " + c);
        c--; // post-decrement
        System.out.println("Value of c after post-decrement: " + c);   
        //pre-increment
        ++c;
        System.out.println("Value of c after pre-increment: " + c);
        //pre-decrement
        --c;
        System.out.println("Value of c after pre-decrement: " + c); 
    }
}