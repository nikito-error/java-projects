import java.util.Scanner;

public class ConcatenateDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname=scanner.nextLine();
        String lastname=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        String town=scanner.nextLine();
        System.out.print("You are " +firstname+ " " +lastname+ ", a " +age+ "-years old person from " +town+ ".");
    }
}
