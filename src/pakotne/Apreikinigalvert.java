package pakotne;

import java.text.DecimalFormat;

public class Apreikinigalvert {
	static double[] apreikini(String[] studenti, String[] kriteriji, int[] kriterijaSvars, int[][] kriterijaVertejums){
		// Gala vērtējuma aprēķināšana
		DecimalFormat df = new DecimalFormat("0.#");
			double[] semestraVertejums = new double[studenti.length];
				double rezultats;
				for(int i=0; i<studenti.length; i++) {
					rezultats=0;
					for(int j=0; j<kriteriji.length; j++) {
						rezultats += ((double) kriterijaSvars[j]/100)*kriterijaVertejums[i][j];
					}
					semestraVertejums[i] = rezultats;
				}
				
				// Gala vērtējumu izvadīšana
				for(int i=0; i<studenti.length; i++) {	
					for(int j=0; j<kriteriji.length; j++) {
						System.out.println("Studenta "+studenti[i]+" vērtējums par kritēriju "+kriteriji[j]+" ir "+kriterijaVertejums[i][j]+", kura svars ir "+kriterijaSvars[j]);
					}
					System.out.println("Semestra vērtējums ir "+df.format(semestraVertejums[i])+" balles"
							+ "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
				}
				
		return semestraVertejums;	
	}
	
}
