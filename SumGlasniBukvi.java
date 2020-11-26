import java.util.Scanner;

public class SumGlasniBukvi {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
String name=scanner.nextLine();
int number=0;
int sum=0;
        for(int i=0;i<name.length();i++) {
            char letter = name.charAt(i);
            if (letter == 'a') {
                number = 1;
            }else if (letter == 'e') {
                number = 2;
            }else if (letter == 'i') {
                number = 3;
            }else if (letter == 'o') {
                number = 4;
            }else  if (letter == 'u') {
                number = 5;
            }else {
                number=0;
            }
            sum=sum+number;
        }
        System.out.println(sum);
    }
}
