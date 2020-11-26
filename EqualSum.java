import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int number1 = Integer.parseInt(scanner.nextLine());
        for (int i = number; i <= number1; i++) {
            String num = "" + i;
            int sumchetni=0;
            int sumnechetni=0;
            for(int j=0;j<num.length();j++){
                int currentnum=Integer.parseInt(""+num.charAt(j));
                if(j%2==0){
                    sumchetni+=currentnum;
                }else{
                    sumnechetni+=currentnum;
                }

            }
            if(sumchetni==sumnechetni){
                System.out.printf(i+" ");
            }
        }
    }
}
