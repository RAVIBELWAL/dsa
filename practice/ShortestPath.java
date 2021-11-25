import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt(); // size of board
        int si=sc.nextInt();
        int sj=sc.nextInt();
        int ei=sc.nextInt();
        int ej=sc.nextInt();
        
        printShortestPath(si,sj,ei,ej);
	}
	
	    public static void printShortestPath(int si, int sj, int ei, int ej)
    {
        int row_diff=ei-si;
        int col_diff=ej-sj;
        int count=0;
        boolean possible=true;
        String s="";
        if(row_diff%2!=0)
            System.out.print("Impossible");
        
        else{
            while(ei!=si || ej!=sj)
            {
            System.out.print("Currently at : ("+si+","+sj+") ");
            row_diff=ei-si;
            col_diff=ej-sj;
            
            if(row_diff%2!=0||(si==0&&sj==0)){
            System.out.println("Impossible");
            possible=false;
            break;}
            
           if(row_diff<0)
            {
                if(col_diff<0)
                {
                  si=si-2;
                  sj=sj-1;
                  count++;
                  s+="UL ";
                  System.out.print("UL\n");
                }
                else
                {
                  si=si-2;
                  sj=sj+1; 
                  count++;
                   s+="UR ";
                   System.out.print("UR\n");
                }
              continue;  
            }
/////
        if(row_diff==0)
            {
                if(col_diff<0)
                {
                  si=si;
                  sj=sj-2;
                  count++;
                   s+="L ";
                   System.out.print("L\n");
                }
                else
                {
                  si=si;
                  sj=sj+2;
                  count++;
                   s+="R ";
                   System.out.print("R\n");
                }
              continue;
            }
/////
            if(row_diff>0)
            {
                if(col_diff<0)
                {
                  si=si+2;
                  sj=sj-1; 
                  count++;
                   s+="LL ";
                   System.out.print("LL\n");
                }
                else
                {
                  si=si+2;
                  sj=sj+1;
                  count++;
                   s+="LR ";
                   System.out.print("LR\n");
                }
              continue;
            }
//////
           }
            if(count!=0&&possible)
            System.out.print(count+"\n"+s);
        }
    }
}
