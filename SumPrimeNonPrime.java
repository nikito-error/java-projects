import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String number=scanner.nextLine();
        int sum=0;
        int sumprosto=0;
        int totalsum=0;
        boolean flag=false;
        boolean p=false;
        while(!number.equals("stop")){
            int numbers=Integer.parseInt(number);
            if(numbers<0){
               System.out.println("Number is negative.");
                          }
for(int i=2;i<numbers;i++){
    if(numbers%i==0) {
        sum = sum + numbers;
        flag=true;
        break;
    }else {
        flag=false;
    }
}
if(flag==false){
    sumprosto=sumprosto+numbers;
    if(sumprosto<0){
        sumprosto=0;
    }
}

            number=scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: "+sumprosto);
        System.out.println("Sum of all non prime numbers is: "+sum);
    }
}