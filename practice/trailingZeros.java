import java.util.*;
public class trailingZeros
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=0;
    int power=5; //power of 5
        while(n/power>0)   //5/5^1=1 +5/5^2= 0 ; ans =0+1 =>1, n/5^1 + n/5^2+...till (n/5^x =0) 
        {
            ans+=(n/power);
            power=power*5;
        }
        
    System.out.print(ans);
	}
}
