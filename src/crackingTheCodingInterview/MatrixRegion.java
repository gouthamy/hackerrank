package crackingTheCodingInterview;

public class MatrixRegion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{0,0,0,1},{0,0,1,0},{0,0,0,1},{1,0,0,1}};
		System.out.println(getBiggestRegion(matrix));

	}

	
	public static int getBiggestRegion(int[][] matrix){
		int maxRegion = 0;
		for(int row = 0; row < matrix.length; row++){
			for(int column = 0; column < matrix[row].length; column++){
				if(matrix[row][column] == 1){
					int size = getRegionSize(matrix, row, column);
					maxRegion = Math.max(size, maxRegion);
				}
			}
		}
		return maxRegion;
	}

	//Matrix Boundary check
	private static boolean isWithInBoundary(int[][] matrix, int row, int column){
		if(row < 0 || column < 0)
			return false;
		if(row >= matrix.length || column >= matrix[row].length)
			return false;
		if(matrix[row][column] == 0)
			return false;
		return true;
	}

	private static int getRegionSize(int[][] matrix, int row, int column) {
		
		//Boundary checks
		if(!isWithInBoundary(matrix, row, column))
			return 0;
		
		int size = 1;
		matrix[row][column] = 0;
		for(int r = row - 1; r <= row + 1; r++){
			for(int c = column - 1; c <= column + 1; c++){
				if(r != row || c!= column)
					size += getRegionSize(matrix, r, c);
			}
		}
		return size;
	}
}
