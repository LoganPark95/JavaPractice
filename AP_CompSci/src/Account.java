import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
public class Account {
	Scanner input = new Scanner(System.in);
	Date Date = new Date();
	String name;
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = Date;
	private ArrayList myTransaction = new ArrayList<Transaction>();
	Account(){
		
	}
	Account(int ID, double Balance){
		id = ID;
		balance = Balance;
	}
	Account(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	int getId() {
		return id;
	}
	double getBalance() {
		return balance;
	}
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	void setId(int newId) {
		id = newId;
	}
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	void setInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	Date getDateCreated() {
		return dateCreated;
	}
	double getMonthlyInterest() {
		return (int)(balance * ((getMonthlyInterestRate() / 100)) * 100) / 100.0;
	}
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	double withdraw(double withdraw) {
		System.out.println("Enter Description: ");
		Transaction Withdrawing = new Transaction('W', withdraw, balance, input.nextLine());
		myTransaction.add(Withdrawing);
		balance -= withdraw;
		return balance;
	}
	double deposit(double deposit) {
		System.out.println("Enter Description: ");
		Transaction Depositing = new Transaction('D', deposit, balance, input.nextLine());
		myTransaction.add(Depositing);
		balance += deposit;
		return balance;
	}
	void print(){
		for(int i = 0; i < myTransaction.size(); i++) {
			System.out.println(myTransaction.get(i).toString());
		}
	}
}
