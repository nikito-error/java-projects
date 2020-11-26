import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int hours= Integer.parseInt(scanner.nextLine());
       int minutes=Integer.parseInt(scanner.nextLine());
        int minute=minutes+15;
        if (hours>=0 & hours<=23){
            if(minutes>=0 & minutes<=59){
                if(minute>59){
                    hours=hours+1;
                    minute=minute-60;
                    if(hours>=24){
                        hours=hours-24;
                    }
                    if(minute<10){
                        System.out.printf("%d:0%d",hours,minute);
                    }else
                    System.out.printf("%d:%d",hours,minute);
                }
                else {System.out.printf("%d:%d",hours,minute);}
            }

        }else if(hours>=24){
            hours=hours-24;
            if(minutes>=0 & minutes<=59){
                if(minute>59){
                    hours=hours+1;
                    minute=minute-60;
                    if(minute<10){
                        System.out.printf("%d:0%d",hours,minute);
                    }else
                        System.out.printf("%d:%d",hours,minute);
                }
                else {System.out.printf("%d:%d",hours,minute);}
            }
            }
        }
    }
