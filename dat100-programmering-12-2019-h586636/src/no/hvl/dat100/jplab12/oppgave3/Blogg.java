package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private int nesteledig;
	private Innlegg[] innleggtabell;
	
	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		
		int a = -1;
		
		for (int i = 0; 1 <= nesteledig; i++) {
			if (innlegg.erLik(innleggtabell[i]) == true) {
				a = i;
			}
		}
		return a;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for (int i = 0; i <= nesteledig; i++) {
			if (innlegg.erLik(innleggtabell[i]) == true) {
				finnes = true;
			}
		}
		return finnes;
	}

	public boolean ledigPlass() {
		boolean ledig = false;
		if (nesteledig < innleggtabell.length) {
			ledig = true;
		}
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagttil;
		if (!ledigPlass()) {
			lagttil = false;
		} else {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagttil = true;
		}
		return lagttil;
	}
	
	public String toString() {
	String a = nesteledig + "\n";
	for (int i = 0; i < nesteledig; i++) {
		a += innleggtabell[i].toString();
	}
	return a;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}