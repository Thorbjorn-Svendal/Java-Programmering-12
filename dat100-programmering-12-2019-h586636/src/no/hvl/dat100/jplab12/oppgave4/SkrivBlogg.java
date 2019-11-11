package no.hvl.dat100.jplab12.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab12.oppgave3.*;
import no.hvl.dat100.jplab12.common.TODO;

public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab12/tests/";

	public static boolean skriv(Blogg samling, String filnavn) {
		boolean skrevet = true;
		// 1) Åpner filen for skriving
		
		PrintWriter skriver;
		try {
			skriver = new PrintWriter(MAPPE + filnavn);
			
			// 2) Skriv til fil
			
			skriver.println(samling.toString());
			
			// 3) Lukker filen
			skriver.close(); 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			skrevet = false;
		}
		
		return skrevet;
	}
	
		
}
