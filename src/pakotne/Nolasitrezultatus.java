package pakotne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Nolasitrezultatus {
	static void lasit() {
		String rinda;
		String galastring = "";
		String [] Nolasitskolenuatz = null;
		 try {
	            BufferedReader lasa = new BufferedReader(new FileReader("studentarezultati.txt"));
	            rinda = lasa.readLine();
	           
	            while(rinda != null){
	            	rinda = lasa.readLine();
	            	
	            	galastring += rinda;
	            }
	            galastring = galastring.replace("null", "");
	            Nolasitskolenuatz = galastring.split(",");
	            System.out.println("-=Skolenu Atzimes=-\n");
	            
	            for(int i = 0; i < Nolasitskolenuatz.length; i++) {
	            		System.out.print(Nolasitskolenuatz[i]+" ");

	            }
	            System.out.println();
	            lasa.close();
	        } catch (IOException e) {
	            System.out.println("Problamas ar datni!");
	        }
	}
}