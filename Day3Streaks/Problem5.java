import java.util.Scanner;
        
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int num = sc.nextInt();

        if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0)) {
            System.out.println(num + " is a leap year");
        } else {
            System.out.println(num + " is not a leap year");
        }
    }
}