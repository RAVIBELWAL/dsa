
import java.util.*;
import java.io.*;

public class BBrackets {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     
     int n=sc.nextInt();
     String arr[]=new String[n];   //{"{[()]}","{{[[(())]]}}","{[(])}"};
     
     for(int i=0;i<n;i++)
     arr[i]=sc.next();
     
    
     for(int j=0;j<n;j++)
    {    Stack<Character> stk=new <Character>Stack();
        String s=arr[j];
        int l=s.length();
        
        if(l%2!=0)
        {
           System.out.print("NO\n"); 
            continue;
        }
        
        else   
        for(int i=0;i<l;i++)
        {  char c=s.charAt(i);
            
            if(c=='{'||c=='['||c=='(')
            stk.push(c);
            
            else if(stk.isEmpty()&&(c==')'||c=='}'||c==']'))
            {//ans=0;
              continue;
            }
            
            else if(!stk.isEmpty()
                        &&(c=='}'&&stk.peek()=='{')||(c==']'&&stk.peek()=='[')||(c==')'&&stk.peek()=='('))
            stk.pop();
            else stk.push(c); 
        }
        
            String ans=(stk.isEmpty()?"YES":"NO");
            System.out.print(ans+"\n");
    }
    
    }
}
