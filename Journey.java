import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet= Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        double total;
        if(budjet<=100){
            if(season.equals("summer")){
                total=budjet*0.30;
                System.out.printf("Somewhere in Bulgaria%nCamp - %.2f",total);
            }else
            {
                total=budjet*0.70;
                System.out.printf("Somewhere in Bulgaria%nHotel - %.2f",total);
            }
        }
        else if(budjet>100 && budjet<=1000){
            if(season.equals("summer")){
                total=budjet*0.40;
                System.out.printf("Somewhere in Balkans%nCamp - %.2f",total);
            }else {
                total=budjet*0.80;
                System.out.printf("Somewhere in Balkans%nHotel - %.2f",total);
            }
        }
        else {
            total=budjet*0.90;
            System.out.printf("Somewhere in Europe%nHotel - %.2f",total);
        }
    }
}
