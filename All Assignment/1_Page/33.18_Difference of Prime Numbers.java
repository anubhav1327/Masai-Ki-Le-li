/*
 * Difference of Prime Numbers
 * 
 * Description

You are given two prime numbers of 4 digits each.

You are allowed to perform following operations:-

In one step, you can change one digit of a prime number, but new number formed should also be prime. And leading digit can not be changed to zero.
You need to find minimum number of operations required to make a first prime number to second prime number.


Input
Input Format

First line contains T, no of test cases.

First line of each test case contains U and V, 4 digits prime number.

Constraints

1 <= T <= 10

1000 <= U,V <= 9999


Output
For each test case print minimum number of steps required to convert.


Sample Input 1 

2
7741 2797
7393 6803
Sample Output 1

3
4
Hint

7741 -> 2741 -> 2791 -> 2797

7393 ->7793-> 7703 -> 6703 -> 6803

 */