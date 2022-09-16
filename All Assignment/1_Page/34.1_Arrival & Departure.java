/*
Arrival & Departure

 * Description

You are given an undirected graph G, with N vertices and E edges, and a start node S. You have to find the arrival and the departure time for each node, if a single pointer is used to traverse all the nodes, starting from the node S. Refer the sample input for better understanding. It takes one unit of time to move from one node to another.

Note: The nodes must be processed in the order in which they arrive in the input.


Input
The first line of the input contains N the number of vertices, and E the number of edges.

Next E lines contains two integers X and Y, denoting an edge between X and Y.

The last line contains S, the starting node from which the pointer starts traversing.

Constraints

1 <= N, E <=10^3

1 <= X,Y <= N


Output
For every node, print i the name/ID of the node, the start time and the time of departure, on a single line, for each node.


Sample Input 1 

5 4
1 2
2 3
3 4
4 3
1
Sample Output 1

1 0 7
2 1 6
3 2 5
4 3 4
5 0 0
Hint

In the sample test case, the graph contains 5 nodes and 4 edges, and the start point is 1. Therefore, the pointer arrives at node 1 at time, t = 0. The next node connected directly, to the node 1, according to the order mentioned in input is 2, so 2 is visited at time, t = 1, as it takes one unit of  time to go from one node to another. In the order given in the input, the node connected to 2 is 3, so the pointer arrives at node 3, at t = 2. Similarly, the node connected directly to 3 is 4, therefore the pointer arrives at t = 3 at node 4. 4 is not connected to any other node except for 3, which has already been visited. Therefore, it departs from 4 at t = 4, and reaches 3. 3 has no other unvisited node, therefore, the it leaves 3 at t = 5, and reaches 2. 2 has also no unvisited nodes left in its vicinity, therefore, the pointer leaves 2 at t = 6. Finally, the pointer reaches 1 which has no unvisited nodes, and therefore, the pointer leaves node 1 at t = 7. The vertex 5 was not connected to any of the nodes, and hence was never visited.

 */