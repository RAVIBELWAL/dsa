import java.util.*;
import java.io.*;
 
public class Strange {
 
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < n; i++){
        
            char ch = (char) ((i % 26) + 97);
        
            if(i % 2 == 0){
                str.insert(0, ch);
            }
            else{
                str.append(ch);
            }
        }
        
        System.out.println(str);
    }
}
