package monete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Salvadanaio salvadanaio = new Salvadanaio();

	        while (true) {
	            System.out.println("*** MENU ***");
	            System.out.println("1 - Aggiungere monete");
	            System.out.println("2 - Sottrarre monete");
	            System.out.println("3 - Cercare una moneta");
	            System.out.println("4 - Stampare il totale borsa");
	            System.out.println("5 - Esci");
	            System.out.print("Scelta: ");
	            int scelta = scanner.nextInt();

	            switch (scelta) {
	                case 1:
	                    // Aggiungere monete
	                    System.out.print("Inserisci il nome della moneta: ");
	                    scanner.nextLine(); // Consuma il carattere di nuova riga residuo
	                    String nomeMoneta = scanner.nextLine();
	                    System.out.print("Inserisci il valore della moneta: ");
	                    double valoreMoneta = scanner.nextDouble();
	                    Moneta moneta = new Moneta(nomeMoneta, valoreMoneta);
	                    salvadanaio.addMoneta(moneta);
	                    System.out.println("Moneta aggiunta al salvadanaio.");
	                    break;
	                case 2:
	                    // Sottrarre monete
	                    System.out.print("Inserisci il valore della moneta da sottrarre: ");
	                    double valoreSottrazione = scanner.nextDouble();
	                    Moneta monetaDaSottrarre = new Moneta("", valoreSottrazione);
	                    boolean successoSottrazione = salvadanaio.remove(monetaDaSottrarre);
	                    if (successoSottrazione) {
	                        System.out.println("Moneta rimossa dal salvadanaio.");
	                    } else {
	                        System.out.println("Moneta non trovata nel salvadanaio.");
	                    }
	                    break;
	                case 3:
	                    // Cercare una moneta
	                    System.out.print("Inserisci il valore della moneta da cercare: ");
	                    double valoreRicerca = scanner.nextDouble();
	                    Moneta monetaDaCercare = new Moneta("", valoreRicerca);
	                    int indiceMoneta = salvadanaio.findMoneta(monetaDaCercare);
	                    if (indiceMoneta != -1) {
	                        System.out.println("La moneta è presente nel salvadanaio all'indice " + indiceMoneta + ".");
	                    } else {
	                        System.out.println("La moneta non è presente nel salvadanaio.");
	                    }
	                    break;
	                case 4:
	                    // Stampare il totale borsa
	                    System.out.println("Totale monete nel salvadanaio: " + salvadanaio.getTotal());
	                    break;
	                case 5:
	                    // Esci
	                    System.out.println("Uscita dal programma.");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Scelta non valida. Riprova.");
	            }
	        }
		
	}
}
