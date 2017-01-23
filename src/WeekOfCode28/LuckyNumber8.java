package WeekOfCode28;

import java.util.Scanner;

public class LuckyNumber8 {

	static int count = 0;

	static void combinationUtil(char arr[], int n, int r, int index,
			char data[], int i)
	{
		// Current combination is ready to be printed, print it
		String str= "";
		if (index == r)
		{
			for (int j=0; j<r; j++){
				str += data[j];
			}
			System.out.println(str);
			if(str.length()>=5){
				String s = new String();
				s+= str.charAt(str.length()-1);
				s+= str.charAt(str.length()-2);
				s+= str.charAt(str.length()-3);
				if(Integer.valueOf(s)%8 == 0){
					count++;
				}
			}else{
				if(Integer.valueOf(str)%8 == 0){
					count++;
				}
			}
			return;
		}

		// When no more elements are there to put in data[]
		if (i >= n)
			return;

		// current is included, put next at next location
		data[index] = arr[i];
		combinationUtil(arr, n, r, index+1, data, i+1);

		// current is excluded, replace it with next (Note that
		// i+1 is passed, but index is not changed)
		combinationUtil(arr, n, r, index, data, i+1);
	}

	// The main function that prints all combinations of size r
	// in arr[] of size n. This function mainly uses combinationUtil()
	static void printCombination(char arr[], int n, int r)
	{
		// A temporary array to store all combination one by one
		char data[]=new char[r];

		// Print all combination using temprary array 'data[]'
		combinationUtil(arr, n, r, 0, data, 0);
	}

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n3 = scan.nextInt();
		String number = scan.next();
		char[] arrc = number.toCharArray();


		int r = 3;
		int n = arrc.length;
		for(int i = 1 ;i<=n;i++){
			printCombination(arrc, n, i);
		}
		System.out.println(count);
	}
}
