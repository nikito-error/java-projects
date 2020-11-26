import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //vrushta vuzmojno nai malko moneti
        //priema sumata-resto,koeto trqbva da se vurne i izvhislqva s kolko nai malko moneti moje da stane tova
        double resto=Double.parseDouble(scanner.nextLine());
        double money=Math.floor(resto*100);
        int br=0;
        while(money>0){
            if(money-200>=0){
                money=money-200;
                br++;
            }else if(money-100>=0){
                money=money-100;
                br++;
            }else if(money-50>=0){
                money=money-50;
                br++;
            }else if(money-20>=0){
                money=money-20;
                br++;
            } else if (money - 10 >= 0) {
                money=money-10;
                br++;
            }else if(money-5>=0){
                money=money-5;
                br++;
            }else if(money-2>=0){
                money=money-2;
                br++;
            }else if(money-1>=0){
                money=money-1;
                br++;
            }
        }
        System.out.println(br);

        }
    }

