public class Problem2{
    public static void main(String[] args){
        int n=13242;
        // logic to reverse the number
      while(n>0){
        int rem=n%10;
        System.out.print(rem);
        n=n/10;
      }
    }
}