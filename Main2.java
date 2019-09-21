import java.util.Scanner;

public class Main2 {

    static void ispisiMeni(){
        System.out.println("Meni:");
        System.out.println("\t 1. Dodaj artikal na racun");
        System.out.println("\t 2. Storniraj racun");
        System.out.println("\t 3. Naplati");
        System.out.println("\t 4. Vrati kusur");
        System.out.println("\t 5. Zavris rad programa");
        System.out.println("Koju opciju zelite?");
    }

    public static void main(String args[]){
        int unos;
        int racun = 0;
        int gotovina = 0;
        Scanner sc = new Scanner(System.in);
        do{
            ispisiMeni();
            unos = sc.nextInt();
            switch (unos){
                case 1: racun = dodajNaRacun(racun); break;
                case 2: racun = storniraj(racun); break;
                case 3: gotovina = naplati(racun); break;
                case 4: int kusur = gotovina - racun; vratiKusur(kusur);
                case 5: System.out.println("Kraj rada!");break;
                default: System.out.println("Nepostojeca opcija. Unesite ponovo");break
            }

        }while(unos!=5);

    }

    static int dodajNaRacun(int racun){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cenu artikla:");
        int cena = sc.nextInt();
        System.out.println("Unesite kolicinu:");
        int kolicina = sc.nextInt();
        racun += kolicina * cena;
        return racun;
    }
    static int storniraj(int racun){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite za koliko novca zelite da smanjite racun");
        int novac = sc.nextInt();
        racun = racun - novac;
        return racun;
    }

    static int naplati(int racun){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vas racun je " + racun);
        System.out.println("Dajte novac: ");
        int novac =sc.nextInt();
        while(racun > novac){
            System.out.println("Niste dali dovoljno novca. Dajte ponovo!");
            novac = sc.nextInt();
        }

        return novac;
    }

    static void vratiKusur(int kusur){

        int b20=0, b10 = 0, b5 = 0, b2 =0, b1 = 0;
        while(kusur>0){
            if(kusur>=20){
                b20++;
                kusur -=20;
                continue;
            }
            if(kusur>=10){
                b10++;
                kusur -=10;
                continue;
            }
            if(kusur>=5){
                b5++;
                kusur -=5;
                continue;
            }
            if(kusur>=2){
                b2++;
                kusur -=2;
                continue;
            }
            if(kusur>=1){
                b1++;
                kusur -=1;
                continue;
            }

        }

        System.out.println("Vrcam " + b20 +" kovanica od 20 dinara");
        System.out.println("Vrcam " + b10 +" kovanica od 10 dinara");
        System.out.println("Vrcam " + b5 +" kovanica od 5 dinara");
        System.out.println("Vrcam " + b2 +" kovanica od 2 dinara");
        System.out.println("Vrcam " + b1 +" kovanica od 1 dinara");

    }
}
