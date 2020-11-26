import java.io.IOException;

public class MainClass {
    public static void main(String[] args) {
        StraniciOtLekcii f=new StraniciOtLekcii(30,"Welcome");
        Lekciq p=new Lekciq("Hello",30);
        try {
            p.addStr(f);
            p.brstr(30);
            p.toString();
            p.swapPages(5, 10);
            p.genereteLecture("Hello", 30);
            p.setObject("True");
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
