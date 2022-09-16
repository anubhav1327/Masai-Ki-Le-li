/*
 * Monkey and Tree
 * 
 * Description

One day a monkey was trying to climb on the tree to eat bananas. Unfortunately, there is only one banana left on the tree. The height of the Tree is N meters.  The monkey can jump upwards exactly U steps and came down exactly D steps in one move. The banana is at X meters above the ground.

At each step, the monkey can either jump upwards or downwards only if it is possible to do so. You need to calculate the minimum number of moves needed to reach the banana.


Input
The only line of input contains four positive integers N, S, B, U, D denoting the height of the tree, your starting position, the position of banana from the ground, number of steps the monkey can takes upwards and downwards respectively.

Constraints

1 <= N, S, B <= 10^5

0 <= U, D <= 10^5

1 <= S, B <= N


Output
The output should contain the minimum number of moves needed to reach the banana. If it is impossible to reach banana print -1.


Sample Input 1 

10 1 10 2 1
Sample Output 1

6
Sample Input 2 

34 30 21 10 0
Sample Output 2

-1
Hint

Explanation for Sample 1

Initially the monkey is at 1 he may use this path to reach banana-

1 --(U,  +2)-> 3 --(U, +2)-> 5 --(U, 2)-> 7 --(U, +2)-> 9 --(D, -1)-> 8 --(U, +2)-> 10.

Hence the total moves are 6.


 */