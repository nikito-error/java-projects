
import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vid = scanner.nextLine();
        if (vid.equals("square")) {
            Double number = Double.parseDouble(scanner.nextLine());
            Double result = number * number;
            System.out.printf("%.3f", result);
        } else if (vid.equals("rectangle"))
        {
            Double number = Double.parseDouble(scanner.nextLine());
            Double number2 =Double.parseDouble(scanner.nextLine());
            Double result =(number*number2);
            System.out.printf("%.3f", result);

        }
        else if (vid.equals("circle"))
        {
            Double number = Double.parseDouble(scanner.nextLine());
            Double result=(Math.PI*(number*number));
            System.out.printf("%.3f", result);
        }
        else if (vid.equals("triangle")){
            Double number = Double.parseDouble(scanner.nextLine());
            Double number2 =Double.parseDouble(scanner.nextLine());
            Double result=((number*number2)/2);
            System.out.printf("%.3f", result);
        }
    }
}
