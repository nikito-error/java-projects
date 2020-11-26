import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int br = 0;
        char a;
        char b = 0;
        int i = 0;
        int j = 0;
        for (a = 'a'; a <= 'z'; a++) {
            br++;
            if (br == l) {
                b = a;
                break;
            }
        } {
            for (i = 1; i < n; i++) {
                for (j = 1; j < n; j++) {
                    for (char c = 'a'; c <= b; c++) {
                        for (char d = 'a'; d <= b; d++) {
                            for (int f = 1; f <= n; f++) {
                                if (f > i && f > j) {
                                    System.out.printf("%d%d", i, j);
                                    System.out.printf("%c%c", c, d);
                                    System.out.printf(String.valueOf(f)+" ");
                                }
                            }
                        }
                    }
                }
            }
        }

    }}

