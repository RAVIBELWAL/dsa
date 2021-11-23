import java.util.*;
public class Paren
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		valid_paren(0,n,2*n,"");
	}
	
	public static void valid_paren(int state,int n,int size,String str)
	{
        if(state<0 || size<0 || n<0){
        return;}
        
        if(size == 0){
        System.out.println(str);
        return;}
        
        valid_paren(state+1, n-1, size-1, str+'(');
        valid_paren(state-1, n, size-1, str+')');
 
    return;
	}
}
