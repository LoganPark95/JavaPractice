import java.util.*;
public class MultiplyMatrix {
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] multMatrix = new double[a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				multMatrix[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
			}
		}
		return multMatrix;
	}
	public static void main(String[] args) {
		int counter = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 x 3 Matrix1: ");
		double[][] matrix1 = new double[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter 3 x 3 Matrix2: ");
		double[][] matrix2 = new double[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(multiplyMatrix(matrix1, matrix2)[i][j] + " ");
				counter++;
				if(counter % 3 == 0)
					System.out.println();
			}
		}
		System.out.println();
	}
}
