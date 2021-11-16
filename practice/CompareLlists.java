import java.io.*;
import java.util.*;
public class CompareLlists.java {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();

        if(m!=n)System.out.print(0);
        else{
        LinkedList<Integer> l1=new <Integer>LinkedList();
        for(int i=0;i<n;i++) l1.add(sc.nextInt());
        LinkedList<Integer> l2=new <Integer>LinkedList();
        for(int i=0;i<n;i++) l2.add(sc.nextInt());
        
        while(!l1.isEmpty()&&!l2.isEmpty())
            {   //System.out.print(l1.get(0)+" "+l2.get(0)+" : ");
                
                if(l1.get(0)!=l2.get(0))
                {
                    System.out.println(0);
                    break;
                }
                
                l1.remove(0);
                l2.remove(0);
            }        
            
           if(l1.isEmpty()&&l2.isEmpty())System.out.println(1);
           
        }

    }
}
