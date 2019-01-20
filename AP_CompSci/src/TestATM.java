import java.util.Scanner;
public class TestATM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//When it is on, it never turns off
		boolean isOn = true;
		//Create the ID
		Account myAccount = new Account("George", 1122, 1000);
		myAccount.setInterestRate(1.5);
		
		//Prompt user to enter ID
		while(isOn) {
			System.out.println("Enter an id: ");
			int myID = input.nextInt();
			while(myID != 1122) {
				System.out.println("Incorrect id. Try Again: ");
				System.out.println("Enter an id: ");
				myID = input.nextInt();
			}
			int Choice = 0;
			while(Choice != 5) {
				mainMenu();
				Choice = input.nextInt();
				switch(Choice) {
				case 1:
					System.out.print("ID: " + myAccount.getId());
					System.out.println("\n" + "Balance: $" +myAccount.getBalance());
					break;
				case 2:
					System.out.println("How much would you like to withdraw?: ");
					double withdraw = input.nextDouble();
					if(withdraw > myAccount.getBalance())
						System.out.println("Insufficient Funds");
					else
						myAccount.withdraw(withdraw);
					break;
				case 3:
					System.out.println("How much would you like to deposit?: ");
					double deposit = input.nextDouble();
					myAccount.deposit(deposit);
					break;
				case 4:
					myAccount.print();
					break;
				default:
					break;
				}
			}
		}
		input.close();
	}
	static void mainMenu() {
		System.out.println("\n" + "Main Menu" + "\n" + "1: Check Balance" + "\n" + 
				"2: Withdraw" + "\n" + "3: Deposit" + "\n" + "4: Transactions" + "\n"
				+ "5: Exit" + "\n" + "Enter a Choice: ");
	}
}