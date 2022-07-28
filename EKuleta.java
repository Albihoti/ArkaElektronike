import java.util.Scanner;

public class EKuleta {

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
        double cent1 = numriI1Centesheve * 0.01;
        double cent2 = numriI2Centesheve * 0.02;
        double cent5 = numriI1Centesheve * 0.05;
        double cent50= numriI50Centesheve * 0.50;
        double euro1 = numriI1Eurove * 1.00;
        double euro2 = numriI2Eurove * 2.00;
        double total = cent1 + cent2 + cent5 +cent50 +euro1 +euro2;
        System.out.println("------------------------------------------------");

        System.out.printf("1  centeshe:  %.0f  %.2f EUR \n",numriI1Centesheve, cent1);
        System.out.printf("2  centeshe:  %.0f  %.2f EUR\n",numriI2Centesheve, cent2);
        System.out.printf("5  centeshe:  %.0f  %.2f EUR\n",numriI1Centesheve, cent5);
        System.out.printf("50 centeshe:  %.0f  %.2f EUR\n", numriI50Centesheve, cent50);
        System.out.printf("1 euro     :  %.0f  %.2f EUR\n",numriI1Eurove, euro1);
        System.out.printf("2 euro     :  %.0f  %.2f EUR\n", numriI2Eurove, euro2);
        System.out.println("---------------------------------------------");
        System.out.printf("Total:              %.2f",total);



    }
}
