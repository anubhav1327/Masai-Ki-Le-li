/*
 * Protons and Electrons
 * 
 * Description

You are given a grid of electric cell. In this electric grid, there are 4 symbols:-

'P' is Proton

'E' is Electron

'.' is Empty Space

'#' is a insulator.

Electricity only flows in horizontal or vertical direction.(we cannot move diagonally).

Field is defined as area which is connected without any obstacle(insulator). Two cells belong to the same field of the electric grid if we can move fromcellAto cellBwithout going over the insulator.

For a particular field, if there are more numbers of Electrons then Protons, All protons will get discharged (No electrons will be discharged) or else All electrons will get discharged(No protons will be discharged).

You need to print total number of protons and electrons at the end.


Input
Input Format

First line of each test case contains N and M, size of grid which represents our country.

Next lines contains N x M grid which has direction (N, E, ., #).

Constraints

1 <= N,M <= 1000


Output
Print two spaced integers Total number of electrons and a total number of protons atthe end.


Sample Input 1 

8 8  
.######.
#..E...#
#.####.#
#.#P.#.#
#.#.E#E#
#E.##..#
#.P..P.#  
.######.
Sample Output 1

3 1
 */