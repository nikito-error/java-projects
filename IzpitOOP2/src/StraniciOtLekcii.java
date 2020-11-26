import java.util.Objects;

public class StraniciOtLekcii implements Comparable {
    private int nomerstr;
    private String sudurjanie;
    public StraniciOtLekcii(){}
    public StraniciOtLekcii(int nomerstr,String sudurjanie){
        this.nomerstr=nomerstr;
        this.sudurjanie=sudurjanie;
    }

    public int getNomerstr() {
        return nomerstr;
    }

    public String getSudurjanie() {
        return sudurjanie;
    }

    public void setSudurjanie(String sudurjanie) {
        this.sudurjanie = sudurjanie;
    }
    public void swapPages(int nomerstr){
        String temp;
        String newsudurjanie=null;
        temp=sudurjanie;
        sudurjanie=newsudurjanie;
        newsudurjanie=temp;
    }

    public String toString() {
        return "StraniciOtLekcii{" +
                "nomerstr=" + nomerstr +
                ", sudurjanie='" + sudurjanie + '\'' +
                '}';
    }
    public boolean equals(Object o) {

        return this.sudurjanie==((StraniciOtLekcii)o).sudurjanie;
    }

    public int compareTo(Object o) {
        return this.nomerstr - ((StraniciOtLekcii)o).nomerstr;
    }
}
