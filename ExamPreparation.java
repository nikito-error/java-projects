import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int br=0;
        int count=0;
        double total=0;
        boolean isFailed=true;
        String lastproblem="";
        while(br<n){
            String name=scanner.nextLine();
            if(name.equals("Enough")){
                isFailed=false;
                break;
            }

            int oc=Integer.parseInt(scanner.nextLine());
            count++;
            if(oc<=4){
                br++;
            }
            total=total+oc;
            lastproblem=name;
        }
        if(br>=n){
            System.out.printf("You need a break, %d poor grades.",br);
        }else {
            double all=total/count;
            System.out.printf("Average score: %.2f\n",all);
            System.out.printf("Number of problems: %d\n",count);
            System.out.printf("Last problem: %s",lastproblem);
        }
    }
}
