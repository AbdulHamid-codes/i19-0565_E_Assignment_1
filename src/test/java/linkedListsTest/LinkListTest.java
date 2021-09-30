package linkedListsTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import linkedList.LinkedList;

public class LinkListTest {

	LinkedList myList;
	
	@Before
	public void requirements() {
		myList = new LinkedList();
	}
	
	@Test
	public void pushFrontTestPositive() {
		myList.pushFront(1);
		assertEquals(1, myList.getSize());
	}
	@Test
	public void pushFrontTestNegative() {
		myList.pushFront(1);
		myList.pushFront(2);
		assertNotEquals(1, myList.getSize());
	}
	@Test
	public void pushBackTestPositive() {
		myList.pushBack(1);
		myList.pushBack(2);
		assertEquals(2, myList.getSize());
	}
	@Test
	public void pushBackTestNegative() {
		myList.pushBack(1);
		myList.pushBack(2);
		assertNotEquals(1, myList.getSize());
	}
	@Test
	public void popFrontTestPositive() {
		myList.pushBack(1);
		myList.pushBack(2);
		myList.popFront();
		assertEquals(1, myList.getSize());
	}
	@Test
	public void popFrontTestNegative() {
		myList.pushBack(1);
		myList.pushBack(2);
		myList.popFront();
		assertNotEquals(2, myList.getSize());
	}
	@Test
	public void popBackTestPositive() {
		myList.pushBack(1);
		myList.pushBack(2);
		myList.popBack();
		assertEquals(1, myList.getSize());
	}
	@Test
	public void popBackTestNegative() {
		myList.pushBack(1);
		myList.pushBack(2);
		myList.popBack();
		assertNotEquals(2, myList.getSize());
	}
	@Test
	public void popTestPositive() {
		myList.pushBack(1);
		myList.pushBack(2);
		myList.pop(1);
		assertEquals(1, myList.getSize());
	}
	@Test
	public void popTestNegative() {
		myList.pushBack(1);
		myList.pushBack(2);
		myList.pop(1);
		assertNotEquals(2, myList.getSize());
	}
	
}
