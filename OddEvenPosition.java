import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0.0;
        double sum1 = 0.0;
        double min = Integer.MAX_VALUE;
        double min1 = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double max1 = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            double number =Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                sum = sum + number;
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                sum1 = sum1 + number;
                if (number < min1) {
                    min1 = number;
                }
                if (number > max1) {
                    max1 = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n",sum1);
        if (sum1 == 0) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n",min1);
            System.out.printf("OddMax=%.2f,%n",max1);
        }
        System.out.printf("EvenSum=%.2f,%n",sum);
        if (sum == 0) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,%n",min);
            System.out.printf("EvenMax=%.2f%n",max);
        }
    }
}
