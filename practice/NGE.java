import java.io.*;
import java.util.*;
public class NGE
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
     
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
   
        Stack<Integer> st = new Stack<Integer>();
 
        int nextGreater[] = new int[n];
 
        for ( int i = n - 1; i >= 0; --i )
        {
            while( st.size() > 0 && st.peek() <=  arr[i] )
            {
                st.pop();
            }
 
            if ( st.size() > 0 )
                nextGreater[i] = st.peek();
 
            else
                nextGreater[i] = -1;
 
            st.push(arr[i]);
        }
 
        for ( int i = 0; i < n; ++i )
            System.out.print( nextGreater[i] + " ");
    }
}
 
 
