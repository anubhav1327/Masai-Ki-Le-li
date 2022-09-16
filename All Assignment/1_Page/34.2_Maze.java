/*
       Maze
 * 
 *  Description

One day Alex and Bob go to an amusement park where they found a maze. A maze is a rectangular matrix of dimensions N rows and M columns. Each cell of a maze either contains a floor or a wall denoted by dot “.” (without quotes) and hash “#” (without quotes) respectively. Alex and Bob entered into maze one by one to have fun but soon they realise that they are lost in a maze. As Alex know the path to get out from the maze Bob wants to reach to Alex as soon as possible. Help Bob to calculate the length of the shortest path from him to the Alex. Bob can go to only adjacent cells i.e, up, right, down and left.


Input
The only line of input contains single positive integers N and M denoting the row and column of the maze respectively.

The next N lines of input contain M space-separated characters denoting the maze. Each character is “.” (floor), “#” (wall), “A” (Alex), or “B” (Bob) all of them without quotes. There are exactly one A and one B in the input.

Constraints

1 <= N, M <= 1000


Output
The single line of output should contain the length of the shortest path from Bob to the Alex


Sample Input 1 

5 8
########
#.A#...#
#.##.#B#
#......#
########
Sample Output 1

9
Sample Input 2 

2 2
##
AB
Sample Output 2

1
Hint

Explanation for Sample 1

The Shortest Path from Bob to Alex is shown in the given figure:



maze.png

 */