import java.util.Scanner;

public class HoneyWinterReserver {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double kolichmedzazimata=Double.parseDouble(scanner.nextLine());
        String p=scanner.nextLine();
        double total=0;
        double all=0;
        while(!p.equals("Winter has come")){
            double sum=0;
            for(int i=0;i<6;i++){
                double med=Double.parseDouble(scanner.nextLine());
                sum=sum+med;
                }
            all=all+sum;
            if(all<0) {
                System.out.printf("%s was banished for gluttony %n", p);
            }else if(all>=kolichmedzazimata){
                break;
            }
            p=scanner.nextLine();
        }
        if(all>=kolichmedzazimata){
            total=all-kolichmedzazimata;
            System.out.printf("Well done! Honey surplus %.2f.",total);
        }else if(all<kolichmedzazimata){
            total=kolichmedzazimata-all;
            System.out.printf("Hard Winter! Honey needed %.2f.",total);
        }
    }
}
