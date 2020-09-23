package no.hvl.dat100.lab6.matriser;

public class Matriser {
	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] rad: matrise) {
			for(int j: rad) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = ("");
		for (int i=0; i<matrise.length; i++) {
			for(int j=0; j<matrise[i].length; j++) {
				streng += (matrise[i][j] + " ");
		}
		streng += ("\n");
	} 
		System.out.println(streng);	
		return streng;
}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] sum = new int[matrise.length][matrise.length];
		for (int i=0; i<matrise.length; i++) 
			for(int j=0; j<matrise[i].length; j++) 
				sum [i][j] = matrise[i][j]*tall;
		return sum;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean flag = true;
		int rad1 = a.length;
		int col1 = a[0].length;
		int rad2 = b.length;
		int col2 = b[0].length;
		if(rad1 !=rad2 || col1 != col2) {
			System.out.println("Matriser er ikkje like");
			flag = false;
		} else {
			for(int i = 0; i<rad1; i++) {
				for(int j = 0; j<col1;j++) {
					if(a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}
		}
			return flag;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		 for (int i = 0; i < matrise.length; i++)
		    {
		      if (matrise[i].length != matrise.length) throw new
		        IllegalArgumentException("Tabellen er ikke kvadratisk!");

		      for (int j = 0; j < i; j++)
		      {
		        int tab = matrise[i][j];  // bytter om a[i][j] og a[j][i]
		        matrise[i][j] = matrise[j][i];
		        matrise[j][i] = tab;
		      }
		    }
		return matrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] product = new int[a.length][b.length];
		for(int i = 0; i< 3; i++) {
			for(int j= 0; j< 3; j++) {
				for(int k= 0; k < 3; k++) {
					product[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		return product;
	}
	
}
