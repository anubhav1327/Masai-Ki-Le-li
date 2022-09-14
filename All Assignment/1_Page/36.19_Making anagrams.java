/*
 * Making anagrams 
Description

A student is taking a cryptography class and has found anagrams to be very useful. Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

The student decides on an encryption scheme that involves two large strings. The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.

Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. Any characters can be deleted from either of the strings.


Input
Input Format
The first line contains a single string, a.

The second line contains a single string, b.

Constraints
1 <= |a|,|b| <= 2*10^5

The strings a and b consist of lowercase English alphabetic letters, ascii[a-z].


Output
Output Format
Print the minimum total characters that must be deleted


Sample Input 1 

cde
abc
Sample Output 1

4
Hint

Delete the following characters from the strings make them anagrams:

Remove d and e from cde to get c.

Remove a and b from abc to get c.

It takes 4 deletions to make both strings anagrams.
 */