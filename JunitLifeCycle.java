import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitLifeCycle {
	private static int counter = 0;

	@BeforeClass
	public static void suiteSetup() {
		assertEquals(0, counter);
		counter++;
		System.out.println("suiteSetup  " + counter);
	}

	public JunitLifeCycle() {
		assertTrue(Arrays.asList(1, 5).contains(counter));
		counter++;
		System.out.println("JunitLifeCycle  " + counter);
	}

	@Before
	public void prepareTest() {
		assertTrue(Arrays.asList(2, 6).contains(counter));
		counter++;
		System.out.println("prepareTest " + counter);
	}

	@Test
	public void peformFirstTest() {
		assertTrue(Arrays.asList(3, 7).contains(counter));
		counter++;
		System.out.println("peformFirstTest " + counter);
	}

	@Test
	public void performSecondTest() {
		assertTrue(Arrays.asList(3, 7).contains(counter));
		counter++;
		System.out.println("performSecondTest " + counter);
	}
	
	
	@Test
	public void assertionWithoutMessage() {
		final List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		assertTrue("Numbers not empty.... ",numbers.isEmpty());
	}
	

	@After
	public void cleanupTest() {
		assertTrue(Arrays.asList(4, 8).contains(counter));
		counter++;
		System.out.println("cleanupTest " + counter);
	}

	@AfterClass
	public static void suiteFinished() {
		assertEquals(9, counter);
		System.out.println("suiteFinished " + counter);
	}
}