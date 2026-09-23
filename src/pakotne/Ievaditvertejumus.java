package pakotne;

import java.util.Scanner;

public class Ievaditvertejumus {
	static int[][] vertejumi(String[] studenti, String[] kriteriji){
		Scanner scan = new Scanner(System.in);
		
		int[][] kriterijaVertejums = new int[studenti.length][kriteriji.length];
		for(int i=0; i<kriterijaVertejums.length; i++) {
			for(int j=0; j<kriterijaVertejums[i].length; j++) {
				do {
					System.out.println("Ievadi "+studenti[i]+" vērtējumu par kritēriju "+kriteriji[j]);
					while(!scan.hasNextInt()) {
						System.out.println("Ievadi "+studenti[i]+" vērtējumu par kritēriju "+kriteriji[j]);
						scan.next();
					}
					kriterijaVertejums[i][j] = scan.nextInt();
				}while(kriterijaVertejums[i][j]<0 || kriterijaVertejums[i][j]>10);
			}
		}
		scan.close();
		return kriterijaVertejums;
	}
}
