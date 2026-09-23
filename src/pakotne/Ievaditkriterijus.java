package pakotne;

import java.util.Scanner;

public class Ievaditkriterijus {
	static String[] kriterijas(String[]kriteriji){
		Scanner scan = new Scanner(System.in);
		int kritSk;
		do {
			System.out.println("Kāds būs kritēriju skaits?");
			while(!scan.hasNextInt()) {
				System.out.println("Kāds būs kritēriju skaits?");
				scan.next();
			}
			kritSk = scan.nextInt();
		}while(kritSk<1);
		
	
		kriteriji = new String[kritSk];
		
		for(int i=0; i<kriteriji.length; i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". kritēriju");
				kriteriji[i] = scan.nextLine().trim();
			} while(!kriteriji[i].matches("^[\\p{L} ]+$"));
		}
		
			
		scan.close();
		return kriteriji;
		}
	}
