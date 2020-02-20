import java.io.File;

/**
 * The test class RememberStudentTester.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SaveInfoStudentTester extends junit.framework.TestCase {
	
	public void testRememberRecallDelete() throws FileNotFoundException {
		
		File inputFile = new File("studentTestFile.txt");
		Magpie2 magpie = new Magpie2(inputFile);
		magpie.getResponse("remember");														// birthday 10-11-12
		magpie.getResponse("remember");														// price $4.10
		magpie.getResponse("remember");														// day Monday
		assertEquals("$4.10", magpie.getResponse("recall"));								// price
		magpie.getResponse("delete");														// price
		assertEquals("10-11-12", magpie.getResponse("recall"));								// birthday
		assertEquals(true, magpie.getResponse("recall").indexOf("could not find") >= 0);	// price
		
	}
	
}
