import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        int sum1=0;
        int total;
for(int i=0;i<n;i++){
    int number=Integer.parseInt(scanner.nextLine());
  if(i%2==0){
      sum=sum+number;
  }else {
      sum1=sum1+number;
  }
}
        if(sum==sum1){
            System.out.printf("Yes\nSum = %d",sum);
        }else if(sum1>sum){
            total=sum1-sum;
            System.out.printf("No\nDiff = %d",total);
        }else {
            total=sum-sum1;
            System.out.printf("No\nDiff = %d",total);
        }
    }
}