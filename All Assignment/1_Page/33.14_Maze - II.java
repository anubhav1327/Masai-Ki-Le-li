/*
 * Maze - II
 * 
 * Description

You are given a maze of N rows and M columns. Each cell of the maze is either an empty cell or it contains a wall. If you are at empty cell then you can only move to the adjacent cells (up, down, left, right) also, you can’t step on any cell that contains wall.

A rope is a path that contains only empty cells. You need to find the length of the longest rope path.

Note

There is only one path between any two empty cells.


Input
The only line of input contains single positive integers M and N denoting the columns and rows of the maze respectively.

The next N lines of input contain M space-separated characters denoting the maze. Each character is “.” (empty), “#” (wall), all of them without quotes.

Constraints

1 <=T<= 5

1 <= N, M <= 1000


Output
The output for each test case should contain the sentence “Maximum rope length is X” ( without quote) where X is the length of the longest rope path.


Sample Input 1 

1
7 6
#######
#.#.###
#.#.###
#.#.#.#
#.....#
#######
Sample Output 1

Maximum rope length is 8
Sample Input 2 

2
3 3
###
#.#
###
3 3
###
#..
###
Sample Output 2

Maximum rope length is 0
Maximum rope length is 1
Hint

Explanation for Sample 1

One of the possible solution is (1 based indexing) (2,2) -> (3,2) -> (4,2) -> (5,2) -> (5,3) -> (5,4) -> (5,5) -> (5,6) -> (4,6). Hence the lenght of the path is 8.


 */