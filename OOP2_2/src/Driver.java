public class Driver extends Person implements Comparable {
    protected int regNo;
    protected String marka;

    public Driver(String ime, String familiq, String egn, int regNo, String marka) {
        super(ime,familiq,egn);
        this.marka=marka;
        this.regNo=regNo;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    public String getMarka(){
    return marka;
    }
    public void setMarka(String marka){
    this.marka=marka;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "regNo='" + regNo + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }

    public int compareTo(Object o) {
        return this.regNo-((Driver)o).regNo;
    }
    public boolean equals(Object o){
    return this.marka == (((Driver) o).marka);
    }
}
