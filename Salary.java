import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int number=Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=n;i++){
           String text=scanner.nextLine();
           if(number>0) {
               if ("Facebook".equals(text)) {
                   number= number - 150;
               }else {
                   number=number;
               }
               if ("Instagram".equals(text)) {
                  number = number - 100;
               }else {
                   number=number;
               }
               if("Reddit".equals(text)){
                   number=number-50;
               }else {
                   number=number;
               }
               if(number<=0){
                   break;
               }
           }else {
                break;
           }
        }
        if(number>0){
            System.out.println(number);
        }
        else {
            System.out.println("You have lost your salary.");
        }
    }
}
