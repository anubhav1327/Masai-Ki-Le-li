/*
 * Masai Palindromic Substring
 * 
 * Description

You are provided a stringS.

Write a program that returns length of the longest palindromic substring of that string.


Input
Input Format

First line contains S, a string.

Constraints

`1 <= Length of string <= 100


Output
Output Format

Output one number which is length of the longest substring which is a palindrome


Sample Input 1 

thisracecarisgood
Sample Output 1

7
Hint

Sample 1 Explanation

The given string contains a palindromic substring which is, "racecar" and it is of largest length(7) among all other palindromic substrings.

Hence the output is 7
 */


public static void masaiPalindromicSubstring(String str){
    //write your code here
    int  anubhav = 1;
    int singh = 0;
    for(int i = 0;i<str.length();i++){
        for(int j = i;j<str.length();j++){
            int anu = 1;
            for(int k = 0;k<(j-i+1)/2;k++){
                if(str.charAt(i+k)!=str.charAt(j-k)){
                    anu  = 0;
                    
                
                }
            }if(anu!=0 && (j-i+1)>anubhav){
                    singh = i;
                    anubhav = j-i+1;
                }
        }
    }System.out.println(anubhav);
  }