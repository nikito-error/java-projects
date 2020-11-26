import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int begin=Integer.parseInt(scanner.nextLine());
        int end=Integer.parseInt(scanner.nextLine());
        int magic=Integer.parseInt(scanner.nextLine());
        int br=0;
        for(int i=begin;i<=end;i++){
            for(int j=begin;j<=end;j++){
                br++;
                if(i+j==magic){
                    System.out.printf("Combination N:%d (%d + %d = %d)",br,i,j,i+j);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d",br,magic);
    }
}
