
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentGroup implements lReader{
    @Override
    public void load(String filename) {
System.load("C:\\data.txt");
    }
   protected List<Student>students;
    protected String filename;
    public StudentGroup(List<Student> m,String f){
        students= m;
        filename=f;
    }
    public void add(Student p){
this.students.add(p);
    }
    public void print(){
        for(Student p:students)
        System.out.println(students);
    }
    Comparator<Student>comparator=new Comparator<Student>()
    {
        public int compare(Student s1,Student s2)
        {
            if(s1.getFn().equals(s2.getFn())) {
                return 1;
            }else return 0;
        }
    };
    void sort()
    {
        Collections.sort(students,comparator);
    }
    Comparator<Student>comparator1=new Comparator<Student>()
    {
        public int compare(Student s3,Student s4)
        {
            if(s3.getBrt() == s4.getBrt()) {
                return 1;
            }else return 0;
        }
    };
    Comparator<Student>comparator2=new Comparator<Student>()
    {

        public int compare(Student s3,Student s4)
        {
            int br=0;
             s4 = null;
            assert false;
            if(s3.getBrt() > s4.granica()) {
                br++;
                return br;
            }else return 0;
        }
    };
}