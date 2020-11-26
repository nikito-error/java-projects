import java.util.Scanner;

public class DanceHallinM {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double l = Double.parseDouble(scanner.nextLine());
            double w = Double.parseDouble(scanner.nextLine());
            double a = Double.parseDouble(scanner.nextLine());
            double gz = (l)*(w);
            double gg = (a)*(a);
            double gp = gz *0.1;
            double sp = gz - gg - gp;
            double bt =0.7040;
            double count=Math.floor(sp/bt);
            System.out.printf("%.0f",count);
        }
    }

