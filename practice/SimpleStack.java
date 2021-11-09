
import java.util.*;

public class SimpleStack
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> stk=new Stack<>();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char c=s.charAt(i);
            stk.push(c);
        }
        
        for(int i=0;i<l;i++)
        System.out.print(stk.pop());

	}
}
