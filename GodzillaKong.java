import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budjet=Double.parseDouble(scanner.nextLine());
        int brst=Integer.parseInt(scanner.nextLine());
        double cena=Double.parseDouble(scanner.nextLine());
        double filmd=budjet*0.1;
        if(brst>=150){
            double cenasotstp=cena-(cena*0.1);
            double p = brst*cenasotstp;
            double result=filmd+p;
            if(budjet>=result){
                double resultmoney=budjet-result;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.",resultmoney);
            }else{ double resultmoney=result-budjet;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.",resultmoney);
            }
        }
        else {
            double p=brst*cena;
            double result=filmd+p;
            if(budjet>=result){
                double resultmoney=budjet-result;
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.",resultmoney);
            }else{ double resultmoney=result-budjet;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.",resultmoney);
            }
        }
    }
}
