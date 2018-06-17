package com.bubblesort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test() {
		BubbleSort obj=new BubbleSort();
		assertTrue(Arrays.equals(new int[]{1,3,5,8},obj.bubbleSort(new int[]{3,1,5,8})));
	}

}
