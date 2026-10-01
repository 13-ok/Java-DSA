import java.util.*;
public class Problem2{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int counter=1;
        int num = sc.nextInt();
        while(counter<=num){
            System.out.println(counter);
            counter++;
        }
    }
}