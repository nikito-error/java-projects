import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String vid=scanner.nextLine();
        int br=Integer.parseInt(scanner.nextLine());
        int budjet=Integer.parseInt(scanner.nextLine());
        double totalsum=0.0;
        if("Roses".equals(vid)){
            if(br>80){
                totalsum=br*5;
                totalsum=totalsum-totalsum*0.10;
            }
            else {
                totalsum=br*5;
            }
        }
        else if("Dahlias".equals(vid)){
            if(br>90){
                totalsum=br*3.80;
                totalsum=totalsum-totalsum*0.15;
            }
            else {
                totalsum=br*3.80;
            }
        }else if("Tulips".equals(vid)){
            if(br>80){
                totalsum=br*2.80;
                totalsum=totalsum-totalsum*0.15;
            }
            else {
                totalsum=br*2.80;
            }
        }else if("Narcissus".equals(vid)){
            if(br<120){
                totalsum=br*3;
                totalsum=totalsum+totalsum*0.15;
            }
            else {
                totalsum=br*3;
            }
        }else if("Gladiolus".equals(vid)){
            if(br<80){
                totalsum=br*2.50;
                totalsum=totalsum+totalsum*0.20;
            }else{
                totalsum=br*2.50;
            }
        }
if(budjet>=totalsum){
    double p=budjet-totalsum;
    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",br,vid,p);
}else {
    double p= totalsum-budjet;
    System.out.printf("Not enough money, you need %.2f leva more.",p);
}
    }
}
