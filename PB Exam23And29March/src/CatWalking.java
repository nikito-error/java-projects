import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int minute=Integer.parseInt(scanner.nextLine());
        int brrden=Integer.parseInt(scanner.nextLine());
        int pkaloriiden=Integer.parseInt(scanner.nextLine());
        int kotkaminkalorii=minute*5;
        int allkotkaminkalorii=kotkaminkalorii*brrden;
        if(pkaloriiden/2<=allkotkaminkalorii)
        {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",allkotkaminkalorii);
        }
        else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",allkotkaminkalorii);
        }
    }
}
