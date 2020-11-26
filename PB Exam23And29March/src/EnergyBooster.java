import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String text=scanner.nextLine();
        String rset=scanner.nextLine();
        int brset=Integer.parseInt(scanner.nextLine());
        double all=0;
        double allofall=0;
        double sum=0;
        if(text.equals("Watermelon")){
            switch(rset){
                case "big":
                    all=5*28.70;
                    break;
                case "small":
                    all=2*56;
                    break;
            }
        }else if(text.equals("Mango")){
            switch (rset){
                case "big":
                    all=5*19.60;
                    break;
                case "small":
                    all=2*36.66;
                    break;
            }
        }
        else if(text.equals("Pineapple")){
            switch(rset){
                case "big":
                    all=5*24.80;
                    break;
                case "small":
                    all=2*42.10;
                    break;
            }
        }  else if(text.equals("Raspberry")){
            switch(rset){
                case "big":
                    all=5*15.20;
                    break;
                case "small":
                    all=2*20;
                    break;
            }
        }
        allofall=all*brset;
        if(allofall>=400 && allofall<=1000){
            sum=allofall*0.15;
        }else if(allofall>1000){
            sum=allofall*0.5;
        }else {
            sum=0;
        }
        double endsum=allofall-sum;
        System.out.printf("%.2f lv.",endsum);
    }
}
