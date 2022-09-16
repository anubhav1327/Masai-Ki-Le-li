/*
 * An Anagram Problem
 * 
 * Description

Given an integer n, we have n strings of length 4. Now we have to remove all those strings which is an anagram of previously appeared string.

Print the final number of strings left and the strings after the required execution. See the sample testcase for I/O clarifications.

Note -The final vector of strings is sorted.


Input
The first line contains a single integer n (1 ≤ n ≤ 100000).

The next n lines contain a string Si whose length is 4.


Output
For each test case, print the answer.


Sample Input 1 

5
eodc
odec
code
baca
aabc
Sample Output 1

2
baca
eodc
 */


import java.util.*;
class Main {
    static void removeAnagrams(String arr, int N)
{
    Vector<String> ans = new Vector<String>();
  
    
    HashSet<String> found = new HashSet<String> ();
  
    for (int i = 0; i < N; i++) {
  
        String word = arr;
  
        
        word = sort(word);
  
        if (!found.contains(word)) {
  
            ans.add(arr);
            found.add(word);
        }
    }
  
    
    Collections.sort(ans);
  
    
    for (int i = 0; i < ans.size(); ++i) {
        System.out.print(ans.get(i)+ " ");
    }
}
static String sort(String inputString)
{
    
    char tempArray[] = inputString.toCharArray();
       
    
    Arrays.sort(tempArray);
       
    
    return new String(tempArray);
}
    
 public static void main (String [] args){
   Scanner sc = new Scanner(System.in);
   int Nu = sc.nextInt();
   for(int i=0;i<Nu;i++){
       String arr = sc.next();
        int N = arr.length();
    removeAnagrams(arr, N);
   }
//   int N = arr.length;
    // removeAnagrams(arr, N);
 }
}
