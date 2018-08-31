import main.StringProcessing;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/** The class contains JUnit tests for class StringProcessing */
public class StringProcessingTester {
	private StringProcessing sp;

	@Before
	public void setup() {
		sp = new StringProcessing("sprbwl");
	}

	@Test
	public void testContainsCharacterTrue() {
		assertTrue("sprbwl contains letter 'r' but the method returned false!", sp.containsCharacter('r'));
	}

	@Test
	public void testContainsCharacterFalse() {
		assertTrue("sprbwl does not contain letter 'u' but the method returned true!", !sp.containsCharacter('u'));
	}

	@Test
	public void testIsUppercase() {
		sp.setString("CaT");
		assertTrue("isUppercase method is incorrect: " +
				"For \"CaT\" should have returned false", !sp.isUppercase());
	}

	@Test
	public void testIsUppercase2() {
		sp.setString("CAT");
		assertTrue("isUppercase method is incorrect: " +
				"For \"CAT\" should have returned true", sp.isUppercase());
	}

	@Test
	public void testEqualTrueCS() {
		sp.setString("dog");
		assertTrue("'dog' should not be equal to 'DOg' if we pass case sensitive=  true ", !sp.equal("DOg", true));
	}

	@Test
	public void testEqualTrue() {
		sp.setString("dog");
		assertTrue("'dog' should be equal to 'DOg' if we pass case sensitive = false ", sp.equal("DOg", false));
	}

	@Test
	public void testEqualFalse() {
		sp.setString("dog");
		assertTrue("'dog' should not be equal to 'cat'", !sp.equal("cat", false));

	}

	@Test
	public void testGetWithoutWhiteSpaces() {
		sp.setString("hawaii  is beauti fu l ");
		assertTrue("Did not remove white spaces correctly. ",
				sp.getStringWithoutWhiteSpaces().equals("hawaiiisbeautiful"));
	}
	
	@Test
	public void testGetReversedString() {
		sp.setString("He llo");
		assertTrue("Reverse string is not what expected ",
				sp.getReversedString().equals("oll eH"));
	}

}
