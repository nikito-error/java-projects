import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product=scanner.nextLine();
        String grad=scanner.nextLine();
        double number=Double.parseDouble(scanner.nextLine());
        if("Sofia".equals(grad)){
            switch(product){
                case "coffee":
                {
                    double p=number*0.50;
                    System.out.println(p);
                    break;
                }
                case "water":
                { double p=number*0.80;
                    System.out.println(p);
                    break;
                }
                case "beer":
                { double p=number*1.20;
                    System.out.println(p);
                    break;
                }
                case "sweets":
                { double p=number*1.45;
                    System.out.println(p);
                    break;
                }
                default:
                { double p=number*1.60;
                    System.out.println(p);
                    break;
                }
            }
        }else if("Plovdiv".equals(grad)){switch(product) {
            case "coffee": {
                double p = number * 0.40;
                System.out.println(p);
                break;
            }
            case "water": {
                double p = number * 0.70;
                System.out.printf("%.1f",p);
                break;
            }
            case "beer": {
                double p = number * 1.15;
                System.out.println(p);
                break;
            }
            case "sweets": {
                double p = number * 1.30;
                System.out.println(p);
                break;
            }
            default: {
                double p = number * 1.50;
                System.out.println(p);
                break;
            }
        }
        }else {switch(product) {
            case "coffee": {
                double p = number * 0.45;
                System.out.println(p);
                break;
            }
            case "water": {
                double p = number * 0.70;
                System.out.println(p);
                break;
            }
            case "beer": {
                double p = number * 1.10;
                System.out.println(p);
                break;
            }
            case "sweets": {
                double p = number * 1.35;
                System.out.println(p);
                break;
            }
            default: {
                double p = number * 1.55;
                System.out.println(p);
                break;
            }
        }

        }
    }
}
