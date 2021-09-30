package arraysTest;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;

import arrays.Array;

public class ArrayTest {
	
	Array myArray;

	@Before
	public void requirements() {
		myArray = new Array();
	}
	
	@Test
	public void insertionTestPositive() {
		//myArray.getValues();
		int excSize=3;
		myArray.insert(1, 0);
		myArray.insert(2, 1);
		myArray.insert(3, 2);
		assertEquals(excSize, myArray.getSize());
	}
	
	@Test 
	public void insertionTestNegative() {
		int excSize=2;
		myArray.insert(4, 3);

		assertNotEquals(excSize, myArray.getSize());
	}
	
	@Test
	public void deletionTestPositive() {
		myArray.insert(5, 0);
		myArray.insert(5, 1);
		int excSize=1;
		myArray.delete(0);

		assertEquals(excSize, myArray.getSize());
	}
	@Test
	public void deletionTestNegative() {
		int excSize=3;
		myArray.insert(5, 0);
		myArray.delete(2);
		assertNotEquals(excSize, myArray.getSize());
	}
	@Test
	public void linearSearchPositive() {
		myArray.insert(5, 0);
		assertTrue(myArray.linearSearch(5));
	}
	@Test
	public void linearSearchNegative() {
		myArray.insert(5, 0);
		assertFalse(myArray.linearSearch(4));
	}
	@Test
	public void binarySearchTestPositive() {
		myArray.insert(5, 0);
		myArray.insert(6, 1);
		myArray.insert(7, 2);
		assertTrue(myArray.binarySearch(6,0,2));
	}
	@Test
	public void binarySearchTestNegative() {
		myArray.insert(5, 0);
		myArray.insert(6, 1);
		myArray.insert(7, 2);
		assertFalse(myArray.binarySearch(2,0,2));
	}
	
	@Test
	public void bubbleSortTestPositive() {
		myArray.insert(3, 0);
		myArray.insert(2, 1);
		myArray.insert(1, 2);

		myArray.bubbleSort();

		assertEquals(1, myArray.getArr()[0]);
	}
	@Test
	public void bubbleSortTestNegative() {
		myArray.insert(3, 0);
		myArray.insert(2, 1);
		myArray.insert(1, 2);

		myArray.bubbleSort();

		assertNotEquals(1, myArray.getArr()[2]);
	}
}
