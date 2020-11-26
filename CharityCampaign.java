import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brdni = Integer.parseInt(scanner.nextLine());
        int brsladkari = Integer.parseInt(scanner.nextLine());
        int brtorti = Integer.parseInt(scanner.nextLine());
        int brgofreti = Integer.parseInt(scanner.nextLine());
        int brpalachinki = Integer.parseInt(scanner.nextLine());
        int cenitorta = 45;
        double cenigofreti = 5.80;
        double cenipalachinki = 3.20;
        int cenitorti = brtorti * cenitorta;
        double cenigofretki = brgofreti * cenigofreti;
        double cenipalachinkii = brpalachinki * cenipalachinki;
        double osumaden = (cenitorti + cenigofretki + cenipalachinkii) * brsladkari;
        double sum = osumaden * brdni;
        double sumr = sum - sum/8;
        System.out.printf("%.2f", sumr);


    }
}
