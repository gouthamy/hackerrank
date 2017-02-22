package leetcode;

import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		if(nums==null)throw new IllegalArgumentException("array is empty");
		 List<List<Integer>> list = new LinkedList<List<Integer>>();
		for(int index=0;index<nums.length;index++){
			for(int j = index+1;j<nums.length;j++){
				for(int k = j+1;k<nums.length;k++){
					if((nums[index]+nums[j]+nums[k]) == 0){
						List<Integer> ls = new LinkedList<>();
						ls.add(nums[index]);
						ls.add(nums[j]);
						ls.add(nums[k]);
						list.add(ls);
					}
				}	
			}
		}

		return list;
	}

}
