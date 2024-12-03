import java.util.*;
public class Arith{
    public static void main(String args[]){
        Scanner S=new Scanner(System.in);
        int a,b,c,d,e,f,g;
        a=S.nextInt();
        b=S.nextInt();
        //Addition operation
        c=a+b;
        //Subtraction
        d=a-b;
        //Multiplication
        e=a*b;
        //Division
        f=a/b;
        //Modulus
        g=a%b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);      
    }
}