//Vikrant Suryadevara
import java.util.Scanner;
public class lab7 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("enter the number of rows in Matrix 1:");
		
		int Matrix1Rows = key.nextInt();
		
		System.out.println("Enter the number of colums on Matrix 1:");
		
		int Matrix1Cols = key.nextInt();
		
		System.out.println("enter the number of rows in Matrix 2:");
		
		int Matrix2Rows = key.nextInt();
		
		System.out.println("Enter the number of colums on Matrix 2:");
		
		int Matrix2Cols = key.nextInt();
		//Makes the user re-enter the columns and rows if they are negative
		while (Matrix1Rows < 0 || Matrix1Cols < 0 || Matrix2Rows < 0 || Matrix2Cols < 0) {
			System.out.println("Negative number detected");
			System.out.println("Please re-enter the numbers you inputted again");
			
			System.out.println("Enter the number for Matrix 1 Rows: ");
			Matrix1Rows = key.nextInt();
			System.out.println("Enter the number for Matrix 1 Columns: ");
			Matrix1Cols = key.nextInt();
			System.out.println("Enter the number for Matrix 2 Rows: ");
			Matrix2Rows = key.nextInt();
			System.out.println("Enter the number for Matrix 2 Columns: ");
			Matrix2Cols = key.nextInt();

			
		}
		//checks for dimesnion mismatch
		while (Matrix1Cols !=Matrix2Cols || Matrix1Rows !=Matrix2Rows )
		{
			System.out.println("Dimension mismatch! Cannot multiply the matrices");
			System.out.println("Please re-enter the dimensions (Note: Make sure the columns AND the rows are the same): ");
		 System.out.println("Enter the number of Rows for both matrices:");
			  Matrix1Rows = key.nextInt();
			 Matrix2Rows = Matrix1Rows;
			  
			  System.out.println("Enter the number of columns for both matrices:");
	            Matrix1Cols = key.nextInt();
	            Matrix2Cols = Matrix1Cols; // Matrices must be of the same size
		
		}


		//create 2 matrices
		int [][] matrix1 = new int[Matrix1Rows][Matrix1Cols];
		int[][] matrix2 = new int[Matrix2Rows][Matrix2Cols];
		
		//first matrix for adding
		for(int i=0; i < Matrix1Rows; i++)	{
			for(int j=0; j < Matrix1Cols; j++)  { //change to j
				System.out.println("Enter the value of the matrix 1 at position (" +i+" , " +j+ "):");
				
				matrix1[i][j] = key.nextInt();
				
			}
		}
		
		//second matrix for adding
		 for (int i = 0; i < Matrix2Rows; i++) {
	            for (int j = 0; j < Matrix2Cols; j++) { 
	                System.out.println("Enter the value of Matrix 2 at position (" + i + ", " + j + "):");
	                matrix2[i][j] = key.nextInt();
	                if (matrix2[i][j] < 0) {
	                    System.out.print("Negative numbers are not allowed. Please re-enter a positive number for Matrix 1 [" + i + "][" + j + "]: ");
	                    matrix2[i][j] = key.nextInt();
	            }
	              }
	        }



		//matrix Addition
			int[][] AdditionMatrix = new int[Matrix1Rows][Matrix1Cols];
					
			for(int i=0; i < Matrix1Rows; i++)	{
				for(int j=0; j<Matrix1Cols; j++) 
				{ 
					AdditionMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
					
					//print addition matrix  
		        System.out.println("Matrix 1 + Matrix 2 = Result:");
	            // Print first matrix row

		        for (int i = 0; i < Matrix1Rows; i++) {
		            System.out.print("[");
		            for (int j = 0; j < Matrix1Cols; j++) {
		                System.out.print(matrix1[i][j]);
		                if (j < Matrix1Cols - 1) {
		                	System.out.print(" ");
		                }
		            }
		            System.out.print("] + ");
		            
		            // Print second matrix row
		            System.out.print("[");
		            for (int j = 0; j < Matrix2Cols; j++) {
		                System.out.print(matrix2[i][j]);
		                if (j < Matrix2Cols - 1) {
		                	System.out.print(" ");
		                }
		            }
		            System.out.print("] = ");
		            
		            // Calculate and print result row
		            System.out.print("[");
		            for (int j = 0; j < Matrix1Cols; j++) {
		                AdditionMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
		                System.out.print(AdditionMatrix[i][j]);
		                if (j < Matrix1Cols - 1) {
		                	System.out.print(" ");
		                }
		            }
		            System.out.println("]");
		        }
		     key.close(); //prevents resource leaks
	}
}
