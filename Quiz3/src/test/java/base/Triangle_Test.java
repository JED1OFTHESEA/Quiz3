package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

	public class Triangle_Test {

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void testgetArea() {
			Triangle t=new Triangle(3, 4, 5);
			assertTrue(t.getArea()==6);
			
		}
		public void testGetPerimeter(){
			Triangle t=new Triangle(2,2,2);
			assertTrue(t.getPerimeter()==6);
		}
		public void testgetArea2() {
			Triangle t=new Triangle(10, 8, 6);
			assertTrue(t.getArea()==24);
		}
		public void testGetPerimeter2(){
			Triangle t=new Triangle(19,34,20);
			assertTrue(t.getPerimeter()==73);
		}
}