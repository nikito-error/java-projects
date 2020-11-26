import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int year=Integer.parseInt(scanner.nextLine());
        double cenap=Double.parseDouble(scanner.nextLine());
        int cenai=Integer.parseInt(scanner.nextLine());
        double p=0.0;
        double sum=0;
        int br=0;
        double f=0.0;
        double total=0.0;
        double sum1=0.0;
        double totalall;
        for(int i=1;i<=year;i++){
            if(i%2==0){
                p+=10.00;
                sum1=sum1+p;
            }
            if(i%2!=0){
                br++;
            }
        }
        f=Math.ceil(year/2);
        sum=br*cenai;
        total=sum+sum1-f;
 if(total>=cenap){
     totalall=total-cenap;
     System.out.printf("Yes! %.2f",totalall);
 }else{
     totalall=cenap-total;
     System.out.printf("No! %.2f",totalall);
 }
    }
}
