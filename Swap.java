import java.util.*;
public class Swap{
    public static void main(String args[]){
         Scanner S=new Scanner(System.in);
         int b=S.nextInt();
         int g=S.nextInt();
         int c=b;
         b=g;
         g=c;
         String res=String.format("After Swapping \nboy=%d\ngirl=%d",b,g);
         System.out.println(res);
    }
}