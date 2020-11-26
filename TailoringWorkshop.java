import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brm = Integer.parseInt(scanner.nextLine());
        double duljinam = Double.parseDouble(scanner.nextLine());
        double shirinam = Double.parseDouble(scanner.nextLine());
        double strkare = duljinam / 2;
        double kvm = brm * (duljinam + 2 * 0.30) * (shirinam + 2 * 0.30);
        double opk = brm * (strkare) * (strkare);
        double cusd = kvm * 7 + opk * 9;
        double usdtobgn = cusd * 1.85;
        System.out.printf("%.2f USD%n", cusd);
        System.out.printf("%.2f BGN", usdtobgn);

    }
}
