package DataStructures.Queues;

import java.util.Scanner;
import java.util.Stack;


/**
 * 
 * @author goutham
 * 
 * 
A queue is an abstract data type that maintains the order in which elements were added to it, allowing the oldest elements to be removed from the front and new elements to be added to the rear. This is called a First-In-First-Out (FIFO) data structure because the first element added to the queue (i.e., the one that has been waiting the longest) is always the first one to be removed.

A basic queue has the following operations:

Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.
In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:

1 x: Enqueue element  into the end of the queue.
2: Dequeue the element at the front of the queue.
3: Print the element at the front of the queue.
Input Format

The first line contains a single integer, , denoting the number of queries. 
Each line  of the  subsequent lines contains a single query in the form described in the problem statement above. All three queries start with an integer denoting the query , but only query  is followed by an additional space-separated value, , denoting the value to be enqueued.

Constraints

It is guaranteed that a valid answer always exists for each query of type .
Output Format

For each query of type , print the value of the element at the front of the queue on a new line.

Sample Input

10
1 42
2
1 14
3
1 28
3
1 60
1 78
2
2
Sample Output

14
14
Explanation

We perform the following sequence of actions:

Enqueue ; .
Dequeue the value at the head of the queue, ; .
Enqueue ; .
Print the value at the head of the queue, ; .
Enqueue ; .
Print the value at the head of the queue, ; .
Enqueue ; .
Enqueue ; .
Dequeue the value at the head of the queue, ; .
Dequeue the value at the head of the queue, ; .
 *
 */
public class QueueUsingTwoStacks {

	private Stack<Integer> s_1;
	private Stack<Integer> s_2;

	public QueueUsingTwoStacks() {
		s_1 = new Stack<>();
		s_2 = new Stack<>();
	}

	public void enqueue(Integer data){
		s_1.push(data);

	}
	public Integer dequeue(){
		if(s_2.isEmpty()){
			while(!s_1.isEmpty()){
				s_2.push(s_1.pop());
			}
		}
		return s_2.pop();
	}
	public Integer frontValue(){
		if(s_2.isEmpty()){
			while(!s_1.isEmpty()){
				s_2.push(s_1.pop());
			}
		}
		return s_2.peek();
	}

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

		Scanner scan = new Scanner(System.in);
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		int q = scan.nextInt();
		for(int q_i = 0; q_i < q; q_i++){
			int query = scan.nextInt();
			switch(query){
			case 1:{
				queue.enqueue(scan.nextInt());
				break;
			}
			case 2 :{
				queue.dequeue();
				break;
			}
			case 3:{
				System.out.println(queue.frontValue());
				break;
			}
			}
		}

	}

}
