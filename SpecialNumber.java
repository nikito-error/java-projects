import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int c1,c2,c3,c4;
        int total1,total2,total3,total4;
        boolean flag;
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1111;i<=9999;i++){
            c1=i/1000;
            c2=i/100%10;
            c3=i/10%10;
            c4=i%10;
            if(c1!=0 && c2!=0 && c3!=0 && c4!=0) {

                flag = n % c1 == 0 && n % c2 == 0 && n % c3 == 0 && n % c4 == 0;
                if (flag) {
                    System.out.printf(i+" ");
                }
            }
        }
    }
}
