import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double chislo=Double.parseDouble(scanner.nextLine());
        String textv=scanner.nextLine();
        String texti=scanner.nextLine();
        if(textv.equals("m")){
            if(texti.equals("m")){
                System.out.printf("%.3f",chislo);
            }
            else if(texti.equals("mm"))
            {
                double p = chislo*1000;
                System.out.printf("%.3f",p);
            }
            else if(texti.equals("cm")){
                double p = chislo*100;
                System.out.printf("%.3f",p);
            }
        }
        else if(textv.equals("mm")){
            if(texti.equals("m")){
                double p = chislo/1000;
                System.out.printf("%.3f",p);
            }
            else if(texti.equals("mm")){
                System.out.printf("%.3f",chislo);
            }
            else if(texti.equals("cm")){
                double p =chislo/10;
                System.out.printf("%.3f",p);
            }
        }else{
            if (texti.equals("m")){
            double p=chislo/100;
            System.out.printf("%.3f",p);
            }
            else if(texti.equals("cm")){
            System.out.printf("%.3f",chislo);
        }
            else if(texti.equals("mm")){
                double p=chislo*10;
            System.out.printf("%.3f",p);
            }
        }
    }
}
