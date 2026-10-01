import java.util.Scanner;
public class Problem4{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num==2){
            System.out.println("2 is a prime number");
        }else{
            boolean isPrime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num + " is a prime number");
            }else{
                System.out.println(num + " is not a prime number");
            }
        }
    }
}