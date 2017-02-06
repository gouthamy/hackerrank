package DataStructures.LinkedLists;

public class DeleteANode {


	static int postionFromEnd = 0;

	//1->2->3->4->5->null
	static ListNode removeNthFromEnd(ListNode head, int n) {
		// Complete this method
		ListNode n1 = head;
		ListNode n2 = head;
		for(int i = 0; i < n; i++) 
			n1 = n1.next;
		if(n1 == null){
			head = head.next;
		}
		else{
			while(n1.next != null){
				n1 = n1.next;
				n2 = n2.next;
			}
			ListNode next = n2.next;
			n2.next = next.next;
			next.next = null; // clean up 
		}
		return head;
	}


	 static public  double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int[] mergedArray = new int[nums1.length+nums2.length];
	
		int medain = mergedArray.length/2;
		int num1Index = 0;
		int num2Index = 0;
		int mergeIndex = 0;
		
		//1,3
		//2
		for(;mergeIndex < mergedArray.length;){
			if(num2Index < 0){
				mergedArray[mergeIndex] = nums1[num1Index];
				num1Index++;
				
			}else if(num1Index<0){
				mergedArray[mergeIndex] = nums2[num2Index];
				num2Index++;
			}else if(nums1[num1Index] <= nums2[num2Index] ){
				mergedArray[mergeIndex] = nums1[num1Index];
				num1Index++;
				if(num1Index == nums1.length){
					num1Index = -1;
				}
			}else{
				mergedArray[mergeIndex] = nums2[num2Index];
				num2Index++;
				if(num2Index == nums2.length){
					num2Index = -1;
				}
			}
			mergeIndex++;
		}
		
		if(medain%2==0){
			return (mergedArray[medain]+ mergedArray[medain-1])/2;
		}else{
			return mergedArray[medain];
		}
	}

	public static void main(String[] args){
		/*ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		removeNthFromEnd(head,2);*/
		System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
		
	}

}
class ListNode {
	int data;
	ListNode next;
	public ListNode(int data){
		this.data = data;
	}
	public String toString(){
		return data+"->"+next;
	}
}