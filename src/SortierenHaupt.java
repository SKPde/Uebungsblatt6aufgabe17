
public class SortierenHaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] kette = {'E','F','A','C','H','B','G','D'};
		
		char[] sortiert = Sortiermethoden.insertionssort(kette);
		System.out.print("Insertionssort: ");
		for(int x = 0; x < sortiert.length; x++) {
			System.out.print(sortiert[x]);
		}
		
		char[] neuekette = {'E','F','A','C','H','B','G','D'};
		char[] insortiert = Sortiermethoden.selectionssort(neuekette);
		System.out.println(" ");
		System.out.print("Selectionsort: ");
		
		System.out.println(insortiert);
		System.out.println(" ");
		
		char[] schnellekette = {'H', 'G', 'F', 'D', 'E', 'C', 'B', 'A'};
		schnellekette = Quicksort.quicksort(schnellekette);
		System.out.print("Quicksort: ");
		System.out.print(schnellekette);
		
	}

}
