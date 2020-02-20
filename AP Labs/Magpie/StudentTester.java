/**
 * The test class StudentTester.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentTester extends junit.framework.TestCase {
	
	public void testStudent00() {
		
		Magpie2 magpie21 = new Magpie2();
		assertEquals("Tell me more about your family.", magpie21.getResponse("Do you like your family?"));
		assertEquals("Yes, it is my favorite course.", magpie21.getResponse("Do you like Computer Science?"));
		assertEquals("I was created for the 2015 test.", magpie21.getResponse("Tell me about yourself."));
		assertEquals("FEARED.", magpie21.getResponse("Would you rather be liked or feared?"));
		assertEquals("No, I am not interested in humans.", magpie21.getResponse("Do you have any questions to ask me?"));
		
	}
	
}
