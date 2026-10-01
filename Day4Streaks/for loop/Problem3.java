import java.util.*;
public class Problem3{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0){
            int rem=num%10;
            System.out.print(rem);
            num=num/10;
        }
    }
}