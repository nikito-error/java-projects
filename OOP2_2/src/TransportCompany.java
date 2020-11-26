import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TransportCompany {

    private String fileName;
    private Set drivers = new TreeSet<Driver>();

    public TransportCompany(String fileName)
    {
        try{
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine())
            {
                drivers.add(new Driver(sc.next(),sc.next(), sc.next(), sc.nextInt(), sc.next()));
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found");
        }
    }

    public void printCollection()
    {
        System.out.println(drivers.toString());
    }

    public int carsByBrand(String brandToSearch)
    {
        int count = 0;
        for(Iterator<Driver> it = drivers.iterator(); it.hasNext();)
        {
            if (it.next().getMarka().equals(brandToSearch))
                count+=1;
        }
        return count;
    }

    public void addDriver(Driver toAdd)
    {
        drivers.add(toAdd);
    }

    public List reverseOrder()
    {
        List<Driver> list = new ArrayList<Driver>(drivers);
        Collections.reverse(list); //другият начин е с използване на ListIterator, показан е в упр.8
        return list;
    }
}
