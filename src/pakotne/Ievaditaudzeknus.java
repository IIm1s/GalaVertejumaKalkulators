package pakotne;

import java.util.Scanner;

public class Ievaditaudzeknus {
	static String[] skaits(String[]studenti){
	int studSk;
	Scanner scan = new Scanner(System.in);
	do {
		System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
		while(!scan.hasNextInt()) {
			System.out.println("Cik studentiem aprēķināsi gala vērtējumu?");
			scan.next();
		}
		studSk = scan.nextInt();
	}while(studSk<1);
	
	studenti = new String[studSk];
	
	// Ievada audzēkņu vārdus, uzvārdus
	for(int i=0; i<studenti.length; i++) {
		do {
			System.out.println("Ievadi "+(i+1)+". studentu");
			studenti[i] = scan.nextLine().trim();
		} while(!studenti[i].matches("^[\\p{L} ]+$"));
	}
	scan.close();;
	
	return studenti;
	}
	
}
