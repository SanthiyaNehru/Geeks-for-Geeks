package gfg;

public class Day2 {

	void pushZerosToEnd(int[] arr) {
        // code here
        int n= arr.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }
            while(count<n)
            {
                arr[count]=0;
                count++;
            }
        
    }
}
