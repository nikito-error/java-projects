import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cenauiski = Double.parseDouble(scanner.nextLine());
        double kbl = Double.parseDouble(scanner.nextLine());
        double kvl = Double.parseDouble(scanner.nextLine());
        double krl = Double.parseDouble(scanner.nextLine());
        double kul = Double.parseDouble(scanner.nextLine());
        double cenarakiq = cenauiski / 2;
        double cenavino = cenarakiq - (cenarakiq * 0.4);
        double cenabira = cenarakiq - (cenarakiq * 0.8);
        double sumrakiq = krl * cenarakiq;
        double sumvino = kvl * cenavino;
        double sumbira = kbl * cenabira;
        double sumuiski = kul * cenauiski;
        double totalsum = sumrakiq + sumvino + sumbira + sumuiski;
        System.out.printf("%.2f", totalsum);
    }
}
