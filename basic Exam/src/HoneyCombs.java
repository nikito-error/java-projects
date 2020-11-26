import java.util.Scanner;

public class HoneyCombs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int brpcheli=Integer.parseInt(scanner.nextLine());
        int brcvetq=Integer.parseInt(scanner.nextLine());
        double total=brpcheli*brcvetq*0.21;
        double ostanali=Math.floor(total/100);
        double med=total-ostanali*100;
        System.out.printf("%.0f honeycombs filled.%n",ostanali);
        System.out.printf("%.2f grams of honey left.",med);

    }
}
