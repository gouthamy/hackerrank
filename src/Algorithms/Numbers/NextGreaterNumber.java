package Algorithms.Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class NextGreaterNumber {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		
		char[] nums = num.toCharArray();
		//convert this to array ex : 123456
		int index = 0;
		boolean isPossible = false;
		for(int i = nums.length-1; i >0 ;i--){
			if(nums[i] > nums[i-1]){
				index = i-1;
				isPossible = true;
				break;
			}
		}
		if(!isPossible){
			System.out.println("Not Possible");
			return;
		}
	
		//getting the index greather than selected index and samller than other
		char minValue = nums[index+1];
		int minIndex = index+1;
		for(int i= index+1;i<nums.length;i++){
			if(nums[i]>nums[index]){
				if(nums[i]<minValue){
					minValue = nums[i];
					minIndex = i;
				}
			}
		}
		//swap the minIndex and index
		char swap = nums[index];
		nums[index] = nums[minIndex];
		nums[minIndex] = swap;
		Arrays.sort(nums,index+1,nums.length);
		int n = Integer.parseInt(new String(nums));
		System.out.println(n);
	}

}
