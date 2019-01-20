import java.util.Scanner;

public class ATM_Machine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//When it is on, it never turns off
		boolean isOn = true;
		//Create the array of ID
		Account[] newID = new Account[10];
		//ID list from 0-9
		for(int i = 0; i < newID.length; i++) {
			newID[i] = new Account(i, 100);
		}
		
		//Prompt user to enter ID
		while(isOn) {
			System.out.println("Enter an id: ");
			int myID = input.nextInt();
			while(myID < 0 || myID > 9) {
				System.out.println("Incorrect id. Try Again: ");
				System.out.println("Enter an id: ");
				myID = input.nextInt();
			}
			int Choice = 0;
			while(Choice != 4) {
				mainMenu();
				Choice = input.nextInt();
					switch(Choice) {
					case 1:
						System.out.print("ID: " + newID[myID].getId());
						System.out.println("\n" + "Balance: $" +newID[myID].getBalance());
						break;
					case 2:
						System.out.println("How much would you like to withdraw?: ");
						double withdraw = input.nextDouble();
						if(withdraw > newID[myID].getBalance())
							System.out.println("Insufficient Funds");
						else
							newID[myID].withdraw(withdraw);
						break;
					case 3:
						System.out.println("How much would you like to deposit?: ");
						double deposit = input.nextDouble();
						newID[myID].deposit(deposit);
						break;
					case 4:
						break;
				}
			}
		}
		input.close();
	}
	static void mainMenu() {
		System.out.println("\n" + "Main Menu" + "\n" + "1: Check Balance" + "\n" + 
				"2: Withdraw" + "\n" + "3: Deposit" + "\n" + "4: Exit" + "\n" + 
				"Enter a Choice: ");
	}
}
