package Per_Day_2Ques;

public class RotateArray {
    //1st method
//3rd call
       static void findtheswap(int[]arr,int i, int j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        //another method for the swap
    //2nd call
         static void findthereverse(int[] arr, int i, int j)
         {
             while(i<j)
             {
               findtheswap(arr,i,j);
               i++;
                 j--;
             }
         }
         //1st call
         static void findthereveresort(int[] arr, int k)
         {
             int n=arr.length;
          findthereverse(arr,0,k-1);
          findthereverse(arr,k,n-1);
          findthereverse(arr,0,n-1);
         }
         public static void main(String[] args)
         {
             int[] arr={1,2,3,4,5};
            findthereveresort(arr,2);
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
         }

}
