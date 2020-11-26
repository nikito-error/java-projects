import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double number = Double.parseDouble(scanner.nextLine());
        if (number >= 0 && number <= 500) {
            switch (city) {
                case "Sofia": {
                    double p = number * 0.05;
                    System.out.printf("%.2f", p);
                    break;
                }
                case "Varna": {
                    double p = number * 0.045;
                    System.out.printf("%.2f", p);
                    break;
                }
                case "Plovdiv": {
                    double p = number * 0.055;
                    System.out.printf("%.2f", p);
                    break;
                }
                default:
                    System.out.println("error");
                    break;
            }
        } else if (number > 500 && number <= 1000) {
            switch (city) {
                case "Sofia": {
                    double p = number * 0.07;
                    System.out.printf("%.2f", p);
                    break;
                }
                case "Varna": {
                    double p = number * 0.075;
                    System.out.printf("%.2f", p);
                    break;
                }
                case "Plovdiv": {
                    double p = number * 0.08;
                    System.out.printf("%.2f", p);
                    break;
                }
                default:
                    System.out.println("error");
                    break;
            }
        } else if (number > 1000 && number <= 10000) {
            switch (city) {
                case "Sofia": {
                    double p = number * 0.08;
                    System.out.printf("%.2f", p);
                    break;
                }
                case "Varna": {
                    double p = number * 0.10;
                    System.out.printf("%.2f", p);
                    break;
                }
                case "Plovdiv": {
                    double p = number * 0.12;
                    System.out.printf("%.2f", p);
                    break;
                }
                default:
                    System.out.println("error");
                    break;
            }
        } else if (number > 10000) {
            switch (city) {
                case "Sofia": {
                    double p = number * 0.12;
                    System.out.printf("%.2f", p);
                    break;
                }
                case "Varna": {
                    double p = number * 0.13;
                    System.out.printf("%.2f", p);
                    break;
                }
                case "Plovdiv": {
                    double p = number * 0.145;
                    System.out.printf("%.2f", p);
                    break;
                }
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}
