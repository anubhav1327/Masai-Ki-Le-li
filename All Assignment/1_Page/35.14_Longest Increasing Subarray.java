/*
 * Longest Increasing Subarray
 * 
 * Description

Given an array A with n integers, find out the length of the longest subarray which is strictly increasing i.e, every element is greater than it's the previous element in that subarray.

Expected Time Complexity O(n^2) for each array.


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (1 ≤ n ≤ 100) — the number of elements in the array A.

The second line of each test case contains n integers (1 ≤ Ai ≤ 100).


Output
For each test case, print the answer: The length of the longest subarray.


Sample Input 1 

2
2
1 1
6
1 2 1 2 3 1
Sample Output 1

1
3
 */



public static void longestIncreasingSubarray(int n,int[] arr){
   
    int max_len=1;
		
		for(int i=0;i<arr.length;i++) //i=4    arr =7
		{
			int curr_len=1;
			for(int j=i+1;j<arr.length;j++)//j=5
			{
				if(arr[j]>arr[j-1])//true
					curr_len++;//curr_len=4
				else
					break;
			}
			max_len=Math.max(max_len,curr_len);//5
		}
		System.out.println(max_len);
  }

