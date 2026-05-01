class LongestSubArray {
	static void findthelongestsubArray(int[] arr, int k)
	{
		int i=0;
		int j=0;
		int sum=0;
		int maxSum=Integer.MIN_VALUE;	
		while(j<arr.length)
		{
			sum=sum+arr[j];
			if(j-i+1<k)
			{
				
				j++;
			}
			else if(j-i==k)
			{
				//To find the Max
				maxSum=Math.max(maxSum,sum);
				sum=sum-arr[i]; //Remove Left Element
				i++;
				j++;	
			}
			
		}
		System.out.println(maxsum);
	}
	public static void main(String[] args)
	{
		int[] arr={10,5,2,7,1,9};
		findthelongestsubArray(arr,3);
	}
}