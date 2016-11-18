package DataStructures.Stack;


/**
 * 
 * @author goutham
 * 
You are a waiter at a party. There are  stacked plates on pile . Each plate has a number written on it. Then there will be  iterations. In -th iteration, you start picking up the plates in  from the top one by one and check whether the number written on the plate is divisible by the -th prime. If the number is divisible, you stack that plate on pile . Otherwise, you stack that plate on pile . After  iterations, plates can only be on pile , . Output numbers on these plates from top to bottom of each piles in order of , .

Input Format

The first line contains two space separated integers,  and . 
The next line contains  space separated integers representing the initial pile of plates, i.e., . The leftmost value represents the bottom plate of the pile.

Constraints

 
 

Output Format

Output  lines. Each line contains a number written on the plate. Printing should be done in the order defined above.

Sample Input

5 1
3 4 7 6 5
Sample Output

4
6
3
7
5
Explanation

Initially:

 = [3, 4, 7, 6, 5]<-TOP

After 1 iteration:

 = []<-TOP

 = [6, 4]<-TOP

 = [5, 7, 3]<-TOP

We should output numbers in  first from top to bottom, and then output numbers in  from top to bottom.
 *
 */
public class Waiter {

}
