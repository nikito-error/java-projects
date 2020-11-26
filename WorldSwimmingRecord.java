
import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Double rekord=Double.parseDouble(scanner.nextLine());
        Double razm=Double.parseDouble(scanner.nextLine());
        Double  vremesm=Double.parseDouble(scanner.nextLine());
        Double  obm=razm*vremesm;
        Double  dobavqne=Math.floor(razm/15);
        Double dobavqnep=dobavqne*12.5;
        Double ob=obm+dobavqnep;
        if(ob<rekord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ob);
        }else
        {
            Double p = ob-rekord;
            System.out.printf("No, he failed! He was %.2f seconds slower.",p);
        }
    }
}
