package Dsa_Once_Again.Array_Pattern3_Sliding_Window;

public class First_Negative {
    static void findthefirstneg(int[] arr, int k)
    {
        int n=arr.length;
        //this is the outer loop
        for(int i=0;i<n-k;i++)
        {
            boolean found=false;
            for(int j=i; j<i+k; j++)
            {
                if(arr[j]<0)
                {
                    System.out.println(arr[j]+ " ");
                    found=true;
                    break;
                }
            }
            //agar found mein sb true hi mile to
            if(!found)
            {
                System.out.println('0');
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr={12, -1, -7, 8, -15, 30, 16, 28};
        int k=3;
        findthefirstneg(arr,k);
    }
}
