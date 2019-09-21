
import java.util.Scanner;
public class Main2 {
        public static Scanner sc = new Scanner(System.in);

        public static double sabiranje() {
            System.out.println("Unesite a: ");
            double a = sc.nextDouble();
            System.out.println("Unesite b: ");
            double b = sc.nextDouble();
            return a+b; //moze u i jednoj liniji :)
        }

        public static double oduzimanje() {
            System.out.println("Unesite a: ");
            double a = sc.nextDouble();
            System.out.println("Unesite b: ");
            double b = sc.nextDouble();
            return a-b;
        }

        public static double mnozenje() {
            System.out.println("Unesite a: ");
            double a = sc.nextDouble();
            System.out.println("Unesite b: ");
            double b = sc.nextDouble();
            return a*b;
        }

        public static double deljenje() {
            System.out.println("Unesite a: ");
            double a = sc.nextDouble();
            System.out.println("Unesite b: ");
            double b = sc.nextDouble();

            if(b==0) {
                System.out.println("Ne smemo deliti nulom!");
                return a;
            }

            return a/b;
        }

        public static double sumiranje(){
            System.out.println("Unesite n: ");
            int n = sc.nextInt();
            double suma = 0;

            for(int i = 0; i<=n; i++){
                suma = suma + i;
            }

            return suma;
        }


        public static int faktorijel() {
            System.out.println("Unesite n: ");
            int n = sc.nextInt();

            int rezultat = 1;
            for(int i=1; i<=n; i++)
                rezultat = rezultat * i;
            return rezultat;
        }

        public static int stepenovanje(){
            System.out.println("Unesite a: ");
            int a = sc.nextInt();
            System.out.println("Unesite b: ");
            int b = sc.nextInt();
            int proizvod = 1;
            for(int i = 0; i<=b-1; i++){
                proizvod *=a;
            }
            return proizvod;
        }

        public static double kolicnik(){
            System.out.println("Unesite n: ");
            int n = sc.nextInt();

            double rez = 0;
            double np = 0;
            double p = 0;

            for(int i=1; i<=2*n-1; i=i+2){
                np = np + i;
                p = p + i + 1;
                double kol = np/p;
                rez += kol;
            }

            return rez;
        }

        public static void stampaj_meni() {
            System.out.println("Operacije:\r\n" +
                    "\t Unesite 1 za izlaz iz programa\r\n" +
                    "\t Unesite 2 za operaciju sabiranja \n" +
                    "\t Unesite 3 za operaciju oduzimanja \n" +
                    "\t Unesite 4 za operaciju mnozenja \n" +
                    "\t Unesite 5 za operaciju deljenja \n" +
                    "\t Unesite 6 za operaciju sumiranja \n" +
                    "\t Unesite 7 za operaciju racunanja faktorijela \n" +
                    "\t Unesite 8 za operaciju stepenovanja \n" +
                    "\t Unesite 9 za operaciju kolicnika sume parnih i neparnih "
            );
            System.out.println("---------------------------------");
            System.out.print  ("Unesite operaciju koju zelite da izvrsite: ");
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Dobrodošli u 'konzolni kalkulator 9000'!");
            System.out.println("----------------------------------------");

            double rezultat = 0;
            int komanda = 0;

            do{
                stampaj_meni();
                komanda = sc.nextInt();

                switch(komanda) {
                    case  1: continue; //sa continue preskacem ono sto se nalazi ispod switcha i odmah idem na proveru uslova u while petlji
                    case  2: rezultat = sabiranje(); break;
                    case  3: rezultat = oduzimanje(); break;
                    case  4: rezultat = mnozenje(); break;
                    case  5: rezultat = deljenje(); break;
                    case  6: rezultat = sumiranje(); break;
                    case  7: rezultat = faktorijel(); break;
                    case  8: rezultat = stepenovanje(); break;
                    case  9: rezultat = kolicnik(); break;
                    default: System.out.println("Greška, nepostojeća operacija! Unesite ponovo! "); continue;
                }

                System.out.println("Rezultat operacije: " + rezultat);
            }while(komanda >= 2);
            System.out.println("Kraj programa!");
        }
}

