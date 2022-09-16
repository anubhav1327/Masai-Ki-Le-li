/*
 * Detect Cycle in a Directed Graph

 Description

Given a directed graph, contains N vertices and E edges ,check whether the graph contains a cycle or not.



Note : There can be multiple components in the graph


Input
The first line contains T, denoting the number of test cases. The next line contains N and E denoting the number of vertices and the number of edges.

The next E lines contains two integers X and Y, denoting a directed edge from X to Y.



Constraints

1 <= T <= 10

1 <= N, E <= 10^3

0 <= X,Y < N


Output
If the graph contains a cycle, print "Cycle", without quotes, and if the graph does not contains a cycle, print "Not a cycle", without quotes, on a new line for each test case.


Sample Input 1 

1
9 7
2 1
3 1
1 5
5 2
1 8
7 3
8 7
Sample Output 1

Cycle
Sample Input 2 

1
8 3
0 3
6 4
7 4
Sample Output 2

Not a cycle
Hint

A possible cycle in the graph given in the sample test case can be (2-->1--->5--->2), therefore, the output is Cycle.

The graph given in the sample test case does not contain any cycle. Therefore, the output is "Not a cycle".


 */