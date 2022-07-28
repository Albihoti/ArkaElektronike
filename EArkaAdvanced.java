import java.util.Scanner;

public class EArkaAdvanced {


        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.printf("Sa 1cent i keni: ");
            double numriI1Centesheve = reader.nextDouble();
            System.out.printf("Sa 2cent i keni: ");
            double numriI2Centesheve = reader.nextDouble();
            System.out.printf("Sa 5cent i keni: ");
            double numriI5Centesheve = reader.nextDouble();
            System.out.printf("Sa 50cent i keni: ");
            double numriI50Centesheve = reader.nextDouble();
            System.out.printf("Sa 1euro i keni: ");
            double numriI1Eurove = reader.nextDouble();
            System.out.printf("Sa 2euro i keni:");
            double numriI2Eurove =reader.nextDouble();
            System.out.printf("Sa 5euro i keni " );
            double numriI5Eurove = reader.nextDouble();
            System.out.printf("Sa 10euro i keni: ");
            double numriI10Eurove = reader.nextDouble();
            System.out.printf("Sa 20euro i keni: ");
            double numriI20Eurove = reader.nextDouble();
            System.out.printf("Sa 50euro i keni: ");
            double numriI50Eurove = reader.nextDouble();
            System.out.printf("Sa 100euro i keni: ");
            double numriI100Eurove = reader.nextDouble();
            System.out.printf("Sa 200euro i keni: ");
            double numriI200Eurove = reader.nextDouble();
            System.out.printf("Sa 500euro i keni: ");
            double numriI500Eurove = reader.nextDouble();



            double cent1 = numriI1Centesheve * 0.01;
            double cent2 = numriI2Centesheve * 0.02;
            double cent5 = numriI1Centesheve * 0.05;
            double cent50= numriI50Centesheve * 0.50;
            double euro1 = numriI1Eurove * 1.00;
            double euro2 = numriI2Eurove * 2.00;
            double euro5 = numriI5Eurove * 5.00;
            double euro10 = numriI10Eurove * 10.00;
            double euro20 = numriI20Eurove * 20.00;
            double euro50 = numriI50Eurove * 50.00;
            double euro100 = numriI100Eurove * 100.00;
            double euro200 = numriI200Eurove * 200.00;
            double euro500 = numriI500Eurove *500.00;

            double total = cent1 + cent2 + cent5 +cent50 +euro1 +euro2 +euro5 +euro10 +euro20 +euro50 +euro100 +euro200 +euro500;
            System.out.println("------------------------------------------------");

            System.out.printf("1  centeshe:  %.0f  %.2f   EUR \n",numriI1Centesheve, cent1);
            System.out.printf("2  centeshe:  %.0f  %.2f   EUR\n",numriI2Centesheve, cent2);
            System.out.printf("5  centeshe:  %.0f  %.2f   EUR\n",numriI1Centesheve, cent5);
            System.out.printf("50 centeshe:  %.0f  %.2f   EUR\n", numriI50Centesheve, cent50);
            System.out.printf("1  euro    :  %.0f  %.2f   EUR\n",numriI1Eurove, euro1);
            System.out.printf("2  euro    :  %.0f  %.2f   EUR\n", numriI2Eurove, euro2);
            System.out.printf("5  euro    :  %.0f  %.2f   EUR\n", numriI5Eurove, euro5);
            System.out.printf("10 euro    :  %.0f  %.2f  EUR\n", numriI10Eurove, euro10);
            System.out.printf("20 euro    :  %.0f  %.2f  EUR\n", numriI20Eurove, euro20);
            System.out.printf("50 euro    :  %.0f  %.2f  EUR\n", numriI50Eurove, euro50);
            System.out.printf("100 euro   :  %.0f  %.2f EUR\n", numriI100Eurove, euro100);
            System.out.printf("200 euro   :  %.0f  %.2f EUR\n", numriI200Eurove, euro200);
            System.out.printf("500 euro   :  %.0f  %.2f EUR\n", numriI500Eurove, euro500);

            System.out.println("---------------------------------------------");
            System.out.printf("Total:              %.2fEUR",total);



        }
    }



