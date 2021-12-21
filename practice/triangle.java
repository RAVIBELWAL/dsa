
import java.util.*;
import java.io.*;

public class triangle {
    public static void main(String args[]) {
        //your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();

        a=a*a; b=b*b; c=c*c;

        if(c==a+b|| b==c+a || a==b+c ) //c2==a2+b2
        System.out.println("2");

        else if(a<b+c || b<a+c || c<a+b)    //actue a2<b2+c2
        System.out.println("1");

        else System.out.println("3");
    }
}
