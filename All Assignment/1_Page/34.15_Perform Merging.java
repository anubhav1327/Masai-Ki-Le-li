/*
 * Perform Merging
 * 
 * Description

You are given two sorted arrays each of length N. Your task is to write a program that merges both the arrays such that the final array formed after merging is sorted.

Note: You must not use sort() function in your entire code


Input
Input Format :

First line contains N which is the number of integers present in both the arrays.

Second line contains N sorted integers which are elements of first array.

Third line contains N sorted integers which are elements of second array.



Constraints :

N < 1000


Output
Output the array formed after merging elements such that it is sorted


Sample Input 1 

4
1 5 7 9
2 4 6 8
Sample Output 1

1 2 4 5 6 7 8 9
 */


import java.util.*;
class Main{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
                  int [] singh = new int[test];
                  int [] anubhav = new int[test];

    
    for(int i=0; i<test; i++){
        singh[i] = sc.nextInt();
    }
    
        for(int i=0; i<test; i++){
        anubhav[i] = sc.nextInt();
    }

    
    int k = anubhav.length;
    int l = singh.length;
    
    int result[] = new int [k+l];
        merge(anubhav,singh,result,k,l);
    for(int i=0; i<result.length; i++){
        System.out.print(result[i]+" ");
    }
    }
    
    
     public static void merge(int[]anu, int [] bhav, int result[] , int anubhav, int singh){
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        while(r1<anubhav){
            result[r3] =anu[r1];
            r1++;
            r3++;
        }
        while(r2<singh){
            result[r3]=bhav[r2];
            r2++;
            r3++;
        }
        Arrays.sort(result);
    }
}