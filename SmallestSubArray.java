class SmallestSubArray {
	static void findthesmallestsubarray(int[] arr, int k)
	{
	    int i=0;
		int j=0;
		int n=arr.length;
		int minSum=Integer.MAX_VALUE;
		int sum=0;
		while(j<n)
		{
			sum=sum+arr[j];
			if(j-i+1<k)
			{
				j++;
				
			}
			else if(j-i+1==k) {
				minSum=Math.min(minSum,sum);
				sum=sum-arr[i];
				i++;
				j++;
			}
		}
		System.out.println(minSum);
	}
	
	public static void main(String[] args)
	{
		int[] arr={10, 5, 2, 7, 1, 9};
		findthesmallestsubarray(arr,3);
	}
}