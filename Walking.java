import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //10 000 stupki vseki den
        //Ako iska da se pribere po rano shte vuvede Going home i shte vuvede stupkite koito e izvurvqla dokato se pribere
        // ako ne uspee da postigne celta si trqbva da izpishe (razlikata mejdu stupkite) more steps to reach goal.
        int stupki= 10000;
        int sum=0;
        int Addstupki=0;
        boolean what=true;
        while(sum<10000){
            String Addstupki1=scanner.nextLine();
            if(!Addstupki1.equals("Going home")){
                Addstupki=Integer.parseInt(Addstupki1);
                sum+=Addstupki;
            }else {
                Addstupki1 = scanner.nextLine();
                Addstupki = Integer.parseInt(Addstupki1);
                sum += Addstupki;
                if(sum<10000){
                    int total=10000-sum;
                    System.out.printf("%d more steps to reach goal.",total);
                    return;

                }else {
                        System.out.println("Goal reached! Good job!");
                    return;
                }
            }
        }
        System.out.println("Goal reached! Good job!");

    }
}
