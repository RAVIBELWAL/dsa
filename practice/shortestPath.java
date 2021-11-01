import java.util.*;
import java.lang.Math;

public class shortestPath{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=3;//sc.nextInt();
        Integer arr[]={1,3,2};//new Integer[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();
         }
        
        Arrays.sort(arr, Collections.reverseOrder());
        //System.out.println(Arrays.toString(arr));
        int shortestMiles=0;
        for(int i=0;i<n;i++)
        {
            shortestMiles+=Math.pow(2,i)*arr[i];
        }
        
        System.out.print(shortestMiles);
        
    }
}