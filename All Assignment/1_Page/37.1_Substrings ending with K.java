// Substrings ending with K Ended
// Description

// You are given a string A, of length N, and a character K. Find the count of all the substrings of A, which end at K.

// Note: The string A contains only lower case characters.


// Input
// The first line of the input contains T, the number of test cases.

// The first line of each test case, contains N, the length of the string.

// The next line contains the string A itself.

// The next line contains the character K.

// Constraints

// 1 <= T <= 10

// 1 <= N <= 50


// Output
// For each test case, print the number of substrings of A that are ending at the character K, on a new line.


// Sample Input 1 

// 1
// 4
// aman
// a
// Sample Output 1

// 4
// Hint

// In the given sample test case, the value of K = 'a'. The total number of substrings of A, which are ending at K = 'a', are {a,ama,ma,a}. Therefore, the required output is 4.


import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        while(t-->0) 
        {
            int n=obj.nextInt();
            String str=obj.next();
            char ch=obj.next().charAt(0);
            int ans=solve(str,n,ch);
            System.out.println(ans);
        }
        
    }
    
    public static int solve(String str, int n, char ch)
    {
        int count=0;
        for(int i=0; i<n; i++)
        {
            String str2="";
            for(int j=i; j<n; j++)
            {
                str2=str2+str.charAt(j);
                int len=str2.length();
                char lastChar=str2.charAt(len-1);
                if(lastChar==ch)
                    count++;
            }
        }
        return count;
    }
}