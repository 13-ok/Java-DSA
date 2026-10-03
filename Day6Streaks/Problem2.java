public class Problem2{
    public static void main(String[] args){
        int num=4;
        char ch='A';
        for(int line=1;line<=num;line++){
            for(int i=1;i<=line;i++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }   
}
}