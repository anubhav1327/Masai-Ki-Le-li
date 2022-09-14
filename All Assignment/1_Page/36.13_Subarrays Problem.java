/*
 * Subarrays Problem Ended
Description

You are given an array A of N elements. Write a program that counts the number of sub-arrays of A in which sum of all the elements is an even number.

Please read sample test case and its explanation for better understanding.


Input
Input Format :

First line contains N which is the number of elements present in the array.

Second line contains N space separated integers which are the elements of array A

Constraints :

1 ≤ N ≤ 100000

1 ≤ Elements of array ≤ 1000000


Output
Output one number which is the count of such sub-arrays


Sample Input 1 

5
2 5 4 4 4
Sample Output 1

7
Hint

Output Explanation :

All the even sum subarrays are:

1) [1,1] (i.e from index 1 to index 1)

2) [3,5] (i.e from index 3 to index 5)

3) [3,4] (i.e from index 3 to index 4)

4) [4,5] (i.e from index 4 to index 5)

5) [3,3] (i.e from index 3 to index 3)

6) [4,4] (i.e from index 4 to index 4)

7) [5,5] (i.e from index 5 to index 5)


 */

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++)
        arr[i] = sc.nextInt();
        
        System.out.println(subEven(arr, n));
    }
    
    // comulative sum
    // running sum
    // hash maps
    
    
    public static long subEven(int arr[], int n){
         long ans = 0;
        
        int sum = 0;
        
        for(int i=n-1; i>=0; i--){
            if(arr[i]%2 == 1)
                sum = n-i-1-sum;
            
            else
                sum = sum + 1;
            
            ans = ans + sum;
        }
        return ans;
    }
}