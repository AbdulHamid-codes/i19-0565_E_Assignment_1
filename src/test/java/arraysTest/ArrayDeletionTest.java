package arraysTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import arrays.Array;
import arrays.ArrayDeletion;


public class ArrayDeletionTest {

	
	ArrayDeletion myArray;

	@Before
	public void requirements() {
		myArray = new ArrayDeletion();
	}
	
	@Test
	public void insertionTestPositive() {
		int[] arr= {1,2,3,4,5};
		myArray.delete(arr,2);
		assertEquals(4, arr[2]);
	}
	@Test
	public void insertionTestNegative() {
		int[] arr= {1,2,3,4,5};
		myArray.delete(arr,2);
		assertNotEquals(2, arr[2]);
	}

}
