import java.util.Scanner;
public class Problem4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while(counter <= num){
            sum += counter;
            counter++;
        }
        System.out.println("Sum: " + sum);
    }
}