//leetcode Minimum Index Sum of Two Lists

import java.util.*;
public class MinIndex
{
	public static void main(String[] args) {
    String list1[] = {"Shogun","Tapioca Express","Burger King","KFC"};
    String list2[] = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
    String result[]=findRestaurant(list1,list2);
    System.out.println("["+'"'+result[0]+'"'+"]");
    
	}
	
	    public static String[] findRestaurant(String[] list1, String[] list2) {
        int l1=list1.length;
        int l2=list2.length;
        String result[]=new String[Math.max(l1,l2)];
        int index=0;
        
        for(int i=0;i<l1;i++)
        {
            for(int j=0;j<l2;j++)
            {
                if(list1[i]==list2[j])
                {
                    result[index]=list1[i];
                    index++;
                }
            }
        }
        return result;
    }
}
