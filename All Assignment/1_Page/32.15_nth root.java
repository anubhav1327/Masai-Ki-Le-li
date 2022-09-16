/*
 * nth root
 * 
 * Description

You are given two integersnandmand you have to find the floor value of thenthroot ofm.


Input
Input Format

First-line contains T, no of test cases.

First-line of each test case contains two integers n and m.

Constraints

1 <= T <= 10

1 <= n <= 30

1 <= m <= 10^9


Output
For each test case print the floor value ofnthroot ofmin a new line.


Sample Input 1 

3
2 9
6 4096
3 126
Sample Output 1

3
4
5
Hint

For the first test case, we have to find the square root of 9 which is 3.

For the second test case, we have to find the 6th root of 4096 and as 4^6 is equal to 4096, therefore, the answer is 4.

For the third test case, the cube root of 126 is 5.... something whose floor value is 5.
 */


 //Enter code here
import java.util.*;
public class Main{
    
     static double nthRoot(int A, int N) 
    { 
          
        
        double xPre = Math.random() % 10; 
      

        double eps = 0.001; 
      
        
        double delX = 2147483647; 
      
        double xK = 0; 
      
        while (delX > eps) 
        { 
            
            xK = ((N - 1) * xPre + 
            (double)A / Math.pow(xPre, N - 1)) / (double)N; 
            delX = Math.abs(xK - xPre); 
            xPre = xK; 
        } 
      
        return xK; 
    } 
      
   
   
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            int o = sc.nextInt();
           
      
        double nthRootValue = nthRoot(o, m); 
        System.out.println(Math.floor(Math.round(nthRootValue*1000)/1000));
           
        }
    } 
}