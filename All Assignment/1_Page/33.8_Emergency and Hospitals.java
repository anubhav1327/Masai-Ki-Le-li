/*
 * Emergency and Hospitals
 * 
 * Description

Imagine you live in a city G with N locations and is connected by M bidirectional roads. City G consists of H number of hospitals, each residing in any of the N locations. It takes exactly 1 unit of time to travel from one location to another connected by a bidirectional road. In a time of an emergency, you can't afford to reach a hospital in more than K units of time. Your task is to determine from, how many locations you can reach a hospital while in an emergency?


Input
First line: Four single space-separated integers denoting the value of N, M, H, and K.

M lines follow:
Each of the lines consists of two single space-separated integers u and v, denoting a bidirectional road between location u and location v.
Next line: Hsingle space-separated integers denoting the locations where hospitals reside.

Constraints:

1 <= N <= 100000
N-1 <= M <= MIN( 100000, N*(N-1)/2 )
1 <= H <= N
1 <= K <= (N+1)/2


Output
Print a single integer denoting the number of locations from which a hospital can be accessed while an emergency.


Sample Input 1 

5 4 2 1
1 2
2 3
2 4
1 5
1 3
Sample Output 1

4
Hint

Given,
Number of locations: N = 5,
Number of roads: M = 4,
Number of Hospitals: H = 2,
Emergency time limit: K = 1.

Given the connection of cities as:
1--2--3
\    \
5    4

Hospitals reside in locations 1 and 3.
Since locations 1 and 3 already has hospitals while in an emergency they can be accessed from locations 1 and 3 in no time.
Also,
Location 5 can access the hospital at location 1 in 1 unit of time and location 2 can access the hospital at either location 1 or location 3 in 1 unit of time.

Hence from 4 locations hospitals can be accessed, while in an emergency.
 */