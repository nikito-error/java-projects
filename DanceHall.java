import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double a = Double.parseDouble(scanner.nextLine());
        double gz = (l*100)*(w*100);
        double gg = (a*100)*(a*100);
        double gp = gz *0.1;
        double sp = gz - gg - gp;
        double bt =7040;
        double count=Math.floor(sp/bt);
        System.out.printf("%.0f",count);
    }
}
