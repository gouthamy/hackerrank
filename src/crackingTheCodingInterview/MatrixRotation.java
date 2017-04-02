package crackingTheCodingInterview;

public class MatrixRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printMatrix(matrix,0);
		rotateMatrixBy90Degree(matrix, 4);
		//printMatrix(matrix,0);

	}
	static void rotateMatrix(int mat[][], int N)
	{
	    // Consider all squares one by one
	    for (int layer = 0; layer < N / 2; layer++)
	    {
	    
	    	int first = layer;
	    	int last = N - layer - 1;
	    	
	        // Consider elements in group of 4 in 
	        // current square
	        for (int i = first; i < last; i++)
	        {
	            // store current cell in temp variable
	            int temp = mat[first][i];
	 
	            // move values from right to top
	            mat[first][i] = mat[i][N-1-first];
	 
	            // move values from bottom to right
	            mat[i][N-1-first] = mat[N-1-first][N-1-i];
	 
	            // move values from left to bottom
	            mat[N-1-first][N-1-i] = mat[N-1-i][first];
	 
	            // assign temp to left
	            mat[N-1-i][first] = temp;
	        }
	    }
		System.out.println("Matrix After Rotating 90 degree:-");
		printMatrix(mat, N);
	}
	private static int[][] rotateMatrixBy90Degree(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				
				int top = matrix[first][i];
				 matrix[first][i] = matrix[i][last];
				 matrix[i][last] = matrix[last][n - 1 - i];
				 matrix[last][n - 1 - i] = matrix[n - 1 - i][first];		 
				 matrix[n - 1 - i][first] = top;		 
						 
				/*int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last - offset][last] = matrix[i][last];
				matrix[i][last] = top;*/
			}
		}
		System.out.println("Matrix After Rotating 90 degree:-");
		printMatrix(matrix, n);
		return matrix;

	}

	private static void printMatrix(int[][] matrix, int n) {
		

		for(int i=0 ; i< matrix.length; i++){
			for(int j=0; j<matrix[i].length;j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	

}
