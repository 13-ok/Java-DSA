import java.util.Scanner;
public class Problem1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            
            int num = sc.nextInt();
            if(num%2==0){
                break;
            }
            System.out.print("Enter a number: ");
        }while(true);
    }
}