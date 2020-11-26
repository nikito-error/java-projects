import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kvm =Double.parseDouble(scanner.nextLine());
        double cd=kvm*7.61;
        double discount=0.18*cd;
        double fp=cd-discount;
        System.out.printf("The final price is: %.2f lv.",fp);
        System.out.printf("\nThe discount is: %.2f lv.",discount);
    }
}
