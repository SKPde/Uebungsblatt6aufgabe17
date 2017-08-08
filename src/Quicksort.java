
public class Quicksort {

	private static int unten = 0;
	private static int oben = 0;
	private static int vorpiviot = 0;
	private static int count = 0;

	public static char[] quicksort(char[] zeichenkette) {

		char[] temp = new char[zeichenkette.length];
		char[] ausgabe = new char[zeichenkette.length];

		System.arraycopy(zeichenkette, 0, temp, 0, zeichenkette.length);
		System.arraycopy(zeichenkette, 0, ausgabe, 0, zeichenkette.length);
		vorpiviot = zeichenkette.length - 1;
		unten = 0;
		oben = zeichenkette.length - 1;
		while (vorpiviot > 2) {
			for (int x = unten; x < getPiviot(unten, oben); x++) {
				ausgabe = sortierung(unten, oben, ausgabe);
			}
			oben = vorpiviot;
		}
		return ausgabe;

	}

	public static char[] sortierung(int unten, int oben, char[] zeichenkette) {
		char[] ausgabe = new char[zeichenkette.length];
		System.arraycopy(zeichenkette, 0, ausgabe, 0, zeichenkette.length);
		int piviot2 = getPiviot(unten, oben);
		int templi = 0;
		int tempre = zeichenkette.length-1;

		while (ausgabe[templi] < ausgabe[piviot2] && templi < piviot2) {
			templi++;
		}
		while (ausgabe[tempre] > ausgabe[piviot2] && tempre > piviot2) {
			tempre--;
		}

		if (ausgabe[templi] > ausgabe[piviot2] && ausgabe[tempre] < ausgabe[piviot2]) {
			ausgabe = Sortiermethoden.tauscheWerte(templi, tempre, ausgabe);
		}
		/*
		 * count++; if(count < piviot) { System.out.println("Rekursion");
		 * sortierung(unten, oben, ausgabe); }
		 */
		vorpiviot = piviot2;
		return ausgabe;
	}

	public static int getPiviot(int unten, int oben) {
		return (unten + oben) / 2;
	}
}
