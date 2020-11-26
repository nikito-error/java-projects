import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int shirina=Integer.parseInt(scanner.nextLine());
        int duljina=Integer.parseInt(scanner.nextLine());
        int visochina=Integer.parseInt(scanner.nextLine());
        int total=shirina*duljina*visochina;
        while(true){
            String p=scanner.nextLine();
            if(p.equals("Done")){
                System.out.printf("%d Cubic meters left.",total);
                break;
            }
            int br=Integer.parseInt(p);
            total=total-br;
            if(total<0) {
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(total));
                break;
            }
        }
    }
}