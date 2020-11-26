import java.util.Scanner;

public class DivideWithoutReminder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        double br1 =0.0;double br2 =0.0;double br3 =0.0;
        double p1 =0.0;double p2 =0.0;double p3 =0.0;
        for(int i=1;i<=n;i++){
            int number=Integer.parseInt(scanner.nextLine());
            if(number%2==0){
                br1++;
            }
            if(number%3==0){
                br2++;
            }
            if (number % 4 == 0) {
                br3++;
            }
        }
        p1=br1/n*100;
        p2=br2/n*100;
        p3=br3/n*100;
        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%\n",p3);
    }
}
