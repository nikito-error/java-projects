import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int br = 0;
        double sum=0.0;
        for(int i=1;i<=12;i++){
            double value=Double.parseDouble(scanner.nextLine());
            br++;
            if(value<4){
                System.out.printf("%s has been excluded at %d grade", name, br);
                return;
            }
            sum += value;
            }
        double average=sum/12;
        System.out.printf("%s graduated. Average grade: %.2f",name,average);
    }
}
