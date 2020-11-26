import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double ce = Double.parseDouble(scanner.nextLine());
        int brp = Integer.parseInt(scanner.nextLine());
        int brkuk = Integer.parseInt(scanner.nextLine());
        int brmec = Integer.parseInt(scanner.nextLine());
        int brmin = Integer.parseInt(scanner.nextLine());
        int brkam = Integer.parseInt(scanner.nextLine());
        Double op = brp * 2.60;
        int okuk = brkuk * 3;
        Double omec = brmec * 4.10;
        Double omin = brmin * 8.20;
        int okam = brkam * 2;
        Double ocena = op + okuk + omec + omin + okam;
        if (brp + brkuk + brmec + brmin + brkam >= 50) {
            Double f = ocena - (0.25 * ocena);
            Double all = f - (f * 0.1);
            Double result = all - ce;
            Double result1 = ce - all;
            if (all >= ce) {
                System.out.printf("Yes! %.2f lv left.", result);
            } else{
                System.out.printf("Not enough money! %.2f lv needed.", result1);
            }
        } else {
            Double newall = ocena - (ocena * 0.1);
            Double result = newall - ce;
            Double result1 = ce - newall;
            if (newall >= ce) {
                System.out.printf("Yes! %.2f lv left.", result);
            } else{
                System.out.printf("Not enough money! %.2f lv needed.", result1);
            }
        }
    }
}