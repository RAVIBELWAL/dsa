import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int k = 0; k < n; k++){
            int C = sc.nextInt();
            int P = sc.nextInt();
            int [] p = new int[P+1];
        
            for(int i = 1; i <= P;i++)p[i] = sc.nextInt();
        
            for(int i = 1; i <= P; i++){
                for(int j = i+1; j <= P; j++){
                    if(p[i]+p[j] == C){
                        System.out.println(i + " " + j);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
