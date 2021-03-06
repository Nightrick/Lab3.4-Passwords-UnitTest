import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PasswordsUnitTests {

	@Test
	void doesArrayListContainPassword() {
		
		ArrayList<String> expected = new ArrayList<String> (Arrays.asList("mod", "IthinkthIs9", "gOOgleGuy99"));
		
		if (PasswordsAndUnitTest.addPassword("mod")) {
			if(!(PasswordsAndUnitTest.passwords.contains("mod"))) {
				PasswordsAndUnitTest.passwords.add("mod");
		}
		}
			if (PasswordsAndUnitTest.addPassword("IthinkthIs9")) {
				if(!(PasswordsAndUnitTest.passwords.contains("IthinkthIs9"))) {
					PasswordsAndUnitTest.passwords.add("IthinkthIs9");
			}
			}
		if (PasswordsAndUnitTest.addPassword("gOOgleGuy99")) {
				if(!(PasswordsAndUnitTest.passwords.contains("gOOgleGuy99"))) {
					PasswordsAndUnitTest.passwords.add("gOOgleGuy99");
			}		
		}
		ArrayList<String> actual = PasswordsAndUnitTest.passwords;
		
		
		assertEquals(expected, actual);
	}
		
	    //Method returns true or false correctly 
		@Test
		void isPasswordLongEnough1() {
			
			assertEquals(true, PasswordsAndUnitTest.addPassword("gOOgleGuy99"));
	}
		
		//Method returns true or false correctly
		@Test
		void isPasswordLongEnough2() {
			
			assertEquals(false, PasswordsAndUnitTest.addPassword("gOOgleyDoogelyGuy99"));
		
	}
		
		//ArrayList changed
		@Test
		void isPasswordLongEnough3() {
			
			ArrayList<String> expected = new ArrayList<String> (Arrays.asList("mod", "IthinkthIs9"));
			
			if (PasswordsAndUnitTest.addPassword("mod")) {
				if(!(PasswordsAndUnitTest.passwords.contains("mod"))) {
					PasswordsAndUnitTest.passwords.add("mod");
			}
			}
				if (PasswordsAndUnitTest.addPassword("OOGy99")) {
					if(!(PasswordsAndUnitTest.passwords.contains("OOGy99"))) {
						PasswordsAndUnitTest.passwords.add("OOGy99");
				}
				}
			if (PasswordsAndUnitTest.addPassword("IthinkthIs9")) {
					if(!(PasswordsAndUnitTest.passwords.contains("IthinkthIs9"))) {
						PasswordsAndUnitTest.passwords.add("IthinkthIs9");
				}		
			}
			ArrayList<String> actual = PasswordsAndUnitTest.passwords;
			
			
			assertEquals(expected, actual);
		
	}
		
		@Test
		void doesPasswordHaveAppropriateNumbers1() {
			
			assertEquals(false, PasswordsAndUnitTest.addPassword("gOOgleGuy66"));
		
	}
		
		@Test
		void doesPasswordHaveAppropriateNumbers2() {
			
			assertEquals(true, PasswordsAndUnitTest.addPassword("gOOgleGuy99"));
		
	}
		
		//ArrayList changed
		@Test
		void doesPasswordHaveAppropriateNumbers3() {
			
			ArrayList<String> expected = new ArrayList<String> (Arrays.asList("mod", "IthinkthIs9"));
			
			if (PasswordsAndUnitTest.addPassword("mod")) {
				if(!(PasswordsAndUnitTest.passwords.contains("mod"))) {
					PasswordsAndUnitTest.passwords.add("mod");
			}
			}
				if (PasswordsAndUnitTest.addPassword("gOOgleGuy66")) {
					if(!(PasswordsAndUnitTest.passwords.contains("gOOgleGuy66"))) {
						PasswordsAndUnitTest.passwords.add("gOOgleGuy66");
				}
				}
			if (PasswordsAndUnitTest.addPassword("IthinkthIs9")) {
					if(!(PasswordsAndUnitTest.passwords.contains("IthinkthIs9"))) {
						PasswordsAndUnitTest.passwords.add("IthinkthIs9");
				}		
			}
			ArrayList<String> actual = PasswordsAndUnitTest.passwords;
			
			
			assertEquals(expected, actual);
		
	}
		
		@Test
		void doesPasswordHaveSpaces1() {
			
			assertEquals(true, PasswordsAndUnitTest.addPassword("gOOglGuy99"));
		
	}
		
		@Test
		void doesPasswordHaveSpaces2() {
			
			assertEquals(false, PasswordsAndUnitTest.addPassword("gOOgle Guy99"));
		
	}
		
		//ArrayList changed
		@Test
		void doesPasswordHaveSpaces3() {
			
			ArrayList<String> expected = new ArrayList<String> (Arrays.asList("mod", "IthinkthIs9"));
			
			if (PasswordsAndUnitTest.addPassword("mod")) {
				if(!(PasswordsAndUnitTest.passwords.contains("mod"))) {
					PasswordsAndUnitTest.passwords.add("mod");
			}
			}
				if (PasswordsAndUnitTest.addPassword("gOOgle Guy99")) {
					if(!(PasswordsAndUnitTest.passwords.contains("gOOgle Guy99"))) {
						PasswordsAndUnitTest.passwords.add("gOOgle Guy99");
				}
				}
			if (PasswordsAndUnitTest.addPassword("IthinkthIs9")) {
					if(!(PasswordsAndUnitTest.passwords.contains("IthinkthIs9"))) {
						PasswordsAndUnitTest.passwords.add("IthinkthIs9");
				}		
			}
			ArrayList<String> actual = PasswordsAndUnitTest.passwords;
			
			
			assertEquals(expected, actual);
		
	}
		
		@Test
		void doesPasswordHaveEnoughCapitalVowels1() {
			
			assertEquals(false, PasswordsAndUnitTest.addPassword("goOgleGuy99"));
		
	}
		
		@Test
		void doesPasswordHaveEnoughCapitalVowels2() {
			
			assertEquals(true, PasswordsAndUnitTest.addPassword("gOOgleGuy99"));
		
	}
		
		//ArrayList changed
		@Test
		void doesPasswordHaveEnoughCapitalVowels3() {
			
			ArrayList<String> expected = new ArrayList<String> (Arrays.asList("mod", "IthinkthIs9"));
			
			if (PasswordsAndUnitTest.addPassword("mod")) {
				if(!(PasswordsAndUnitTest.passwords.contains("mod"))) {
					PasswordsAndUnitTest.passwords.add("mod");
			}
			}
				if (PasswordsAndUnitTest.addPassword("googleGuy99")) {
					if(!(PasswordsAndUnitTest.passwords.contains("googleGuy99"))) {
						PasswordsAndUnitTest.passwords.add("googleGuy99");
				}
				}
			if (PasswordsAndUnitTest.addPassword("IthinkthIs9")) {
					if(!(PasswordsAndUnitTest.passwords.contains("IthinkthIs9"))) {
						PasswordsAndUnitTest.passwords.add("IthinkthIs9");
				}		
			}
			ArrayList<String> actual = PasswordsAndUnitTest.passwords;
			
			
			assertEquals(expected, actual);
		
	}
		
		@Test
		void isPasswordModorAdmin1() {
			
			assertEquals(true, PasswordsAndUnitTest.addPassword("mod"));
		
	}
		
		@Test
		void isPasswordModorAdmin2() {
			
			assertEquals(true, PasswordsAndUnitTest.addPassword("admin"));
		
	}
		
		@Test
		void isPasswordModorAdmin3() {
			
			assertEquals(false, PasswordsAndUnitTest.addPassword("Admin"));
		
	}
		
		//ArrayList changed
		@Test
		void isPasswordModorAdmin4() {
			
			ArrayList<String> expected = new ArrayList<String> (Arrays.asList("mod", "IthinkthIs9"));
			
			if (PasswordsAndUnitTest.addPassword("mod")) {
				if(!(PasswordsAndUnitTest.passwords.contains("mod"))) {
					PasswordsAndUnitTest.passwords.add("mod");
			}
			}
				if (PasswordsAndUnitTest.addPassword("gOOgle Guy99")) {
					if(!(PasswordsAndUnitTest.passwords.contains("gOOgle Guy99"))) {
						PasswordsAndUnitTest.passwords.add("gOOgle Guy99");
				}
				}
			if (PasswordsAndUnitTest.addPassword("IthinkthIs9")) {
					if(!(PasswordsAndUnitTest.passwords.contains("IthinkthIs9"))) {
						PasswordsAndUnitTest.passwords.add("IthinkthIs9");
				}		
			}
			ArrayList<String> actual = PasswordsAndUnitTest.passwords;
			
			
			assertEquals(expected, actual);
		
	}
		

}
