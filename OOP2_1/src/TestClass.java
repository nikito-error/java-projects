import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        Student Petur=new Student("18639534",40);
        Student Mitko= new Student("18534321",30);
        List<Student> p=new ArrayList<>();
            p.add(Petur);
            p.add(Mitko);
        StudentGroup B=new StudentGroup(p,"data.txt");
        System.out.println(p);
    }
}
