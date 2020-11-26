import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int count=0;
        int st = 0;int stud=0;int kid=0;
        while(!name.equals("Finish")){
       int free=Integer.parseInt(scanner.nextLine());
       String type=scanner.nextLine();
       int busybr=0;
       while(!type.equals("End")){
           if(type.equals("student")){
               stud++;
           }
           else if(type.equals("standard")){
               st++;
           }else if(type.equals("kid")){
               kid++;
           }
           count++;
           busybr++;
           if(busybr==free){
               break;
           }
                   type=scanner.nextLine();
       }
       double percent=busybr*1.0/free*100;
       System.out.printf("%s - %.2f%% full.%n",name,percent);
            name=scanner.nextLine();
            }
        System.out.printf("Total tickets: %d%n",count);
        double percentStud=stud*1.0/count*100;
        System.out.printf("%.2f%% student tickets.%n",percentStud);
        double percentSt=st*1.0/count*100;
        System.out.printf("%.2f%% standard tickets.%n",percentSt);
        double percentkid=kid*1.0/count*100;
        System.out.printf("%.2f%% kids tickets.%n",percentkid);
    }
}
