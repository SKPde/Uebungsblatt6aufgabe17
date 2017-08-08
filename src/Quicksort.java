
public class Quicksort {
	
	
	public static char[] quicksort(char[] zeichenkette) {
		
		char[] temp = new char[zeichenkette.length];
		char[] ausgabe = new char[zeichenkette.length];
		
		System.arraycopy(zeichenkette, 0, temp, 0, zeichenkette.length);
		System.arraycopy(zeichenkette, 0, ausgabe, 0, zeichenkette.length);
		return ausgabe;
		
	}
	
}
