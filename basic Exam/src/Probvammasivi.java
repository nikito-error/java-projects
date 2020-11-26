import java.util.Scanner;

public class Probvammasivi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 1; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {

                if (arr[i] > arr[j] && arr[i]>arr[i-1]) {
                    System.out.println("Da" + arr[i]+">"+arr[j]);
                    break;
                } else {
                    System.out.println("Ne" + arr[i]+"<"+arr[j]);
                    break;
                }
                }

            }

        }
    }

