import java.util.*;
public class Operate{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a,b,c,d,e,f;
        a=S.nextInt();
        b=S.nextInt();
        c=a++ + ++b;
        d=a-- - --b;
        e=a++ - ++b;
        f=a-- + --b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}