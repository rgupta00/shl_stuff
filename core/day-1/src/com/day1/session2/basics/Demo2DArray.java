package com.day1.session2.basics;

public class Demo2DArray {

	public static void main(String[] args) {
		int x[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 1, 1 } };

		print2DArray(x);
		boolean isIdentityMatrix = isIdentityMatrix(x);

		System.out.println(isIdentityMatrix);
	}

	private static boolean isIdentityMatrix(int[][] x) {
		boolean isIdentityMatrix = true;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (i == j) {
					if (x[i][i] != 1) {
						isIdentityMatrix = false;
						break;
					}
				} else {
					if (x[i][j] != 0) {
						isIdentityMatrix = false;
						break;
					}

				}
			}
		}
		return isIdentityMatrix;
	}

	private static void print2DArray(int[][] x) {
		for (int temp[] : x) {
			for (int temp2 : temp) {
				System.out.print(temp2 + " ");
			}
			System.out.println();
		}
	}

}
