
public class SortierenHaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] kette = {'E','F','A','C','H','B','G','D'};
		
		char[] sortiert = Sortiermethoden.insertionssort(kette);
		System.out.print("Insertionssort: ");
		for(int x = 0; x < sortiert.length; x++) {
			System.out.print(sortiert[x]);
		}
	}

}
