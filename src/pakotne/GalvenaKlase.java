package pakotne;

import java.util.Scanner;


public class GalvenaKlase {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

			char izvele;
			String[] studenti = null;
			String[] kriteriji = null;
			int[] kriterijaSvars = null;
			int[][] kriterijaVertejums = null;
			double[] semestraVertejums = null;


			do {
				System.out.println("\nizvēles darbibu:\n"
						+ "1.-Ievadīt audzēkņus\n"
						+ "2. -Ievadīt kritērijus\n"
						+ "3. -Ievadīt kritēriju svarus\n"
						+ "4. -Ievadīt vērtējumus\n"
						+ "5. -Labot kritēriju\n"
						+ "6. -Labot kritērija svaru\n"
						+ "7. -Labot iegūto vērtējumu\n"
						+ "8. -Aprēķināt gala vērtējumu\n"
						+ "9. -Saglabāt rezultātus failā\n"
						+ "n.-Nolasīt rezultātus no faila\n"
						+ "0 -stop");
				izvele = scan.next().charAt(0);
				izvele = Character.toLowerCase(izvele);
				switch(izvele) {
				
				case '1':
					
					Ievaditaudzeknus.skaits(studenti);
					
					break;
				case '2':
					
					Ievaditkriterijus.kriterijas(kriteriji);
					
					break;
				case '3':
					
					Kriterijasvars.svars(kriteriji,kriterijaSvars);
					
					break;
				case '4':
					
					Ievaditvertejumus.vertejumi(studenti,kriteriji,kriterijaVertejums);
					
					break;
				case '5':
					
					break;
				case '6':
					
					break;
				case '7':
					
					
					
					break;
				case '8':
					
					Apreikinigalvert.apreikini(studenti,kriteriji,kriterijaSvars,kriterijaVertejums,semestraVertejums);
					
					break;
				case '9':
					
					break;
				case 'n':
					
					break;
				case '0':
					System.out.println("Programma apturēta!");
					break;
					default:
					System.out.println("Drabība nepastāv!");
				}
			
				
			}while(izvele != '0');
			scan.close();
	}
}