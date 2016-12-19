package HourRank15;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


/**
 * 
 * @author goutham
 *
 *
 *
 Andy loves playing games. He wants to play a game with his little brother, Bob, using an array, , of  distinct integers. The rules are as follows:

Bob always plays first and the two players move in alternating turns.
In a single move, a player chooses the maximum element currently present in the array and removes it as well as all the other elements to its right. For example, if , then it becomes  after the first move because we remove the maximum element (i.e., ) and all elements to its right (i.e.,  and ).
The modifications made to the array during each turn are permanent, so the next player continues the game with the remaining array. The first player who is unable to make a move loses the game.
Andy and Bob play  games. Given the initial array for each game, can you find and print the name of the winner on a new line? If Andy wins, print ANDY; if Bob wins, print BOB.

Input Format

The first line contains a single integer denoting  (the number of games). The  subsequent lines describe each game array over two lines:

The first line contains a single integer, , denoting the number of elements in .
The second line contains  distinct space-separated integers describing the respective values of  for array .
Constraints

Array  contains  distinct integers.
For  of the maximum score:

The sum of  over all games does not exceed .
For  of the maximum score:

The sum of  over all games does not exceed .
Output Format

For each game, print the name of the winner on a new line (i.e., either BOB or ANDY).

Sample Input 0

2
5
5 2 6 3 4
2
3 1
Sample Output 0

ANDY
BOB
Explanation 0

Andy and Bob play the following two games:

Initially, the array looks like this: 
image

In the first move, Bob removes  and all the elements to its right, resulting in : 
image
In the second move, Andy removes  and all the elements to its right, resulting in : 
image

At this point, the array is empty and Bob cannot make any more moves. This means Andy wins, so we print ANDY on a new line.

In the first move, Bob removes  and all the elements to its right, resulting in . As there are no elements left in the array for Andy to make a move, Bob wins and we print BOB on a new line.
 */
public class GamingArray {

	public static void main(String[] args){


		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i=0;i<q;i++){
			int N = scan.nextInt();
			Stack<Integer> stk = new Stack<>();
			Stack<Integer> temp = new Stack<>();
			int max = 0;
			for(int index=0;index<N;index++){
				int value = scan.nextInt();
				if(stk.isEmpty()){
					max = value;
					stk.push(value);
					temp.push(value);
				}else{
					stk.push(value);
					max = max > value ? max : value;
					temp.push(max);
				}
			}
			System.out.println(stk+" , "+temp);
			System.out.println(solveGamingArray(stk,temp,N));
		}



	}

	private static String solveGamingArray(Stack<Integer> stk,
			Stack<Integer> temp, int n) {
		//to find Bod or ANDY (if count divided by 2 then Bod else ANDY)
		int count = 2;
		while(true){
			boolean isMaxReached = true;
			while(isMaxReached){
				int max = temp.peek();
				int peek = stk.peek();
				if(max != peek){
					temp.pop();
					stk.pop();
				}else{
					temp.pop();
				stk.pop();
					isMaxReached = false;
			   }
			}
			if(stk.isEmpty())
				break;
			count++;
		}
		return count%2==0 ? "BOB" : "ANDY";
	}


}
