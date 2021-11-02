
import java.util.*;
public class toSumInAnArray {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
 
        int arr_len = sc.nextInt(); 
        int target = sc.nextInt(); 
 
        int[] arr = new int[arr_len];
        int[] tmp_arr = new int[arr_len];
        for (int i = 0; i< arr_len; i++) {
            arr[i] = sc.nextInt();         // Scanning array for O(n)
            tmp_arr[i] = arr[i];           // copying array in to another array for O(n)
        }
 
        Arrays.sort(arr);     //   sorting array for O(n logn)
 
        int start = 0, end = arr_len - 1;
        while (start < end) {                             //    finding out index of two nums in sorted arrays using two pointers
            if (arr[start] + arr[end] < target) {         //    whose sum equal to target
                start++;                                  //    time complexity O(n)
            }
            else if (arr[start] + arr[end] > target) {
                end--;
            }
            else {
                break;
            }
        }
 
        for (int i = 0; i < arr_len; i++) {       // using above found start to find the num in the original array
            if (arr[start] == tmp_arr[i]) {       // time complexity O(n)
                start = i;
                break;
            }
        }
 
        for (int i = 0; i < arr_len; i++) {                // using above found end to find the num in the original array
            if (i != start && arr[end] == tmp_arr[i]) {   // time complexity O(n)
                end = i;
                break;
            }
        }
 
        if( start < end){                                // to print index in increasing order
            System.out.println(start + " " + end);
        }
        else {
            System.out.println(end + " " + start);
        }
    }
}