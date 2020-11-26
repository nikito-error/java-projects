import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String text=scanner.nextLine();
        int br=0;
        while(!text.equals("Stop")){
            br++;
            text=scanner.nextLine();
        }
        System.out.println(br);
    }
}
