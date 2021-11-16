import java.util.*;
public class HeightProblem
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
 
         for(int i=0;i<n;i++)
         arr[i]=sc.nextInt();
 
        Stack <Integer> stk=new <Integer>Stack();
        
        for(int i=0;i<n;i++)
        {  
           
           while(!stk.isEmpty()&&stk.peek()>=arr[i])
           stk.pop();
           
          if(stk.isEmpty())
          System.out.print("-1 "); 
            
            
          else System.out.print(stk.peek()+" ");
              
          stk.push(arr[i]);
        } 
    }
}

/*
test cases
5
1 2 3 4 5
on leetcode
*/
