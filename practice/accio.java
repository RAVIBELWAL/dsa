
import java.util.*;
 
public class accio {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //this size A
        int m=sc.nextInt(); //this size B

        int a[]=new int[n];
        int b[]=new int[m];

        int check=1;


        if(n<m||m<1||n<1)
        {
            System.out.print("NO");
        }

        else
        {
            try{
            for(int i=0;i<a.length;i++)
            {a[i]=sc.nextInt();}

            for(int i=0;i<b.length;i++)
            {b[i]=sc.nextInt();}


            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(a[i]==b[j] &&a[i]>=1 &&b[j]>=1)
                    {check=0;
                        System.out.println(a[i]+" - "+b[j] +"-"+check);
                        break; 
                    }

                }   
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
        catch(ArithmeticException e){
            System.out.print("NO");
        }
            
        }
    }
}