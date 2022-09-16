/*
 * Intersection of Array
 * 
 * Description

You are given 2 arrays of N integers. Your task is to write a program that finds the one integer which is common in both arrays.

Note: There is always one integer common in both arrays.


Input
Input Format

First line of input contains N

Second line contains N space separated integers making the first array

Third line contains N space separated integers making the second array



Constraints

N<1000


Output
Output Format

Output that one integer which is common in both arrays


Sample Input 1 

3
4 5 7
9 2 5
Sample Output 1

5
 */


public static void intersectionOfArray(int n,int[] arr1,int[] arr2){
    //write your code here
    

     for(int row1=0;row1<n;row1++){
         for(int row2=0;row2<n;row2++){
             if(arr1[row1] == arr2[row2]){
               System.out.println(arr1[row1]);
         }
     }
     }
    
   
    
  }