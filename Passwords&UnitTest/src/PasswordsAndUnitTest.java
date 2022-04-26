import java.util.ArrayList;
import java.util.Scanner;

public class PasswordsAndUnitTest {

	static ArrayList<String> passwords = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Hello! Please enter a password: ");
		
		String password = scnr.next();
		
		if(addPassword(password)) {
			passwords.add(password);
		} else {
			System.out.println("That's not a valid password.");
		}
	

	}
	
	public static boolean addPassword(String password) {
		
		boolean validPassword = true;
		
		for (int i = 0; i < passwords.size(); i++) {
			if(passwords.get(i) == password) {
				validPassword = false;
			}
		}
		
		if(password.length() < 7 || password.length() > 12) {
			validPassword= false;
		}
		
		if(!((password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || 
		   password.contains("7") || password.contains("8") || password.contains("9") || password.contains("0"))) || password.contains("6")) {
			validPassword = false;
		}
		
		if(password.contains(" ")) {
			validPassword = false;
		}

		
		return validPassword;
	}
	
	

}