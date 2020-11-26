import java.util.Scanner;

public class ChangeBiuro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int bitcoin =1168;
        double ki=0.15;
        double dolar=1.76;
        double xdolar=dolar*ki;
        int brbitcoin=Integer.parseInt(scanner.nextLine());
        double brki=Double.parseDouble(scanner.nextLine());
        double komisionna=Double.parseDouble(scanner.nextLine());
        double sumofkomisionna=komisionna*0.01;
        double sumbitcoin=brbitcoin*bitcoin;
        double sumki=brki*xdolar;
        double sumofall=(sumbitcoin+sumki)/1.95;
        double all=sumofall*sumofkomisionna;
        double result=sumofall-all;
        System.out.printf("%.2f",result);
    }
}
