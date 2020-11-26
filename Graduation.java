import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double sum = 0.0;
        for (int i = 1; i <= 12; i++) {
            double value = Double.parseDouble(scanner.nextLine());

            while (value < 4){
                value=Double.parseDouble(scanner.nextLine());
            }
            sum+=value;
        }
        System.out.printf("%s graduated. Average grade: %.2f",name,sum/12);
    }
}


