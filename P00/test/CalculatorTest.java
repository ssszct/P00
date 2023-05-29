import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a =1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testMultiply() {
		int a = 5000;
		int b = 2000;
		
		Calculator cal = new Calculator();
		int actual = a*b;
		
		int expected = 10000000;
		assertEquals(actual, expected);
		
	}
	
	@Test
	public final void testDivide() {
		int a = 8000;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = a/b;
		
		int expected = 4000;
		assertEquals(actual, expected);
	}
	
	@Test
	public final void testexpo() {
		int a = 2;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.expo(a, b);
		
		int expected = 8;
		assertEquals(actual, expected);
	}

}
