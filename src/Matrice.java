public class Matrice {

	public static void main(String[] args) {

	}

	/**
	 * @author Vanja Bijelovic
	 */
	/**
	 * 1.Method returns a new array by eliminating the duplicate values in the
	 * array.
	 */
	public static int brojacJedinstvenih(int[] niz1){
		int brojac=0;
		
		for(int i=0; i<niz1.length; i++){
			boolean jedinstven=true;
			for(int j=0; j<i; j++){
				if(niz1[i]==niz1[j]){
					jedinstven=false;
					break;
				}
			}
			if(jedinstven){
				brojac++;
			}
		}
		
		return brojac;
	}
	public static int[] eliminateDuplicates(int[] list) {
	}
	int[] niz2=new int[brojacJedinstvenih(list)];
	int pozicija=0;
	
	for(int i=0; i<niz1.length; i++){
		boolean jedinstven=true;
		for(int j=0; j<i; j++){
			if(niz1[i]==niz1[j]){
				jedinstven=false;
				break;
			}
		}
		if(jedinstven){
			niz2[pozicija]=niz1[i];
			pozicija++;
		}
		
	/**
	 * @author Vanja Bijelovic
	 */
	/**
	 * 2. Method returns true if the list is already sorted in increasing order.
	 */
	public static boolean isSorted(int[] list) {
	}
	boolean sortiran=true;
	for(int i=0;i<niz.length-1;i++)
	{
		if(niz[i]>niz[i+1]) sortiran=false;
		
	}
	return sortiran;
	/**
	 * @author Vanja Mihajlovic
	 */

	/**
	 * 3.Method returns a sorted string For example, sort("acb") returns abc.
	 */
	public static String sort(String s) {
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
	}

	/**
	 * @author Maja Vasilic
	 */

	/**
	 * 7. Method sorts a two-dimensional array The method performs a primary
	 * sort on rows and a secondary sort on columns.
	 */
	public static void sort(int m[][]) {
	}

}
