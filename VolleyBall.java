import java.util.Scanner;

public class VolleyBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word=scanner.nextLine();
        int brP= Integer.parseInt(scanner.nextLine());
        int brH=Integer.parseInt(scanner.nextLine());
        int uikends=48;
       double uikendss=(uikends-brH)*3.0/4;
       double praznik=brP*2.0/3;
       double totalsum=uikendss+praznik+brH;
       double total;
        switch(word){
            case "leap":
               total= totalsum+totalsum*0.15;
               System.out.printf("%.0f",Math.floor(total));
                break;
            default:
                System.out.printf("%.0f",Math.floor(totalsum));
                break;

        }
    }
}
