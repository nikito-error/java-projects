import java.util.Scanner;

public class frequenceCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j, br = 0,sum=0;
        String p = scanner.nextLine();
        for (i = 0; i < p.length() - 1; i++) {
            br=1;
            for (j = i + 1; j<p.length(); j++) {
                char letter = p.charAt(i);
                if(letter==p.charAt(j)) {
                    br++;
                }
                if(sum<br){
                    sum=br;
                }
                }
            }
        System.out.println(sum);

        }
    }
