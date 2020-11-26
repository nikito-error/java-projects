
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Letishte implements Comparable {
    protected String ime;
    protected String filename;
protected List<SamoletenBiliet> object=new ArrayList<>();
public Letishte(String ime,List<SamoletenBiliet>object){
    super();
    this.ime=ime;
    this.object=object;
}
    public Letishte(String filename) {
    this.filename=filename;
    show();
    }
    public void show(){
        try{
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine())
            {
                object.add(new SamoletenBiliet(sc.next(),sc.next(),sc.nextDouble(), sc.nextDouble()));
            }
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public List<SamoletenBiliet> getObject() {
        return object;
    }

    public void setObject(List<SamoletenBiliet> object) {
        this.object = object;
    }

    public double maks(double granichnasum) {
       double max = 0;
       ListIterator<SamoletenBiliet> it =object.listIterator(); while(it.hasNext()){
           if (it.next().getCenabilet() <= granichnasum && max < it.next().getRazstoqnie()) {
               max = it.next().getRazstoqnie();
           }
       }
        return max;
   }
   public String DalechnoRazstoqnie(double granichnasum){
    String p = null;
    double km=0;
    for(Iterator<SamoletenBiliet> it = object.iterator(); it.hasNext(); ){
        if(it.next().getCenabilet()<=granichnasum && km<it.next().getRazstoqnie()){
            km=it.next().getRazstoqnie();
            p=it.next().getDograd();
        }
        }
    return p;
    }
   public double srednasumCena(String otgrad,String dograd){
double sum=0;
int br=0;
       for (Iterator<SamoletenBiliet> it = object.iterator(); it.hasNext(); ) {
           sum += it.next().getCenabilet();
           br++;
       }
       return sum/br;
   }

    public int compareTo(Object o) {
        double cena1 = Accumulatevalues(object);
        List<SamoletenBiliet> l = ((Letishte) o).getObject();
        double cena2 = Accumulatevalues(l);
        if (cena1 < cena2)
        return -1;
      else if (cena2 < cena1)
          return 1;
      return 0;
    }

    public void print() {
        System.out.println( "Letishte{" +
                "ime='" + ime + '\'' +
                ", object=" + object +
                '}');
    }
    double Accumulatevalues(List<SamoletenBiliet>data)
    {
        double sum = 0;
        Scanner scanner=new Scanner(System.in);
        for (SamoletenBiliet datum : data) {
            sum += datum.getCenabilet();
        }
            return sum;
        }

}

