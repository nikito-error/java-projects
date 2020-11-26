import java.util.Scanner;

public class Student implements Comparable {



    public int compareTo(Object o) {
        Student other = (Student) o;
        if(getBrt()<=other.getBrt()) {
            return 1;
        }
        else {
            return 0;
            }
    }
    protected String fn;
    protected int brt;
    public Student(String f,int br){
        fn=f;
        brt=br;
    }

    public String getFn() {
        return fn;
    }
    public void setFn(String fn){
        this.fn=fn;
    }
    public int getBrt(){
        return brt;
    }

    public void setBrt(int brt) {
        this.brt = brt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fn='" + fn + '\'' +
                ", brt=" + brt +
                '}';
    }

    public boolean equals(Student other) {
  return this.getBrt() == other.getBrt();
    }
    public int granica(){
        Scanner scanner = new Scanner(System.in);
        int granica=Integer.parseInt(scanner.nextLine());
        return granica;
    }

}
