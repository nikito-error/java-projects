import java.util.Scanner;

public class InchestoCantimeters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double cm = Double.parseDouble(scanner.nextLine());
        double inches=2.54;
        double area = cm*inches;
        System.out.println(area);
    }
}
