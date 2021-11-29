import java.util.*;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        double amount, dollar, pound, code, euro, yen, ringgit, lira;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Hi, Welcome to Currency Converter!");
        System.out.println("Which currency you want to convert");
        System.out.println("1: Lira\t2: Dollar\t3: Pound\t4: Euro\t5: Yen\t6: Ringgit");
        code = sc.nextInt();

        System.out.println("How much money you want to convert?");
        amount = sc.nextFloat();

        // For amounts Conversion
		if (code == 1) {

			dollar = amount /  12.75;
			System.out.println("Your " + amount + " lira is : " + f.format(dollar) + " Dollar");

			pound = amount / 16.98;
			System.out.println("Your " + amount + " lira is : " + f.format(pound) + " Pound");

			euro = amount / 14.37;
			System.out.println("Your " + amount + " lira is : " + f.format(euro) + " Euro");

			yen = amount / 0.11;
			System.out.println("Your " + amount + " lira is : " + f.format(yen) + " Yen");

			ringgit = amount / 3.01;
			System.out.println("Your " + amount + " lira is : " + f.format(ringgit) + " ringgit");
		} else if (code == 2) {
			// For Dollar Conversion

			lira = amount * 12.75;
			System.out.println("Your " + amount + " Dollar is : " + f.format(lira) + " Ruppes");

			pound = amount * 0.75;
			System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");

			euro = amount * 0.88;
			System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");

			yen = amount * 113;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");

			ringgit = amount * 4.23;
			System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
		} else if (code == 3) {
			// For Pound Conversion

			lira = amount * 17.01;
			System.out.println("Your " + amount + " pound is : " + f.format(lira) + " Ruppes");

			dollar = amount * 1.32;
			System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");

			euro = amount * 1.18;
			System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");

			yen = amount * 151;
			System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");

			ringgit = amount * 5.63;
			System.out.println("Your " + amount + " pound is : " + f.format(ringgit) + " ringgit");
		} else if (code == 4) {
			// For Euro Conversion

			lira = amount * 14.41;
			System.out.println("Your " + amount + " euro is : " + f.format(lira) + " Ruppes");

			dollar = amount * 1.12;
			System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");

			pound = amount * 0.84;
			System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");

			yen = amount * 128;
			System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");

			ringgit = amount * 4.77;
			System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " ringgit");
		} else if (code == 5) {

			// For Yen Conversion

			lira = amount * 0.11;
			System.out.println("Your " + amount + " yen is : " + f.format(lira) + " Ruppes");

			dollar = amount * 0.008;
			System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");

			pound = amount * 0.006;
			System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");

			euro = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");

			ringgit = amount * 0.037;
			System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " ringgit");
		} else if (code == 6) {
			// For Ringgit Conversion

			lira = amount * 3.01;
			System.out.println("Your " + amount + " ringgit is : " + f.format(lira) + " Ruppes");

			dollar = amount * 0.235;
			System.out.println("Your " + amount + " ringgit is : " + f.format(dollar) + " dollar");

			pound = amount * 0.177;
			System.out.println("Your " + amount + " ringgit is : " + f.format(pound) + " pound");

			euro = amount * 0.209;
			System.out.println("Your " + amount + " ringgit is : " + f.format(euro) + " euro");

			yen = amount * 26.83;
			System.out.println("Your " + amount + " ringgit is : " + f.format(yen) + " yen");
		} else {
			System.out.println("Invalid input");
		}
    }
}
