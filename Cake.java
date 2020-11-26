import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int duljina=Integer.parseInt(scanner.nextLine());
        int shirina=Integer.parseInt(scanner.nextLine());
        int total=duljina*shirina;
        int br=0;
        while(br<total){
            String brp=scanner.nextLine();
           if(!brp.equals("STOP")){
               int brpp=Integer.parseInt(brp);
               total=total-brpp;
               if(total<=0){
                   System.out.printf("No more cake left! You need %d pieces more.",Math.abs(total));
                   return;
               }
           }else {
               System.out.printf("%d pieces are left.",total);
               return;
           }
        }
        System.out.printf("No more cake left! You need %d pieces more.",Math.abs(total));
    }
}
