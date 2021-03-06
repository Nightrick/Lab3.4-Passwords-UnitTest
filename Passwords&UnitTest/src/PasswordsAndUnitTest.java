import java.util.ArrayList;
import java.util.Scanner;

public class PasswordsAndUnitTest {

	static ArrayList<String> passwords = new ArrayList<>();
	
	public static void main(String[] args) {
		
	    Scanner scnr = new Scanner(System.in);
		String password = "";
		String continueAdds = "y";
		
		do {
		System.out.print("Hello! Please enter a password: ");
		
		password = scnr.next();
		
		if(addPassword(password)) {
			if(!(passwords.contains(password))) {
			passwords.add(password);
			System.out.print("Would you like to add another password? (y/n): ");
			continueAdds = scnr.next().toLowerCase();
			} else {
				System.out.println("That's not a valid password.");
			}
			
		} else {
			System.out.println("That's not a valid password.");
		}
		}while(continueAdds.equals("y"));
		
		System.out.println("Thank you. Have a nice day!"); 

	}
	
	public static boolean addPassword(String password) {
		
		boolean validPassword = true;
		int capitalVowelCounter = 0;
		
		if(password.equals("admin") || password.equals("mod")) {
			return validPassword;
		}
		
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
		
		char[] passwordCharacters = password.toCharArray();
		
		for(int i = 0; i < passwordCharacters.length; i++) {
			if(vowelChecker(passwordCharacters[i])) {
				if( Character.isUpperCase(passwordCharacters[i])) {
					capitalVowelCounter++;
				}
			}	
		}
		
		if(capitalVowelCounter < 2) {
			validPassword = false;
		}

		return validPassword;
	}
	
	public static boolean vowelChecker(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' ||
		   c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y'	) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
