import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PasswordsUnitTests {

	@Test
	void doesArrayListContainPassword() {
		
		ArrayList<String> passwords = new ArrayList<>();
		
		passwords.add("googleGuy99");
		
		assertEquals(false, PasswordsAndUnitTest.addPassword("googleGuy99"));
	}
		
		@Test
		void isPasswordLongEnough1() {
			
			assertEquals(true, PasswordsAndUnitTest.addPassword("googleGuy99"));
	}
		
		@Test
		void isPasswordLongEnough2() {
			
			assertEquals(false, PasswordsAndUnitTest.addPassword("googleyDoogelyGuy99"));
		
	}
		
		@Test
		void doesPasswordHaveAppropriateNumbers1() {
			
			assertEquals(false, PasswordsAndUnitTest.addPassword("googleGuy66"));
		
	}
		
		@Test
		void doesPasswordHaveAppropriateNumbers2() {
			
			assertEquals(true, PasswordsAndUnitTest.addPassword("googleGuy99"));
		
	}
		
		@Test
		void doesPasswordHaveSpaces1() {
			
			assertEquals(true, PasswordsAndUnitTest.addPassword("googleGuy99"));
		
	}
		
		@Test
		void doesPasswordHaveSpaces2() {
			
			assertEquals(false, PasswordsAndUnitTest.addPassword("google Guy99"));
		
	}

}
