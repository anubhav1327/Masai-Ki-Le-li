/*
 * Terrorist Attack
 * 
 * Description

Our country is given in form of matrix of N*M, which are N*M different cities.RAW has detected that there are terrorist, in our country.

According to intelligence report, Terrorist are somewhere in these grid and are constantly moving, but Terrorist at a city (i,j) can only go to a city located in a specific direction(N S W E). If a city has military, and terrorist comes to/is at that city then they will get caught.

Direction are North (N), South (S), West(W), East(E).

Due to lack of funding to military in Budget 2021, Military want to minimize the cost.

You need to find minimum number of cities in which military should be deployed such that terrorist are caught.


Input
Input Format

First line contains T, no of test cases.

First line of each test case contains N and M, size of grid which represents our country.

Next lines contains grids which has direction (N, W, E, S) for each city.

Constraints

1 <= N,M <= 1000


Output
Output minimum number of cities in which military should be deployed.


Sample Input 1 

2
4 1
S
W
W
W
5 2
SW
EE
EN
SW
NN
Sample Output 1

3
2
Hint

In second test case, if military is deployed at (1,1) and (3,0), terrorist would be caught.


 */