import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Double dohod=Double.parseDouble(scanner.nextLine());
        Double sruspeh=Double.parseDouble(scanner.nextLine());
        Double minzap=Double.parseDouble(scanner.nextLine());
        Double razmerst=Math.floor(minzap*0.35);
        Double razmerst1=Math.floor(sruspeh*25);
        if(dohod<minzap && sruspeh>4.5 && sruspeh<5.5){
            if(razmerst>razmerst1){
                System.out.printf("You get a Social scholarship %.0f BGN",razmerst);
            } else {
                System.out.printf("You get a Social scholarship %.0f BGN",razmerst);}
        }
        else if(sruspeh>=5.5){
            if(razmerst1>=razmerst){
                System.out.printf("You get a scholarship for excellent results %.0f BGN",razmerst1);
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN",razmerst1);
            }
        }

        else {
            System.out.println("You cannot get a scholarship!");
        }

    }
}
