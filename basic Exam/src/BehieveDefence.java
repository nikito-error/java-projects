import java.util.Scanner;

public class BehieveDefence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int brpcheli=Integer.parseInt(scanner.nextLine());
        int zdrave=Integer.parseInt(scanner.nextLine());
        int ataka=Integer.parseInt(scanner.nextLine());
        int sum=0;
        while(zdrave!=0){
            int totalpcheli=brpcheli-ataka;
            zdrave=zdrave-(totalpcheli*5);
            sum=sum+ataka;
            if(zdrave<=0){
                System.out.printf("Beehive won! Bees left %d.",totalpcheli);
                break;
            }
            if(totalpcheli<100){
                if(totalpcheli<0){
                    totalpcheli=0;
                }
                System.out.printf("The bear stole the honey! Bees left %d.",totalpcheli);
                break;

            }
                brpcheli=totalpcheli;
        }
    }
}
