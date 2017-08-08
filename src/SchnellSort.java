
public class SchnellSort {

	private static char[] buchstabenkette;
	
	public static char[] sortieren(char[] zeichenkette) {
		buchstabenkette = new char[zeichenkette.length];
		System.arraycopy(zeichenkette, 0, buchstabenkette, 0, zeichenkette.length);
		schnellsortierung(0, (zeichenkette.length-1));
		return buchstabenkette;
	}
	
	private static void schnellsortierung(int vonunten, int vonoben) {
		
        int i = vonunten;
        int j = vonoben;
        int pivot = vonunten + (vonoben - vonunten) / 2;

        while (i <= j) {
            while (buchstabenkette[i] < buchstabenkette[pivot] && i < pivot) {
                i++;
            }

            while (buchstabenkette[j] > buchstabenkette[pivot] && j > pivot) {
                j--;
            }

            if (i <= j) {
                buchstabenkette = Sortiermethoden.tauscheWerte(j, i, buchstabenkette);
                i++;
                j--;
            }
        }
        //call quickSort recursively
        if (vonunten < j) {
            schnellsortierung(vonunten, j);
        }
        if (i < vonoben) {
            schnellsortierung(i, vonoben);
        }
    }
	}

