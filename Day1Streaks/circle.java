import java.util.Scanner;
public class circle{
    public static void main(String[] args){
        System.out.println("  Enter the radius of the circle: ");   
        Scanner sc= new Scanner(System.in);
        double r= sc.nextDouble();
        double area= Math.PI * r * r;
        System.out.println("The area of the circle is: "+area);
    }
}