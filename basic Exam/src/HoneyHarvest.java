import java.util.Scanner;

public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String typeflower=scanner.nextLine();
        int brcvetq=Integer.parseInt(scanner.nextLine());
        String sezon=scanner.nextLine();
        double cvetq=0;
        if(typeflower.equals("Sunflower")){
            switch(sezon){
                case "Spring":
                cvetq=10;
                break;
                case "Summer":
                    cvetq=8;
                    break;
                default:
                    cvetq=12;
                    break;
            }}else if(typeflower.equals("Daisy")){
            switch(sezon){
                case "Spring":
                    cvetq=12;
                    break;
                case "Summer":
                    cvetq=8;
                    break;
                default:
                    cvetq=6;
                    break;
            }
        }else if(typeflower.equals("Lavender")){
            switch(sezon){
                case "Spring":
                    cvetq=12;
                    break;
                case "Summer":
                    cvetq=8;
                    break;
                default:
                    cvetq=6;
                    break;
            }
        }else if(typeflower.equals("Mint")){
            switch(sezon){
                case "Spring":
                    cvetq=10;
                    break;
                case "Summer":
                    cvetq=12;
                    break;
                default:
                    cvetq=6;
                    break;
            }
        }
        double total=brcvetq*cvetq;
        double all=0;
        if(sezon.equals("Spring")){
switch(typeflower){
    case "Daisy":
        cvetq=cvetq*0.1;
    case "Mint":
        cvetq=cvetq*0.1;
        break;
    default:all=all;
break;
}
        }else if(sezon.equals("Summer")){
all=total+total*0.1;
        }else if(sezon.equals("Autumn")){
all=total-total*0.05;
        }
        System.out.printf("Total honey harvested: %.2f",all);
    }
}
