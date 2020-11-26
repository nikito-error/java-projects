import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        int sum1=0;
        int total;
        for(int i=0;i<n;i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
        }
            {
                for(int f=0;f<n;f++){
                    int number1=Integer.parseInt(scanner.nextLine());
                    sum1=sum1+number1;

                }
                if(sum==sum1){
                    System.out.printf("Yes, sum = %d",sum);
                }
                else if(sum>sum1){
                    total=sum-sum1;
                    System.out.printf("No, diff = %d",total);
                }else {
                    total=sum1-sum;
                    System.out.printf("No, diff = %d",total);
                }
        }
    }
}
