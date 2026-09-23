package pakotne;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Saglabatrezultatus {
	static void saglabat(String[] studenti, String[] kriteriji) {
		try {
			BufferedWriter raksta = new BufferedWriter(new FileWriter("studentarezultati.txt"));
			int i;
			for(i = 0; i<studenti.length; i++) {
            
		   		raksta.write("\n"+studenti[i]+","+kriteriji[i]+",\n");

			}
			raksta.close();
		        } catch (IOException e) {
		            System.out.println("Problamas ar datni!");
		        }
	}
}