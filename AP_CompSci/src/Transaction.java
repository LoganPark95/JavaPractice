import java.util.Date;
public class Transaction {
	Date Data;
	char type;
	double amount;
	double balance;
	String description;
	
	Date getDate() {
		return Data;
	}
	char getType(){
		return type;
	}
	void setDate() {
		Data = new Date();
	}
	void setType(char type) {
		this.type = type;
	}
	Transaction(char type, double amount, double balance, String description){
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
}
