import java.util.Scanner;
public class sumMajorDiagonal {
	public static void main(String[] args) {
		int counter = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 4 x 4 matrix row by row: ");
		double[][] myMatrix = new double[4][4];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				myMatrix[i][j] = input.nextDouble();
			}
		}

		//Display Array
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(myMatrix[i][j] + " ");
				counter++;
				if(counter % 4 == 0) {
					System.out.println();
				}
			}
		}
		//Invoke Method
		System.out.println("\n" + "The sum of the major diagonal is: " + "\n" +
		sumMajorDiagonal(myMatrix));
	}
	public static double sumMajorDiagonal(double[][] m) {
		double Sum = 0;
		for(int i = 0; i < 4; i++) {
			Sum += m[i][i];
		}
		return Sum;
	}
}
