import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int brdni=Integer.parseInt(scanner.nextLine());
        double kolichestvohrana=Double.parseDouble(scanner.nextLine());
        int br=0;
        int sumkuche=0;
        int sumkotka=0;
        double total=0;
        double totalsum=0;
        double totalbiscuits=0;
        for(int i=0;i<brdni;i++){
            int kolichhranakuche=Integer.parseInt(scanner.nextLine());
            int kolichhranakotka=Integer.parseInt(scanner.nextLine());
            sumkuche=sumkuche+kolichhranakuche;
            sumkotka=sumkotka+kolichhranakotka;
            br++;
            if(br==3){
                total=(kolichhranakuche+kolichhranakotka)*0.1;
                totalbiscuits=totalbiscuits+total;
                br=br-3;
            }
        }
        totalsum=sumkuche+sumkotka;
        double totalfood=totalsum/kolichestvohrana*100;
        double foodkuche=sumkuche/totalsum*100;
        double foodkotka=sumkotka/totalsum*100;
     System.out.printf("Total eaten biscuits: %dgr.%n",Math.round(totalbiscuits));
     System.out.printf("%.2f%% of the food has been eaten.%n",totalfood);
        System.out.printf("%.2f%% eaten from the dog.%n",foodkuche);
        System.out.printf("%.2f%% eaten from the cat.%n",foodkotka);
    }
}
