/*
 * The Peak Point
 * 
 * Description

Given an array of size n, which is strictly increasing and then strictly decreasing in order. Find out the index (0-based) which is the peak of the array.

Note that the extremities are not considered as peak and there exists a peak which is not at index 0 or at n-1.


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (3 ≤ n ≤ 100000).

The second line of the test case contains n integers (1 ≤ Ai ≤ 100000) and they are all distinct in nature.


Output
For each test case, print the answer: The peak index.


Sample Input 1 

2
3
10 20 11
5
1 3 6 5 4
Sample Output 1

1
2
 */

 //Enter code here
// import java.util.*;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         for(int i=0;i<t;i++){
//             // System.out.println(i);
//             int N = sc.nextInt();
//             int[] arr1 = new int[N];
//             for(int j=0;j<N;j++){
//                 arr1[j] = sc.nextInt();
//                 // System.out.println(arr1[j]);
//             }
//             int max = arr1[arr1.length-1];
//             for(int k=0;k<arr1.length;k++){
//                 if(arr1[k]>max){
//                     max = arr1[k];
//                     System.out.println(k);
//                 }
                
//             }
//             // System.out.println(max);
//         }
//     }
// }

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int t=0;t<m;t++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int ans = 0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}