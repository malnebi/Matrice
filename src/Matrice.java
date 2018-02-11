import java.util.Scanner;

public class Matrice {

	/**
	 * @author Vanja Bijelovic
	 */
	/**
	 * 1.Method returns a new array by eliminating the duplicate values in the
	 * array.
	 */
	public static int[] eliminateDuplicates(int[] list) {
		return list;
	}

	/**
	 * @author Vanja Bijelovic
	 */
	/**
	 * 2. Method returns true if the list is already sorted in increasing order.
	 */
	public static boolean isSorted(int[] list) {
		return true;
	}

	/**
	 * @author Vanja Mihajlovic
	 */

	/**
	 * 3.Method returns a sorted string For example, sort("acb") returns abc.
	 */
	public static String sort(String s) {
		return "string";
	}

	/**
	 * @author Vanja Mihajlovic
	 */

	/**
	 * 4. Method that sums all the numbers in the major diagonal in an n * n
	 * matrix of double values using the following header: public static double
	 * sumMajorDiagonal(double[][] m) Write a test program that reads a 4-by-4
	 * matrix and displays the sum of all its elements on the major diagonal.
	 */

	/**
	 * @author Maja Vasilic
	 */

	/**
	 * 6. Method returns the sum of all the elements in a specified column in a
	 * matrix
	 */
	public static double sumColumn(double[][] m, int columnIndex) {

		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex - 1];
		}
		return sum;
	}

	/**
	 * @author Maja Vasilic
	 */

	/**
	 * 7. Method sorts a two-dimensional array. The method performs a primary
	 * sort on rows and a secondary sort on columns.
	 */
	public static void sort(int m[][]) {

		/** Sorting rows */
		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {
				double currentMin = m[i][j];
				int currentMinIndex = j;
				// searchong for minimum element in a row
				for (int k = j + 1; k < m[i].length; k++) {
					if (currentMin > m[i][k]) {
						currentMin = m[i][k];
						currentMinIndex = k;
					}
				}

				if (currentMinIndex != j) {
					m[i][currentMinIndex] = m[i][j];
					m[i][j] = (int) currentMin;
				}
			}
		}
		// printing sorted matrix rows
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		/** sorting columns */

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m[i].length; j++) {
				double currentMin = m[i][j];
				int currentMinIndex = j;
				// searchong for minimum element in a row
				for (int k = j + 1; k < m[i].length; k++) {
					if (currentMin > m[k][i]) {
						currentMin = m[k][i];
						currentMinIndex = k;
					}
				}

				if (currentMinIndex != i) {
					m[currentMinIndex][j] = m[i][j];
					m[i][j] = (int) currentMin;
				}
			}

			// printing sorted matrix rows
			for (i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();
			}

		}

	}
}
