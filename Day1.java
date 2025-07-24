public class Day1 {
    
    public int getSecondLargest(int[] arr) {
        // code here
        int n= arr.length;
        if(n<2)
         return -1;
         int largest = Integer.MIN_VALUE;
         int secondLargest=Integer.MIN_VALUE;
         
         for(int i=0;i<n;i++)
         {
             
         if(arr[i]>largest)
         {
             secondLargest=largest;
             largest=arr[i];
        }
        else if(arr[i] > secondLargest && arr[i] != largest)
        {
            secondLargest=arr[i];
        }
         }
        return secondLargest == Integer.MIN_VALUE ? 1 : secondLargest;
    }

}
