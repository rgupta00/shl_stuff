package com.day4.session2;

public class DemoGenMethod {
	public static void main(String[] args) {

		Integer a = 4;
		Integer b = -5;
		Integer c = 6;

		Integer val = max(a, b, c);
		System.out.println(val);
	}

	static  <T extends Comparable<T>> T max(T a, T b, T c) {
			T maxValue=a;
			if(b.compareTo(a)>0) {
				maxValue=b;
			}
			if(c.compareTo(maxValue)>0) {
				maxValue=c;
			}
			
			return maxValue;
	}

}
