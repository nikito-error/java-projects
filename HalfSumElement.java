import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int br=Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <=br; i++)
        {
            int n=Integer.parseInt(scanner.nextLine());
        sum=sum+n;
        if(n>max) {
            max=n;
        }
        }
        int summ=sum-max;
        if(summ==max){
            System.out.printf("Yes%nSum = %d",max);
        }else {
            int total=Math.abs(max-summ);
            System.out.printf("No%nDiff = %d",total);
        }
    }
}
