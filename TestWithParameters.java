import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class TestWithParameters {
private final int a;
private final int b;
private final int expectedAddition;
private final int expectedSubtraction; 
private final int expectedMultiplication; 
private final int expectedDivision;

//￼￼public TestWithParameters(final int a,final int b,final int expectedAddition,
//					final int expectedSubtraction, final int expectedMultiplication, 
//					final int expectedDivision) {
//	this.a = a;
//	this.b = b;
//	this.expectedAddition= expectedAddition;
//	this.expectedSubtraction = expectedSubtraction; 
//	this.expectedMultiplication = expectedMultiplication;
//	this.expectedDivision = expectedDivision;
//}

public TestWithParameters(final int a, final int b, final int  expectedAddition, final int expectedSubtraction,
		final int expectedMultiplication, final int expectedDivision) {
   
this.a = a;
this.b = b; 
this.expectedAddition = expectedAddition;
this.expectedSubtraction = expectedSubtraction; 
this.expectedMultiplication = expectedMultiplication; 
this.expectedDivision = expectedDivision;
}

@SuppressWarnings("serial")
@Parameterized.Parameters
public static List<Integer[]> parameters() {
	return new ArrayList<Integer[]>(3) {{
	add(new Integer[] {1, 2, 3, -1, 2, 0});
	add(new Integer[] {0, 1, 1, -1, 0, 0});
	add(new Integer[] {-11, 2, -9, -13, -22, -5});}}; 

}

@Test
public void addNumbers() {
	System.out.println("a: "+a + " b: "+b);
	System.out.println("ExpectedAddition: "+ expectedAddition);
	System.out.println("a+b: "+ (a + b));
assertEquals(expectedAddition, a + b); }

@Test
public void subtractNumbers() {
	System.out.println("a: "+a + " b: "+b);
	System.out.println("expectedSubtraction: "+ expectedSubtraction);
	System.out.println("a-b: "+ (a - b));
assertEquals(expectedSubtraction, a - b); }

@Test
public void multiplyNumbers() {
	System.out.println("a: "+a + " b: "+b);
	System.out.println("expectedMultiplication: "+ expectedMultiplication);
	System.out.println("a+b: "+ ( a * b));
assertEquals(expectedMultiplication, a * b); }

@Test
public void divideNumbers() {
	System.out.println("a: "+a + " b: "+b);
	System.out.println("expectedDivision: "+ expectedDivision);
	System.out.println("a+b: "+ (a / b));
assertEquals(expectedDivision, a / b); }


}