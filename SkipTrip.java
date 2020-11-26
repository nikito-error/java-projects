import java.util.Scanner;

public class SkipTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dni = Integer.parseInt(scanner.nextLine());
        String pomeshtenie = scanner.nextLine();
        String ocenka = scanner.nextLine();
        int day = dni - 1;
        double pricepnight=0;
        switch(pomeshtenie){
            case "room for one person":
                pricepnight = 18;
                break;
            case "apartment":
                pricepnight=25;
                break;
            case"president apartment":
                pricepnight=35;
                break;
        }
        double totalprice=day*pricepnight;
        if(pomeshtenie.equals("apartment")){
            if(dni<10){
                totalprice=totalprice-0.3*totalprice;
            }
            else if(dni>=10 && dni<=15){
                totalprice=totalprice-0.35*totalprice;
            }
            else if (dni>15){
                totalprice=totalprice-0.5*totalprice;
            }
        }else if(pomeshtenie.equals("president apartment")){
            if(dni<10){
                totalprice=totalprice-0.1*totalprice;
            }
            else if(dni>=10 && dni<=15){
                totalprice=totalprice-0.15*totalprice;
            }
            else if (dni>15){
                totalprice=totalprice-0.2*totalprice;
            }
        }if(ocenka.equals("positive")){
            totalprice=totalprice+0.25*totalprice;
        }else if(ocenka.equals("negative")){
            totalprice=totalprice-0.10*totalprice;
        }
        System.out.printf("%.2f",totalprice);
    }
}
