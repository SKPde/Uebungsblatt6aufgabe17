
public class Sortiermethoden {

	private Sortiermethoden() {

	}

	public static char[] insertionssort(char[] zeichenkette) {
		char[] ausgabe = new char[zeichenkette.length];
		int templange = zeichenkette.length;
		System.arraycopy(zeichenkette, 0, ausgabe, 0, zeichenkette.length);

		while (templange > 1) {
			for (int x = 0; x < templange - 1; x++) {

				if (zeichenkette[x] > zeichenkette[x + 1]) {
					System.arraycopy(zeichenkette, x, ausgabe, x + 1, 1);
					System.arraycopy(zeichenkette, x + 1, ausgabe, x, 1);
				} else if (zeichenkette[x] <= zeichenkette[x + 1]) {
					System.arraycopy(zeichenkette, x + 1, ausgabe, x + 1, 1);
					System.arraycopy(zeichenkette, x, ausgabe, x, 1);
				}
				System.arraycopy(ausgabe, 0, zeichenkette, 0, zeichenkette.length);
				// System.out.println(ausgabe);
			}
			templange--;
		}

		return ausgabe;
	}

	public static char[] selectionssort(char[] zeichenkette) {
		char[] ausgabe = new char[zeichenkette.length];
		System.arraycopy(zeichenkette, 0, ausgabe, 0, zeichenkette.length);
		int minimumindex = 0;
		
		for(int count = 0; count < zeichenkette.length-1; count++) {
			minimumindex = Sortiermethoden.minimum(count, zeichenkette.length-1, ausgabe);
			ausgabe = Sortiermethoden.tauscheWerte(count, minimumindex, ausgabe);
		}

		return ausgabe;
	}

	public static int minimum(int von, int bis, char[] eingang) {
		int minimum = von;
		char kleinstes = eingang[von];

		for (int x = von + 1; x <= bis; x++) {
			if (eingang[x] < kleinstes) {
				kleinstes = eingang[x];
				minimum = x;
			}
		}

		return minimum;
	}
	
	public static char[] tauscheWerte(int pos1, int pos2, char[] zeichenkette) {
		char[] ausgabe = new char[zeichenkette.length]; 
		System.arraycopy(zeichenkette, 0, ausgabe, 0, zeichenkette.length);
		char[] temp = new char[zeichenkette.length];
		System.arraycopy(zeichenkette, 0, temp, 0, zeichenkette.length);
		
		System.arraycopy(temp, pos1, ausgabe, pos2, 1);
		System.arraycopy(zeichenkette, pos2, ausgabe, pos1, 1);

		
		return ausgabe;
	}

}
