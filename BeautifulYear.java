import java.util.*;
class BeautifulYear {
    public static void main(String args[]) {
        //your code here
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int num=sc.nextInt();
        int j=0,ans=0;
        int tempNum=0;
        boolean check=false;
        for( j=num+1;j<=9000;j++)
        {
        tempNum=j;
        //System.out.println(tempNum);
        for(int i=0;i<4;i++)
        {   
            int div=(tempNum/(pow(10,(3-i))));
            tempNum=tempNum%(pow(10,(3-i)));
            arr[div]++;
            if(arr[div]>1)
            {
            check=false;
            num++;
            break;
            }
        }
        
         for(int i=0;i<10;i++)
         {
          if(arr[i]<=1){check=true; ans=j;}
          else{ check=false;
            for(int k=0;k<10;k++)
            arr[k]=0;
          break; }
         }
         
         if(check==true)
         break;
      }
        System.out.print(ans);     
    }
    
    public static int pow(int n,int p)
    {   int ans=1;
        for(int i=0;i<p;i++)
        ans*=n;
        
        return ans;
    }  
}
