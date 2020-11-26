import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int degree= Integer.parseInt(scanner.nextLine());
        String vreme=scanner.nextLine();
        String outfit="";
        String shoes="";
        if("Morning".equals(vreme)){
            if(degree>=10 && degree<=18){
                outfit="Sweatshirt";
                shoes="Sneakers";
            }else if(degree>18 && degree <=24){
                outfit="Shirt";
                shoes="Moccasins";
            }else {
                outfit="T-Shirt";
                shoes="Sandals";
            }
        }
        else if("Afternoon".equals(vreme)){
            if(degree>=10 && degree<=18){
            outfit="Shirt";
            shoes="Moccasins";
        }else if(degree>18 && degree <=24){
            outfit="T-Shirt";
            shoes="Sandals";
        }else {
            outfit="Swim Suit";
            shoes="Barefoot";
        }
        }else {if(degree>=10 && degree<=18){
            outfit="Shirt";
            shoes="Moccasins";
        }else if(degree>18 && degree <=24){
            outfit="Shirt";
            shoes="Moccasins";
        }else {
            outfit="Shirt";
            shoes="Moccasins";
        }

        }
        System.out.printf("It's %d degrees, get your %s and %s.",degree,outfit,shoes);
    }
}
