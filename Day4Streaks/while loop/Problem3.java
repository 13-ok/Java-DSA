public class Problem3{
    public static void main(String[] args){
        int sum=0;
        int counter=1;
        while(counter<=10){
           sum+=counter;
           counter++;
        }
        System.out.println("Sum: " + sum);
    }
}