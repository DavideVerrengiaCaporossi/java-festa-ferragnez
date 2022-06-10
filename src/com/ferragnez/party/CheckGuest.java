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
		
		//apertura scanner
		Scanner scan = new Scanner(System.in) ;
		//richiesta all'utente
		System.out.println("Come ti chiami ?");
		//ricezione richiesta
		NomeRichiedente = scan.nextLine();
		//flag per uscire dal while
		boolean trovato = false;
		//contenitore per collegare ogni indice della lista e farlo aumentare
		int i = 0 ;
		//while per far ripere il codice fino a che non si esce dalla condizione che abbiamo creato 
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
	//chiusura scanner
	scan.close();
	}

}
