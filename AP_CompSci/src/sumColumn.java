import java.util.Scanner;
public class sumColumn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter = 0;
		double[] sum = new double[4];
		System.out.println("Enter a 3 by 4 matrix row by row: ");
		double[][] myArray = new double[3][4];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				myArray[i][j] = input.nextDouble();
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				sum[i] += myArray[j][i];
			}
		}
		System.out.println("This is my Array: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(myArray[i][j] + " ");
				counter++;
				if(counter == 4) {
					System.out.println();
					counter = 0;
				}
			}
		}
		System.out.println("\n" + "This is the Sum of the Arrays: ");
		for(int i = 0; i < 4; i++) {
			System.out.print(sum[i] + " ");
		}
		System.out.println();
	}
}
