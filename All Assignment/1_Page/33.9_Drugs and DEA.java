/*
 * Drugs and DEA
 * 
 * Description

DEA is against the entire drug plantation and operation in Mexico and they have the satellite images of the drug farms. They want to burn them but before that they want the exact size and number of farms of each size to start their operation.

Unfortunately, the DEA people are not very bright, so they have hired you to help them process the image.

You will be given image in the form of the binary matrix: '1' is the drug farm area and '0' is the normal region.

Given this binary matrix, your job is to count the number of farms in the region and their corresponding sizes. Two adjacent pixels in the image are considered to be in the same farm if they are in the same row or the same column.

33.9.png 1
33.9.png 2




For better understanding see sample input.


Input
Input Format

The input contains several test cases, each one corresponding to a different satellite image. The first line of each case contains two integers that indicate the number of rows (N) and columns (M) in the image. Then N lines follow with M integers each, containing the information of the image.

Constraints

**Note:** The end of input is indicated by a test case with N = M = 0. This case should not be processed.

1 <= N, M <= 250


Output
For each image, output the number of farms in the region. Additionally, output the size of each farm in ascending order and the number of farms of that size.


Sample Input 1 

10 10
1 1 1 1 1 1 1 1 1 1
1 1 1 1 0 0 0 0 0 0
1 1 1 0 0 0 0 1 1 1
1 1 0 0 1 0 0 1 1 1
1 0 1 0 0 1 1 0 0 0
0 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 1
0 0 0 0 0 0 0 0 0 0
1 1 1 1 1 1 1 1 1 1
0 0
Sample Output 1

7
1 2
2 1
6 1
10 2
20 1
Sample Input 2 

5 5
1 1 1 1 1
0 0 1 1 1
1 0 0 0 0
0 1 0 0 1
1 1 1 1 1
2 2
1 1
1 0
2 2
0 1
1 0
0 0
Sample Output 2

3
1 1
7 1
8 1
1
3 1
2
1 2
 */