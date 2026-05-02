package Dsa_Once_Again.Array_Pattern4_Kedans_Algorithm;

public class Max_Sub_Array {
 static void findthemaxarray(int[] arr)
 {
     //1st find the max
     int maxsum=Integer.MIN_VALUE;
     int sum=0;
     for(int i=0;i<arr.length;i++) {
         //Yr every element u have to add then why u r going to compare from the 0
//          if (arr[i] > 0) {
//             sum = sum + arr[i];
//         }
         sum=sum+arr[i];

         if (sum > maxsum) {
             maxsum = sum;
         }
         if (sum < 0) {
             sum = 0;
         }
     }
     System.out.println(maxsum);
    }
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, -2, 5};
findthemaxarray(arr);
    }
}
