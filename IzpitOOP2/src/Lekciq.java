import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lekciq implements RedaktorLekcii{
    List<StraniciOtLekcii> object= new ArrayList();


   public Lekciq(String zaglavnastr,int brstr){

       brstr=0;
       zaglavnastr="";
   }
    public void Leckiq(String zaglavnastr){
zaglavnastr="";
    }
public void addStr(StraniciOtLekcii Toadd){object.add(Toadd);}

    public int setObject(String zaglavnastr) {
        int count = 0;
        for (Iterator<StraniciOtLekcii> it = object.iterator(); it.hasNext(); ) {
            if (it.next().getSudurjanie().equals(zaglavnastr))
                count += 1;
        }
        return count;
    }

    public List genereteLecture(String title, int numverPages) {
        List<String> p = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        if (p.add(title)) {
            return p;
        }
        if (d.add(numverPages))
        return d;
return d;
    }

    public void swapPages(int FirstPN, int secondPN) {
       int temp;
       temp=FirstPN;
       FirstPN=secondPN;
       secondPN=temp;
    }

    public String toString() {
        return "Lekciq{" +
                "object=" + object +
                '}';
    }
    public int brstr(int brstr){
       return brstr;
    }
}
