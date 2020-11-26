import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int zakkolichhrana=Integer.parseInt(scanner.nextLine());
        String p=scanner.nextLine();
        int sum=0;
        int sumk=0;
        int kolichhranakg=zakkolichhrana*1000;
        while(!p.equals("Adopted")){
            int chislo=Integer.parseInt(p);
            sum=sum+chislo;
            p=scanner.nextLine();
        }
        if(kolichhranakg>=sum){
            sumk=kolichhranakg-sum;
            System.out.printf("Food is enough! Leftovers: %d grams.",sumk);
        }else {
            sumk = sum - kolichhranakg;
            System.out.printf("Food is not enough. You need %d grams more.", sumk);
        }
    }
}
