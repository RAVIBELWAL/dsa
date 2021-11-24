import java.util.*;
public class ShortestPath
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=7;
        int si=6;
        int sj=6;
        int ei=0;
        int ej=1;
        
        printShortestPath(si,sj,ei,ej);
        
    }
    
    public static void printShortestPath(int si, int sj, int ei, int ej)
    {
        int row_diff=ei-si;
        int col_diff=ej-sj;
        int count=0;
        String s="";
        if(row_diff%2!=0)
            System.out.print("Impossible");
        
        else{
            while(ei!=si || ej!=sj)
            {
            row_diff=ei-si;
            col_diff=ej-sj;
            
            if(row_diff<0)
            {
               
                if(col_diff<0)
                {
                  si=si-2;
                  sj=sj-1;
                  count++;
                  s+="UL ";
                  
                }
                else
                {
                  si=si-2;
                  sj=sj+1; 
                  count++;
                   s+="UR ";
                }
              continue;  
            }
            if(row_diff>0)
            {
                
                if(col_diff<0)
                {
                  si=si+2;
                  sj=sj-1; 
                  count++;
                   s+="LL ";
                }
                else
                {
                  si=si+2;
                  sj=sj+1;
                  count++;
                   s+="LR ";
                }
              continue;
            }
            if(row_diff==0)
            {
               
                if(col_diff<0)
                {
                  si=si;
                  sj=sj-2;
                  count++;
                   s+="L ";
                }
                else
                {
                  si=si;
                  sj=sj+2;
                  count++;
                   s+="R ";
                }
              continue;
            }
           }
           
            if(count!=0)
            System.out.print(count+" "+s);
        }
    }
}
