import java.util.Scanner;

public class VacationMyCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        double nmoney = Double.parseDouble(scanner.nextLine());
       int br = 0;
        int counter=0;
        while (money > nmoney) {
            br++;
            String text = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            if (text.equals("spend")) {
                nmoney = nmoney - sum;
                if(nmoney<0){
                    nmoney=0;
                }
                counter++;
            }
            else if (text.equals("save")) {
                nmoney = nmoney + sum;
                counter=0;
            }
            if (money <= nmoney) {
                System.out.printf("You saved the money for %d days.", br);
            }
            if (counter== 5) {
                System.out.printf("You can't save the money.%n%d", br);
                break;
            }
        }
    }
}