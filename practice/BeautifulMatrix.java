
import java.util.*;

public class BeautifulMatrix {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a[][]=new int[5][5];
       int indexI=-1,indexJ=-1;
       for(int i=0;i<5;i++)
       {
           for(int j=0;j<5;j++)
           {
               
               int num=sc.nextInt();
               a[i][j]=num;
               if(num!=0)
               {indexI=i;indexJ=j;}
           }
       }

       int m=(5-0)/2 ,counti=0,countj=0;
       if(indexI<m)
       {int temp=0;
        while(indexI!=m)
        {   System.out.println("index=m "+indexI+" = "+m);
            temp++;indexI++;  
            System.out.println("-> "+indexI+" = "+m);
        }
        counti=temp;
        
       }

        if(indexI>m)
       {int temp=0;
        while(indexI!=m)
        {   System.out.println("index=m "+indexI+" = "+m);
            temp++;indexI--;  
            System.out.println("-> "+indexI+" = "+m);
        }
        counti=temp;
        
       }

        if(indexJ>m)
       {int temp=0;
        while(indexJ!=m)
        {   System.out.println("index=m "+indexJ+" = "+m);
            temp++;indexJ--; 
             System.out.println("->"+indexJ+" = "+m);
        }
        countj=temp;
       }

        if(indexJ<m)
       {int temp=0;
        while(indexJ!=m)
        {   System.out.println("index=m "+indexJ+" = "+m);
            temp++;indexJ++; 
             System.out.println("->"+indexJ+" = "+m);
        }
        countj=temp;
       }

       //System.out.println(indexI+" , "+indexJ+" : "+m);
       System.out.println(counti+" : "+countj+" -> "+(counti+countj));
      // System.out.println(counti+countj);
    }
}