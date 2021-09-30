package arraysTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import arrays.Array;
import arrays.ArrayInsertion;

public class ArrayInsertionTest {

	
	ArrayInsertion myArray;

	@Before
	public void requirements() {
		myArray = new ArrayInsertion();
	}
	
	@Test
	public void insertionTestPositive() {
		int[] arr=new int[5];
		myArray.insert(arr, 1, 0);
		myArray.insert(arr, 2, 1);
		myArray.insert(arr, 3, 2);
		assertEquals(3, myArray.getSize());
	}
	@Test
	public void insertionTestNegative() {
		int[] arr1=new int[10];
		myArray.insert(arr1, 1, 0);
		myArray.insert(arr1, 2, 1);
		myArray.insert(arr1, 3, 2);
		assertNotEquals(2, myArray.getSize());
	}
}
