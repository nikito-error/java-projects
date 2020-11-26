import java.util.Scanner;

public class BehieveRole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intelekt = Integer.parseInt(scanner.nextLine());
        int sila = Integer.parseInt(scanner.nextLine());
        String pol = scanner.nextLine();
        if (intelekt >= 80 && sila >= 80 && pol.equals("female")) {
            System.out.println("Queen Bee");
        } else if (intelekt >= 80) {
            System.out.println("Repairing Bee");
        } else if (intelekt >= 60) {
            System.out.println("Cleaning Bee");
        }else if( sila>=80 && pol.equals("male")){
            System.out.println("Drone Bee");
        }else if( sila>=60){
            System.out.println("Guard Bee");
        }else {
            System.out.println("Worker Bee");
        }
    }
}
