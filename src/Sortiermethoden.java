
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

		String test = String.valueOf(zeichenkette[2]);

		System.out.println(test);

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

}
