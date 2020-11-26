import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month=scanner.nextLine();
        int br=Integer.parseInt(scanner.nextLine());
        double studio=0.0;
        double apartment=0.0;
        double total1=0.0;
        double total2=0.0;
        double total=0.0;
        switch(month){
            case "May":
            case "October":
                studio=50;
                apartment=65;
                if(br>7 && br<=14){
                total1=studio*br;
                total2=apartment*br;
                total=total1-total1*0.05;
                }
                else if(br>14){
                    total1=studio*br;
                    double total3=apartment*br;
                    total2=total3-total3*0.10;
                    total=total1-total1*0.30;

                }else {
                    total2=apartment*br;
                    total=studio*br;
                }
                break;
            case "June":
            case "September":
                studio=75.20;
                apartment=68.70;
                if(br>14){
                total1=studio*br;
                double total3=apartment*br;
                total2=total3-total3*0.10;
                total=total1-total1*0.20;
                }else {
                    total2=apartment*br;
                    total=studio*br;
                }break;
            case"July":
            case"August":
                studio=76;
                apartment=77;
                if(br>14){
                    total1=apartment*br;
                    total2=total1-total1*0.10;
                    total=studio*br;
                }else
                {
                    total2=apartment*br;
                    total=studio*br;

                }break;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",total2,total);
    }
}
