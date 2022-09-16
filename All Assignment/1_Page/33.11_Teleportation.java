/*
 * Teleportation
 * 
 * Description

There are N row house, in a line. Only one person lives in each of these houses. One of this house has a path to heaven.

Danav is coming to kill these people. Danav will take T+1 seconds to come these society(row houses), and then he will kill all people in houses other than the house with path to heaven.

Those who want to survive will try to reach Danav house in T seconds.

People can only teleport from one house to another house if there is a teleportation path between them. Each teleportation path takes some time to teleport.

You need to find how people survived these Danav Attack.

Not all house are connected.

It is given that every person would try there best to survive and would choose a optimal path.


Input
Input Format

First Line contains N, no of row houses.

Second Line contains H, house number which has path to heaven.

Third Line contains T, time after which Danav will kill all peoplein houses other than the house with path to heaven.

Fourth line contains M, total number of teleportation path.

Next M lines contains A, B and X, which denotes teleportation path from House A to House B will take X seconds.

Constraints

1 <= H,A,B <= N <= 100

1 <= T <= 100000

1 <= M <= min(N*(N-1), 10000)

1 <= X <= 100000


Output
Output Format

Print total count of people which survived.


Sample Input 1 

4 
2 
1
8
1 2 1
1 3 1
2 1 1
2 4 1
3 1 1
3 4 1
4 2 1
4 3 1
 */