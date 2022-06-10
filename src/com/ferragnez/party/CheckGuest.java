package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		 String NomeRichiedente;
		 
		//creazione array con partecipanti
		
		
		String[] listaInvitati = new String [11];
		
		listaInvitati[0] = ("Dua Lipa");
		listaInvitati[1] = ("Paris Hilton");
		listaInvitati[2] = ("Manuel Agnelli");
		listaInvitati[3] = ("J-Ax");
		listaInvitati[4] = ("Francesco Totti");
		listaInvitati[5] = ("Ilary Blasi");
		listaInvitati[6] = ("Bebe Vio");
		listaInvitati[7] = ("Luis");
		listaInvitati[8] = ("Pardis Zarei");
		listaInvitati[9] = ("Martina Maccherone");
		listaInvitati[10] = ("Rachel Zeilic");
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Come ti chiami ?");
		NomeRichiedente = scan.nextLine();
		
		boolean trovato = false;
		int i = 0 ;
		while(trovato == false && i < listaInvitati.length) {
		
			if(NomeRichiedente.equalsIgnoreCase(listaInvitati[i])) {
			
				trovato = true;
			}
			else {
				i++;
			}
		
		}
		if (trovato) {
		System.out.println("Perfetto puoi accedere alla festa");
		}
		else {
		System.out.println("Torna a casa Plebeo");
		}
	
	scan.close();
	}

}
