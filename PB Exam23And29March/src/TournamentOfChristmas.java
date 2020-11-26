import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int brdni=Integer.parseInt(scanner.nextLine());
        double all=0;
        double day=0;
        double day1=0;
        for(int i=0;i<brdni;i++) {
            double total=0;
            int br=0;
            int br1=0;
            int sum=0;
            String p = scanner.nextLine();
            while (!p.equals("Finish")) {
                String text = scanner.nextLine();
                if (text.equals("win")) {
                    sum = sum + 20;
                    br++;
                } else if (text.equals("lose")) {
                    sum = sum;
                    br1++;
                }
                p = scanner.nextLine();
            }
            if (br > br1) {
                total = sum + sum * 0.1;
                all=all+total;
            } else {
                total = sum;
                all=all+total;

            }
            day=br;
            day1=br1;
        }
        if(day>day1){
            all=all+all*0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f",all);
        }else{
            all=all;
          System.out.printf("You lost the tournament! Total raised money: %.2f",all);
        }
    }
}
