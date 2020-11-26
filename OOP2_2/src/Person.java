
public class Person {
    protected String ime;
    protected String familiq;
    protected String egn;

    public Person(String ime, String familiq, String egn) {
        this.ime=ime;
        this.familiq=familiq;
        this.egn=egn;
    }

    public String getIme() {
        return ime;
    }
    public String getFamiliq(){
        return familiq;
    }
    public String getEgn(){
        return egn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ime='" + ime + '\'' +
                ", familiq='" + familiq + '\'' +
                ", egn=" + egn +
                '}';
    }

    public int compareTo(Object s){
return this.egn.compareTo(((Person)s).egn);
    }


    public boolean equals(Object s) {
        return this.egn==((Person)s).egn;
    }
}
