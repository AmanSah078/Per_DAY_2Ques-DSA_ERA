package Per_Day_2Ques;

public class Max_Sub_Array {
    static void findthemaxsubarray(int[] arr, int k)
    {
        int windowsize=0;
        int max=0;
        //1st to findt the 0 to 2 arr
        for(int i=0; i<k; i++)
        {
          windowsize+=arr[i];
        }

        //Now its time to manage the sliding window
        for(int i=1; i<=arr.length-k; i++)
        {
            windowsize=windowsize-arr[i-1]+arr[i+k-1];
            if(windowsize>max)
            {
                max=windowsize;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        findthemaxsubarray(arr,3);
    }
}
