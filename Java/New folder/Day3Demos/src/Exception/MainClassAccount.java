package Exception;

public class MainClassAccount {

	public static void main(String[] args) {
		Account obj = new Account("Pooja",5000);
		try {
			System.out.println(obj.getBalance("Pooja"));
		} catch (AccountException e) {
			System.out.println("not a valid user");
		}
		
		try {
			obj.withdraw(3000);
			return;
		} catch (AccountException e) {
			System.out.println("Insufficient Balance");
		}
		try {
			System.out.println("balance = "+obj.getBalance(obj.getName()));
			return;
		} catch (AccountException e) {
			System.out.println("not a valid user");
		}
		try {
			obj.withdraw(3000);
		} catch (AccountException e) {
			System.out.println("Insufficient Balance");
		}
	}
}
