import java.util.*;
public class Swapp{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a=S.nextInt();
        int b=S.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        String res=String.format("After Swapping\nboy=%d\ngirl=%d",a,b);
        System.out.println(res);
    }
}