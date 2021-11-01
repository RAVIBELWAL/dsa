import java.util.*;
    
    class leader{
        public static void main(String [] args)
        {
            
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
         
         for(int i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         
         int l=a.length;
         for(int i=0;i<l-1;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                  if(a[i]<=a[j])
                  {
                      break;
                  }
                  
                  if(j==n-1&&a[i]>a[j])
                  {
                      System.out.print(a[i]+" ");
                  }
             }
             
         }
         System.out.print(a[n-1]);
         
         
        }
    }
    