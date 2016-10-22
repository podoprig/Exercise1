import java.util.Scanner;

public class HelloUser {

	String userName;
	Scanner input = new Scanner(System.in);

	public void setUserName() {
		// userName= input.nextLine();
		System.out.println("Please enter your name: ");
		userName = input.next();
	}

	public void greetUser() {
		System.out.println("Hello " + userName);
	}
}
