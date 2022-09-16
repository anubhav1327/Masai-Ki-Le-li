/*
 * Maximize Substring
 * 
 * Description

Manu Loves to play with alphabets.One day his friend gave him a string and tells him to try the following task:

Given a string S consisting of lowercase English alphabets of size N, he has to find the lexicographically maximum substring of this string .Help him finding the substring.


Input
Input Format :

The first line contains a single integer N denoting the length of string S. The next line contains the string S.

Constraints :

1 <= N <= 5000


Output
Print the lexicographically maximum substring of String S on a single line.


Sample Input 1 

6
ababaa
Sample Output 1

babaa
Hint

Output Explanation :

Lexicographically maximum string of the given string is *babaa*
 */


 //Enter code here
import java.util.*;
public class Main{
    
    public static String MaxString(String anubhav){
        String maxinstring = "";
        for (int i = 0; i < anubhav.length(); ++i) {
            if (maxinstring.compareTo(anubhav.substring(i)) <= 0) {
                maxinstring = anubhav.substring(i);
            }
        }return maxinstring;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String anubhav= sc.next();
        System.out.println(MaxString(anubhav));
        
    }
    
}

