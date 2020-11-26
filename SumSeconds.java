import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time1 =Integer.parseInt(scanner.nextLine());
        int time2 =Integer.parseInt(scanner.nextLine());
        int time3 =Integer.parseInt(scanner.nextLine());
        int result=time1+time2+time3;
        int minutes=result/60;
        int seconds=result%60;
        if(seconds<10){
            System.out.printf("%d:0%d",minutes,seconds);
        }
        else System.out.printf("%d:%d",minutes,seconds);
    }
}
