import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budjet = Integer.parseInt(scanner.nextLine());
        String sezon = scanner.nextLine();
        int br = Integer.parseInt(scanner.nextLine());
        double naem = 0;
        if ("Spring".equals(sezon)) {
            naem = 3000;
        } else if ("Summer".equals(sezon) || "Autumn".equals(sezon)) {
            naem = 4200;
        } else {
            naem = 2600;
        }
        if (br <= 6) {
            naem = naem - naem * 0.10;
        } else if (br > 6 && br <= 11) {
            naem = naem - naem * 0.15;
        } else {
            naem = naem - naem * 0.25;
        }
        if (br % 2 == 0 && !"Autumn".equals(sezon))
            {
                naem = naem - naem * 0.05;
            }
            if (budjet >= naem) {
                double f = budjet - naem;
                System.out.printf("Yes! You have %.2f leva left.", f);
            } else {
                double f = naem - budjet;
                System.out.printf("Not enough money! You need %.2f leva.", f);
            }

    }
}
