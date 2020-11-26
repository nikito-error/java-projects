import java.util.Scanner;

public class BehievePopulation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double nachalnapopulaciq=Integer.parseInt(scanner.nextLine());
        int godini=Integer.parseInt(scanner.nextLine());
    double total=0;
    double total1=0;
    double total2=0;
    double total3=0;
    double total4=0;
    double total5=0;
    double total6=0;
        int br=0;
        for(int i=1;i<=godini;i++){
           total=Math.floor(nachalnapopulaciq/10);
           total1=total*2;
           total2=nachalnapopulaciq+total1;;
           br++;
           if(br==5){
               total5=Math.floor(total2/50);
                total6=total5*5;
                total2=total2-total6;
                br=0;
           }
            total3=Math.floor(total2/20);
            total4=total3*2;
            nachalnapopulaciq=total2-total4;
        }
        System.out.printf("Beehive population: %.0f",nachalnapopulaciq);
    }
}
