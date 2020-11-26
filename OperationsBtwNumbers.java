import java.util.Scanner;

public class OperationsBtwNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N1= Integer.parseInt(scanner.nextLine());
        int N2= Integer.parseInt(scanner.nextLine());
        String operator=scanner.nextLine();
        int total=0;
        double p=0;
        if(operator.equals("+")){
            total=N1+N2;
            if(total%2==0){
                System.out.printf("%d + %d = %d - even",N1,N2,total);
            }else{
                System.out.printf("%d + %d = %d - odd",N1,N2,total);
            }
        }
        else if(operator.equals("-")){
            total=N1-N2;
            if(total%2==0){
                System.out.printf("%d - %d = %d - even",N1,N2,total);
            }else{
                System.out.printf("%d - %d = %d - odd",N1,N2,total);
            }
        }
        else if(operator.equals("*")){
            total=N1*N2;
            if(total%2==0){
                System.out.printf("%d * %d = %d - even",N1,N2,total);
            }else{
                System.out.printf("%d * %d = %d - odd",N1,N2,total);
            }
        }else if(operator.equals("/")){
            if(N2==0){
                System.out.printf("Cannot divide %d by zero",N1);
            }else {
                double f=N1*1.00;
                p=f/N2;
                System.out.printf("%d / %d = %.2f",N1,N2,p);
            }
        }else if(operator.equals("%")){
            if(N2==0){
                System.out.printf("Cannot divide %d by zero",N1);
            }else {
                total=N1%N2;
                System.out.printf("%d %% %d = %d",N1,N2,total);
            }
        }
    }
}
