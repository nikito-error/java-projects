import java.util.Scanner;
public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while (!text.equals("End"))
        {
           double sum=Double.parseDouble(scanner.nextLine());
          double all =0;
           while(all<sum){
               double money=Double.parseDouble(scanner.nextLine());
               all+=money;
           }
           if(all>=sum){
               System.out.printf("Going to %s!%n",text);
           }
            text=scanner.nextLine();
        }
       }
    }
