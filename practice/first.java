
import java.util.*;
public class first{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //this size A
        int m=sc.nextInt(); //this size B

        int a[]=new int[n];
        int b[]=new int[m];

        int check=0;


        if(n<m)
        {
            System.out.print("NO");
        }
        else
        {
            for(int i=0;i<a.length;i++)
            {a[i]=sc.nextInt();}

            for(int i=0;i<b.length;i++)
            {b[i]=sc.nextInt();}


            for(int i=0;i<a.length-1;i++)
            {
                if(a[i]<1)
                {check=1;
                  i=n-1;}
            }

            for(int i=0;i<b.length-1;i++)
            {
                if(b[i]<1)
                { check=1;
                  i=m-1;}
            }

            if(check==0)
            {
                System.out.print("YES");
            }
            else
            {
                System.out.print("NO");
            }
        }

     
    }
}
