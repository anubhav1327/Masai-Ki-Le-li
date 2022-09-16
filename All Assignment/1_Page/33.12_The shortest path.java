/*
 * The shortest path
 * 
 * Description

You are living in a country byteland which contain N cities numbered from 1 to N. Each city has a unique name. Two cities are connected by a highway of a particular length so there may be a case when there is more than one way to reach some city starting from some another city. You need to answer Q queries, each query will contain the name of two cities, and you need to find the shortest length of the path you need to travel from the first city to the second city.


Input
The first line of input contains T denoting the number of test cases.

The first line of each test case contains single positive integers N denoting the number of cities.

The next lines contain the description of each of the N cities.

In the description of ith city, the first line contains a string of lower case characters denotes its name.

The second line contains a single positive integer M denoting the number of cities adjacent to the current city.

The next M line contains two positive integers U and W denoting that the current ith city is connected to city U using a highway of length W.

After the description of all N cities, the next line contains Q denoting the number of queries.

The next Q lines contain two strings A and B denoting the names of two cities.

You can assume that there is always a path between any two pair of cities.

Constraints

1 <= T <= 10

1 <= N  <= 10^3

1 <= M  < N

1 <= W <= 10^5

1 <= Q <= 100

1 <= U <= N

1 <= |A|, |B| <= 10


Output
The output will contain Q integers denoting the shortest distance of city U to city V given in the query.


Sample Input 1 

1
4
gdansk
2
2 1
3 3
bydgoszcz
3
1 1
3 1
4 4
torun
3
1 3
2 1
4 1
warszawa
2
2 4
3 1
2
gdansk warszawa
bydgoszcz warszawa
Sample Output 1

3
2
Sample Input 2 

1
5
qnxvmzrqdv
4
5 8
4 3
3 2
2 3
sg
2
5 4
4 7
rsp
4
1 10
4 5
5 7
2 4
xf
3
2 6
1 7
3 2
jdvzbdg
1
3 7
2
jdvzbdg rsp
rsp xf
Sample Output 2

7
5
Hint

Explanation for Sample 1

The graph given will look like this:

33.12.png

For the first query we need to go through city 1 to city 4 then the shortest path we will follow will be [1 -> 2 -> 3 -> 4] the path length will be 1 + 1 + 1 = 3.

For the second query we need to go through city 2 to city 4 then the shortest path we will follow will be [2 -> 3 -> 4] the path length will be 1 + 1 = 2.

 */