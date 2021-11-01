public class FreqNum {
    public static void main(String[] args)
    {

        int a[]={1,1,5,2,2,3,5,4,4,10};
        int freq[]=new int[11];
        
        for(int i=0;i<a.length;++i)
        {
            freq[a[i]]++;
        }
        for(int i=1;i<=10;i++)
        {System.out.print(freq[i]+" ");}
    }
} 