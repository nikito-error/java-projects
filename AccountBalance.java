import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int brv=Integer.parseInt(scanner.nextLine());
        double total=0.0;
        for(int i=1;i<=brv;i++){
            double number=Double.parseDouble(scanner.nextLine());
            if(number<0){
                System.out.println("Invalid operation!");
                break;
            }else {
                total=total+number;
            }
            System.out.printf("Increase: %.2f\n",number);
        }
        System.out.printf("Total: %.2f\n",total);

    }
}
