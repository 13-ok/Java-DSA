//greater in 3 number
public class Problem3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        if (a > b && a > c) {
            System.out.println("a is the greatest.");
        } else if (b > a && b > c) {
            System.out.println("b is the greatest.");
        } else {
            System.out.println("c is the greatest.");
        }
    }
}