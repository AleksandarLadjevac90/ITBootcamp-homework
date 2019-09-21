package paket;

import java.util.Scanner;

public class testJedan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String dan;
		boolean greska;
		
		System.out.println("===================================");
		System.out.println("Dobrodošli u Braško++ pametnu kasu!");
		System.out.println("-----------------------------------\n");
		System.out.println("Odaberite danasnji dan u nedelji (Pon/Uto/Sre/Cet/Pet/Sub/Ned): ");
		
		do {
			
			greska = false;
			dan = scan.next();
			
			switch (dan) {
			case "Pon": 
				break;
			case "Uto":
				break;
			case "Sre": 
				break;
			case "Cet":
				break;
			case "Pet": 
				break;
			case "Sub":
				break;
			case "Ned":
				break;
			default:
				greska = true;
				System.out.println("Greska u unosu. Pokusajte ponovo:");
				System.out.println("Odaberite danasnji dan u nedelji (Pon/Uto/Sre/Cet/Pet/Sub/Ned): ");
			}	
		}	while (greska);
		
		
		greska = false;
		String[] a = new String[30];
		int counter = 1;
		String s;
		
		System.out.println("===============");
		System.out.println("-UNOS PODATAKA-");
		System.out.println("===============");
		
		s = scan.nextLine();
		
		while (!greska) {
			
			System.out.print("Mušterija id#" + counter + ": ");
			s = scan.nextLine();
			
			if (s.equals("-1")) {
				greska = true;
			}
			
			a[counter - 1] = s;
			counter++;
			System.out.println("");
		};
		
		int GlobalnaPizza = 0;
		
		
		for (int k = 0; k < counter - 2; k++) {
			
				int[] temp = new int[30];
				int c = 0;
				Scanner sc = new Scanner(a[k]);
				while (sc.hasNext()) {
					temp[c] = sc.nextInt();
					c++;
				}
				
				System.out.println("============================");
				System.out.println("Racun za musteriju id#" + (k + 1));
				System.out.println("----------------------------");
				String plus = "";
				float Vesuvio = 310;
				float Capricciosa = 320;
				float Pepperoni = 290;
				float popustV = 0;
				float popustC = 0;
				float popustP = 0;
				int V = 0;
				int C = 0;
				int P = 0;
				float RACUN = 0;
				
				for (int i = 1; i < c; i++) {
					
					GlobalnaPizza++;
					
					if (i%4 == 0) {
						plus = "AKCIJA 3+1 ";
						Vesuvio = 0;
						Capricciosa = 0;
						Pepperoni = 0;
					}
					
					if (temp[i] == 2) {
						if ((GlobalnaPizza%7 == 0) && ((GlobalnaPizza != 1) && (GlobalnaPizza != 0))) {
							System.out.println("AKCIJA #7 Capricciosa -- 0");
						} else {
							System.out.println(plus + "Pizza Capricciosa -- " + Math.round(Capricciosa));
							RACUN += Capricciosa;
						}
						C++;
					} else if (temp[i] == 3) {
						if ((GlobalnaPizza%7 == 0) && ((GlobalnaPizza != 1) && (GlobalnaPizza != 0))) {
							System.out.println("AKCIJA #7 Pepperoni -- 0");
						} else {
							System.out.println(plus + "Pizza Pepperoni -- " + Math.round(Pepperoni));
							RACUN += Pepperoni;
						}
						P++;
					} else if (temp[i] == 5) {
						if ((GlobalnaPizza%7 == 0) && ((GlobalnaPizza != 1) && (GlobalnaPizza != 0))) {
							System.out.println("AKCIJA #7 Vesuvio -- 0");
						} else {
							System.out.println(plus + "Pizza Vesuvio -- " + Math.round(Vesuvio));
							RACUN += Vesuvio;
						}
						V++;
					}
					
					Vesuvio = 310;
					Capricciosa = 320;
					Pepperoni = 290;
					plus = "";
				}
				
				System.out.println("             Ukupno: " + Math.round(RACUN));
				
				if (dan.equals("Uto") && (V > 0)) {
					popustV = Vesuvio/10;
					RACUN -= popustV*V;
					System.out.println("DNEVNA 10% Vesuvio: -" + Math.round(popustV*V));
					System.out.println("             Ukupno: " + Math.round(RACUN));
				}
				
				if (dan.equals("Cet") && (C > 0)) {
					popustC = Capricciosa/10;
					RACUN -= popustC*C; 
					System.out.println("DNEVNA 10% Capricciosa: -" + Math.round(popustC*C));
					System.out.println("             Ukupno: " + Math.round(RACUN));
				}
				
				if (dan.equals("Ned") || dan.equals("Sub")) {
					popustC = (Capricciosa/100)*15;
					popustV = (Vesuvio/100)*15;
					popustP = (Pepperoni/100)*15;
					float ukupanDnevniPopust = popustC*C + popustV*V + popustP*P;
					System.out.println("DNEVNA 15% SVE:  -" + Math.round(ukupanDnevniPopust));
					RACUN -= ukupanDnevniPopust;
					System.out.println("             Ukupno: " + Math.round(RACUN));
				}
				
				System.out.println("");
				
		}

		System.out.println("============================");
		System.out.println("----------THE END-----------");
		System.out.println("============================");
		
	}
}