import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String product = scanner.nextLine();
        String day=scanner.nextLine();
        double number=Double.parseDouble(scanner.nextLine());
        switch(day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if(product.equals("banana")){
                double p=number*2.50;
                System.out.printf("%.2f",p);
                break;
            }
                else  if(product.equals("apple")){
                    double p=number*1.20;
                    System.out.printf("%.2f",p);break;
                }
                else  if(product.equals("orange")){
                    double p=number*0.85;
                    System.out.printf("%.2f",p);break;
                }
                else  if(product.equals("grapefruit")){
                    double p=number*1.45;
                    System.out.printf("%.2f",p);break;
                }else if(product.equals("kiwi")){
                    double p=number*2.70;
                    System.out.printf("%.2f",p);break;
                }else if(product.equals("pineapple")) {
                    double p = number * 5.50;
                    System.out.printf("%.2f",p);break;
                }else if(product.equals("grapes")){
                    double p = number * 3.85;
                    System.out.printf("%.2f",p);break;
                }else {
                    System.out.println("error");
                    break;
                }
            case "Saturday":
            case "Sunday":
                if(product.equals("banana")){
                double p=number*2.70;
                    System.out.printf("%.2f",p);
                break;
            }
            else  if(product.equals("apple")){
                double p=number*1.25;
                    System.out.printf("%.2f",p);break;
            }
            else  if(product.equals("orange")){
                double p=number*0.90;
                    System.out.printf("%.2f",p);break;
            }
            else  if(product.equals("grapefruit")){
                double p=number*1.60;
                    System.out.printf("%.2f",p);break;
            }else if(product.equals("kiwi")){
                double p=number*3.00;
                    System.out.printf("%.2f",p);break;
            }else if(product.equals("pineapple")) {
                double p = number * 5.60;
                    System.out.printf("%.2f",p);break;
            }else if(product.equals("grapes")){
                double p = number * 4.20;
                    System.out.printf("%.2f",p);break;
            }
            else {
                System.out.println("error");
                break;
                }
            default :
                System.out.println("error");
                break;

        }
    }
}
