
public class Quicksort {

	private static int unten = 0;
	private static int oben = 0;
	private static int piviot = 0;
	private static int count = 0;

	public static char[] quicksort(char[] zeichenkette) {

		char[] temp = new char[zeichenkette.length];
		char[] ausgabe = new char[zeichenkette.length];

		System.arraycopy(zeichenkette, 0, temp, 0, zeichenkette.length);
		System.arraycopy(zeichenkette, 0, ausgabe, 0, zeichenkette.length);

		unten = 0;
		oben = zeichenkette.length - 1;
		for (int x = unten; x < getPiviot(unten, oben); x++) {
			ausgabe = sortierung(unten, oben, ausgabe);
		}
		return ausgabe;

	}

	public static char[] sortierung(int unten, int oben, char[] zeichenkette) {
		char[] ausgabe = new char[zeichenkette.length];
		System.arraycopy(zeichenkette, 0, ausgabe, 0, zeichenkette.length);
		int piviot = getPiviot(unten, oben);
		int templi = 0;
		int tempre = piviot + 1;

		while (ausgabe[templi] < ausgabe[piviot] && templi < piviot) {
			templi++;
		}
		while (ausgabe[tempre] > ausgabe[piviot] && tempre < oben) {
			tempre++;
		}

		if (ausgabe[templi] > ausgabe[piviot] && ausgabe[tempre] < ausgabe[piviot]) {
			ausgabe = Sortiermethoden.tauscheWerte(templi, tempre, ausgabe);
		}
		/*
		 * count++; if(count < piviot) { System.out.println("Rekursion");
		 * sortierung(unten, oben, ausgabe); }
		 */

		return ausgabe;
	}

	public static int getPiviot(int unten, int oben) {
		return (unten + oben) / 2;
	}
}
