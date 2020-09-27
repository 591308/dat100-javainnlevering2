package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	  // a)
	public static void skrivUt(int[] tabell) {
				System.out.println("[" + tabell.length + "]");
	} 
	
	 //b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";
		for (int i=0; i<tabell.length; i++) {
			if(i != tabell.length-1) {
				streng += tabell[i] + ", ";					
			} else {
				streng += tabell[i];
			}
		}
		streng += "]";
		System.out.println(streng);
		return streng;
		
	} 
	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i=0; i<tabell.length; i++)	{
			sum += tabell[i];
		}
		System.out.println(sum);
		/*
		int sumWhile = 0;
		int test = 0;
		while (test < tabell.length) {
			sumWhile += tabell[test];
			test++;
		}
		System.out.println(sumWhile);
		
		int sumUtvidet = 0;
		for (int t: tabell) {
			sumUtvidet += t;	
		}
		System.out.println(sumUtvidet);
		*/
		return sum;
}
		
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
	   
		boolean finnes = false;
		int i=0;
		while (!finnes && i<tabell.length) {
			if(tabell[i] == tall) {
				finnes = true;
			}
				i++;
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for(int i=0; i<tabell.length; i++)
			if(tabell[i] == tall)
				return i;
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int nyTabell[] = new int[tabell.length];
		for(int i=0, j = tabell.length-1; i < tabell.length && j>=0 ; i++, j--) {
			nyTabell[i] = tabell[j];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		int i=1;
		while(sortert && i<tabell.length) {
			if(tabell[i-1] <= tabell[i])
				i++;
			else
				sortert = false;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int nyLengde = tabell1.length + tabell2.length;
		int [] nyTab = new int [nyLengde];
		for(int i=0; i<tabell1.length; i++) {
			nyTab[i]= tabell1[i];
		}
		for(int j=0; j<tabell2.length; j++) {
			nyTab[tabell1.length+j]=tabell2[j];
		}
		return nyTab;
	}
}
