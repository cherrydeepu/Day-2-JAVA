import java.util.*;
public class andXor{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int b=S.nextInt();
        System.out.println((a|b)-(a&b));
     }
}