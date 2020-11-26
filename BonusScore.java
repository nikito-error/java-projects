import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo= Integer.parseInt(scanner.nextLine());
        double bonus=0;
        if(chislo <=100){
            bonus=5;
        } else if (chislo > 100 & chislo <=1000) {
            bonus=0.2*chislo;
        }
        else if (chislo>1000){
            bonus =0.1*chislo;
        }
        if(chislo%2==0){
            bonus=bonus+1;
        }
        else if (chislo%10==5){
            bonus=bonus+2;
        }
        System.out.println(bonus);
        System.out.println(chislo+bonus);
    }
}
