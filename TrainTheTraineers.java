import java.util.Scanner;

public class TrainTheTraineers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String text=scanner.nextLine();
        double all=0;
        int f=0;
        while(!text.equals("Finish")){
            int br=0;
            double sum=0;
            for(int i=0;i<n;i++){
                double p=Double.parseDouble(scanner.nextLine());
                sum+=p;
                br++;
            }
            double total=sum/br;
          all=all+total;
            System.out.printf("%s - %.2f.%n",text,total);
            text=scanner.nextLine();
            f++;
        }
        double allall=all/f;
            System.out.printf("Student's final assessment is %.2f.",allall);

    }
}
