import java.util.Arrays;
import java.util.Scanner;

public class TSP_Dyn {
	
	static int[][] distances;
	
	public static void main(String[] args) {
		
		System.out.println("Hallo ich mache TSP");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Wie viele Städte sollen besucht werden?");
		int nrCities = Integer.valueOf(input.nextLine());
		
		System.out.println("Es sollen " + nrCities + " besucht werden");
		
		for (int i = 0; i < nrCities; i++) {
			//System.out.println("Stadtname: ");
			//String city = input.nextLine();
			// ... Sie wissen was gemeint ist  :-) 
		}
		
		int[] cities = new int[nrCities];
		for (int i = 0; i < nrCities; i++) {
			cities[i] = i;
		}
		
		distances = new int[nrCities][nrCities];
		for (int i = 0; i < nrCities; i++) { 
			for (int j = 0; j < nrCities; j++) {
				if (j == i) {
					distances[i][j] = 0;
				} else {
					distances[i][j] = (int)(Math.random() * 1000.0);
				}
			}
		}
		
		System.out.println("Distances:");
		for (int i = 0; i < nrCities; i++) {
			System.out.println(Arrays.toString(distances[i]));
		}
		
		int minD = tsp(cities[0], removeAndCopy(cities, 0), cities[0]);
		System.out.println("Minimale Distanz: " + minD);
		
		input.close();
		
	}
	
	static int[] removeAndCopy(int[] cities, int indexToRemove) {
		int[] returnArray = new int[cities.length - 1];
		
		int c = 0;
		for (int i = 0; i < cities.length; i++) {
			if (i != indexToRemove) {
				returnArray[c] = cities[i];
				c++; // haha! 
			}
		}
		
		return returnArray;
	}
	
	static int tsp(int start, int[] cities, int end) {
		int distance = Integer.MAX_VALUE;
		
		System.out.println("Call: tsp(" + start + ", " + Arrays.toString(cities) + ")");
		
		if (cities.length == 0) {
			distance = distances[start][end];
		} else {
			
			int tmp;
			for (int i = 0; i < cities.length; i++) {
				tmp = tsp(cities[i], removeAndCopy(cities, i), end);
				tmp += distances[start][cities[i]];
				
				// Das ist die Auswahl des minimalen Weges! 
				if (tmp < distance) {
					distance = tmp;
				}
			}
			
		}
		
		return distance;
	}

}
