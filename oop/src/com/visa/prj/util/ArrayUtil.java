package com.visa.prj.util;

import java.util.Arrays;

public class ArrayUtil {
	public static int getSum(int[] elems) {
		int sum = 0;
		for (int i = 0; i < elems.length; i++) {
			sum += elems[i];
		}
		return sum;
	}
	
	public static int getCount(int[] elems, int no) {
		int count = 0;
		for (int i = 0; i < elems.length; i++) {
			if(elems[i] == no) count++;
		}
		return count;
	}
	
	public static void sort(int[] elems) {
		Arrays.sort(elems);
	}
}
