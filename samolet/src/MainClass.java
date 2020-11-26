import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MainClass {
    public static void main(String[] args) {
   Letishte l1=new Letishte("C:\\data.txt");
   l1.show();
   try{
       double chislo=170.2;
      double rez=l1.maks(chislo);
      System.out.println(rez);
      String re=l1.DalechnoRazstoqnie(chislo);
      System.out.println(re);
   }catch(NoSuchElementException e){
       System.out.print(e.getMessage());
   }
    }
}
