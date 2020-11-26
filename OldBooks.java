import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String book=scanner.nextLine();
        int br=0;
        int n=Integer.parseInt(scanner.nextLine());
        while(br<n){
           String bookcontinue=scanner.nextLine();
            br++;
           if(book.equals(bookcontinue)){
               br--;
               System.out.printf("You checked %d books and found it.",br);
               break;
           }

        }
        if(br>=n){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",br);

        }

    }
}
