import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int number=0;
        double p1=0.0;
        double p2=0.0;
        double p3=0.0;
        double p4=0.0;
        double p5=0.0;
        double br1=0.0; double br2=0.0; double br3=0.0; double br4=0.0;double br5=0.0;
        for(int i=1;i<=n;i++){
            number=Integer.parseInt(scanner.nextLine());
            if(number<200){
                br1++;
            }
            if(number>=200 && number<=399){
                br2++;
            }
            if(number>=400 && number<=599){
                br3++;
            }
            if(number>=600 && number<=799){
                br4++;
            }
            if(number>=800){
                br5++;
            }
        }
       p1=(br1/n)*100;
        p2=br2/n*100;
        p3=br3/n*100;
        p4=br4/n*100;
        p5=br5/n*100;
        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%\n",p3);
        System.out.printf("%.2f%%\n",p4);
        System.out.printf("%.2f%%\n",p5);


    }
}
