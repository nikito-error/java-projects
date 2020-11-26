import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum = 0;

        String text=scanner.nextLine();
        while(!text.equals("Stop")){
            int number=Integer.parseInt(text);
            sum+=number;
            text=scanner.nextLine();
        }
        System.out.println(sum);
    }
}
