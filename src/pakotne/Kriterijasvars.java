package pakotne;

import java.util.Scanner;

public class Kriterijasvars {
	static int[] svars(String[]kriteriji, int[]kriterijaSvars){
		Scanner scan = new Scanner(System.in);
		
		int maxSvars = 100, sk = 1;
		double atlSvars, procenti = 0.0;
		kriterijaSvars = new int[kriteriji.length];
		
		do {
		for(int i=0; i<kriteriji.length; i++) {
		do {
			System.out.println("Ievadi "+(i+1)+". kritērija svaru (max: "+maxSvars+")");
			while(!scan.hasNextInt()) {
				System.out.println("Ievadi "+(i+1)+". kritērija svaru");
				scan.next();
			}
			kriterijaSvars[i] = scan.nextInt();
			procenti += kriterijaSvars[i];
			/* Minimālā KATRA ATLIKUŠĀ kritērija svars ir 5
			 * kopējai svaru vērtībai ir jābūt 100 (ne mazāk, ne vairāk)
			*/
			atlSvars = (maxSvars - kriterijaSvars[i]) / (double)(kriteriji.length - sk);
		} while(kriterijaSvars[i]>maxSvars || kriterijaSvars[i]<5 || 
			  (i != kriteriji.length-1 && kriterijaSvars[i] == maxSvars) ||
			  (i == kriteriji.length-1 && (maxSvars - kriterijaSvars[i])  > 0) 
			  || atlSvars < 5);
		maxSvars -= kriterijaSvars[i];
		sk++;
		scan.nextLine();
	}
		if(procenti > 100.0) {
			System.out.println("Procenti: " + procenti + "%");
			System.out.println("Procentu kopums nav 100!");
		procenti = 0;
		}
		}while(procenti != 100.0);
		
		scan.close();
		
		return kriterijaSvars;
	}
}