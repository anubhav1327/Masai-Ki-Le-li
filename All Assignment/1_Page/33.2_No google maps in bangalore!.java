/*
 * No google maps in bangalore!
 * 
 * Description

There are N different locations in Bangalore represented by an integer and M roads connecting some of these N locations. Some of these cities have multiple roads connecting them.

You are given information about M roads which connects two locations (say A and B).

Assume there is no google map in Bangalore, you have to answer Q queries about existence of DIRECT ROAD between two localitites.

For each query , you shall be given 2 integers X and Y. You just need to find if there exists a DIRECT ROAD between X and Y. If yes, print "YES" (without quotes) else , print "NO"(without quotes).


Input
Input Format :

The first line consist of 2 integers N and M denoting the number of locations and roads respectively.

Each of the next M lines consist of 2 integers A and B denoting a road between node A and B.

The next line contains a single integer Q denoting the number of queries. The next Line contains 2 integers X and Y denoting the details of the query.



Constraints :

N <= 1000

M <= 1000

Q <= 1000


Output
Print Q lines, the answer to each query on a new line.


Sample Input 1 

5 6
1 2
1 3
2 3
3 4
3 5
4 5
3
2 4
1 3
1 5
Sample Output 1

NO
YES
NO
 */