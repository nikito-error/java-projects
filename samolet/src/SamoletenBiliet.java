import java.util.List;
import java.util.Scanner;

public class SamoletenBiliet implements Comparable {
    protected String otgrad;
    protected String dograd;
    protected double cenabilet;
    protected double razstoqnie;
    public SamoletenBiliet(){ }
    public SamoletenBiliet(String otgrad,String dograd,double cenabilet,double razstoqnie){
        this.otgrad=otgrad;
        this.dograd=dograd;
        this.cenabilet=cenabilet;
        this.razstoqnie=razstoqnie;
    }
    public SamoletenBiliet(String otgrad,double raztoqnie) {
        this.otgrad=otgrad;
        this.razstoqnie=razstoqnie;
    }
    public String getDograd() {
        return dograd;
    }

    public String getOtgrad() {
        return otgrad;
    }

    public double getCenabilet() {
        return cenabilet;
    }

    public double getRazstoqnie() {
        return razstoqnie;
    }

    public void setCenabilet(double cenabilet) {
        this.cenabilet = cenabilet;
    }

    public void setDograd(String dograd) {
        this.dograd = dograd;
    }

    public void setOtgrad(String otgrad) {
        this.otgrad = otgrad;
    }

    public void setRazstoqnie(int razstoqnie) {
        this.razstoqnie = razstoqnie;
    }
   double Accumulatevalues(List<SamoletenBiliet>data)
    {
        double sum = 0;
        Scanner scanner=new Scanner(System.in);
        String otgrad1=scanner.nextLine();
        if(otgrad.equals(otgrad1)) {
            for (SamoletenBiliet datum : data) {
                sum += datum.getCenabilet();
            }
            return sum;
        }else {
            sum=0;
            return sum;
        }
    }
    public boolean equals(Object o) {
        return this.otgrad.equals(((SamoletenBiliet) o).otgrad);
    }
    public boolean equals1(Object o){
        return this.dograd.equals(((SamoletenBiliet) o).dograd);
    }

    public void print() {
       System.out.println("SamoletenBiliet{" +
                "otgrad='" + otgrad + '\'' +
                ", dograd='" + dograd + '\'' +
                ", cenabilet=" + cenabilet +
                ", razstoqnie=" + razstoqnie +
                '}');
    }

    public int compareTo(Object o) {
        if(getRazstoqnie()==((SamoletenBiliet)o).getRazstoqnie()){
            return 1;
        }
        else return 0;
    }
}
