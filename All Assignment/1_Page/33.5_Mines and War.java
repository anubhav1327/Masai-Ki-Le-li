/*
 * Mines and War
 * 
 * Description

US Army is planning an attack on MARSLAND, but terrorists in MARSLAND are very intelligent and they have made underground tunnels to be safe.So US Army have decided to plant bombs and then detonate them at once for maximum damage and surprise attack.

They spread the bombs in such a way that a bomb can be in range of another bomb i.e say bomb B1 is in range of bomb B2 , when bomb B2 explodes it will trigger bomb B1 and it also get explode but vice-versa might not be true because the bombs are of different of range.

You are a computer engineer in their team so they ask you to find the most appropriate bomb which they can trigger to make maximum impact and then give the value of maximum impact.

Note: Impact is basically number of bombs that explodes.


Input
First line contains two integer N and M denoting number of bombs and number of relation between the bombs

Next M lines contain two integer A and B denoting bomb B is in range of bomb A.

Constraints

1 ≤ n ≤ 10000

1 ≤ m ≤ 10000

1 ≤ A ≤ N

1 ≤ B ≤ N


Output
Output Format

Output the maximum impact that can be made.A single line containing MAXIMUM IMPACT.


Sample Input 1 

4 3
1 2
2 4
1 3
Sample Output 1

4
 */