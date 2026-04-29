package Per_Day_2Ques;

public class Targetsum {
    static void targetsumm(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int sum = 0;
        while (left < right) {
            sum = arr[left] + arr[right];
if(sum==target)
{
    break;
}
else if(arr[right]>target)
{
    right--;
}
else {
    left++;
}
        }
//   System.out.println(arr[left] + " " + arr[right]);
        System.out.print(left   + " " + right);
    }
    public static void main(String[] args)
    {
        int[] arr={2,7,11,15};
        targetsumm(arr,9);
    }
}
