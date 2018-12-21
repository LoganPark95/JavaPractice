import java.util.Scanner;
public class sumColumn {
	public static void main(String[] args) {
		Scanner Andrea = new Scanner(System.in);
		int counter = 0;
		System.out.println("Enter a 3 by 4 matrix row by row: ");
		double[][] myArray = new double[3][4];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				myArray[i][j] = Andrea.nextDouble();
			}
		}
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
	}
}
