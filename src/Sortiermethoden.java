
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
		
		int beginn = 1;
		char minimum = zeichenkette[0];
		int tempindex = 0;
		
		for(int x = beginn; x < zeichenkette.length; x++) {
			if(zeichenkette[x] < minimum) {
				minimum = zeichenkette[x];
				tempindex = x;
			}
		}
		
		System.arraycopy(zeichenkette, 0, ausgabe, 0, zeichenkette.length);
		ausgabe[beginn-1] = minimum;
		ausgabe[tempindex] = zeichenkette[beginn-1];
		
		return ausgabe;
	}

}
