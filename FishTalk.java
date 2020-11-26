import java.util.Scanner;

public class FishTalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = Integer.parseInt(scanner.nextLine());
        int sh = Integer.parseInt(scanner.nextLine());
        int v = Integer.parseInt(scanner.nextLine());
        double proc = Double.parseDouble(scanner.nextLine());
        int obem=d*sh*v;
        double litri=obem*0.001;
        double procs=proc*0.01;
        double krl=litri*(1-procs);
        System.out.printf("%.3f",krl);
    }
}
