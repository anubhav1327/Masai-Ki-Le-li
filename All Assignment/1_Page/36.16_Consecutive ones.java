/*
 * Consecutive ones Ended
Description

You are given a binary string consisting of characters '0' and '1' only. In one move you can choose any contiguous subsegment of this string of length less than or equal to k and convert all elements of this segment to 1.

Your task is to find the maximum length of contiguous '1' you can get after one move.


Input
Input Format
The first line contains the number of testcases t.

Next 2*t lines we have the description of the t testcases.

For each testcase first line contains n the length of the string and k. Next line contains binary string.

Constraints
1 <= t <=1000

1 <= n <= 1000

1 <= k <= n


Output
Output Format
For each testcase output the maximum length of contiguos segment with all elements '1' after one move.


Sample Input 1 

2
12 2
011001001010
3 3
000
Sample Output 1

5
3
Hint

In the first testcase if we choose the subsegment from index 3 of lenght 2 and convert it to '1' then we get he result, i.e. 5 continuos '1's.

In the second testcase if the entire string is converted to '1' , that gives the maximum
 */