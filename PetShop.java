import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brk =Integer.parseInt(scanner.nextLine());
       double brksum = brk*2.50;
       int brks = Integer.parseInt(scanner.nextLine());
       double brkssum=brks*4.00;
       double area =brksum+brkssum;
       System.out.printf("%.2f lv. ",area);
    }
}
