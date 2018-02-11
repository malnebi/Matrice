public class TestMatrice {

	public static void main(String[] args) {
		
		//creating a matrix with double elements
		double[][] niz = new double[4][4];

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[0].length; j++) {
				niz[i][j] = Math.random() * 10;
			}
			System.out.println();
		}
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[0].length; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Sum element on 4th column is "
				+ Matrice.sumColumn(niz, 4));
		System.out.println();
		
		
		//creating a matrix with integer elements
		int[][] niz1 = new int[4][4];

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz1[0].length; j++) {
				niz1[i][j] = (int) (Math.random() * 10);
			}
			System.out.println();
		}
		for (int i = 0; i < niz1.length; i++) {
			for (int j = 0; j < niz1[0].length; j++) {
				System.out.print(niz1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("SORTED");
		System.out.println();
		//invoking a method for sorting elements by row and column
		Matrice.sort(niz1);
	}

}
