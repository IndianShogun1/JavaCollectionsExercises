import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ques1
{
    public static void main(String[] args) {
        Collection<Float> list = new LinkedList<Float>();
        list.add(1.5f);
        list.add(2.03f);
        list.add(5.4f);
        list.add(3.1514f);
        list.add(9.87f);
        Iterator listIterator = list.iterator();
        float sum = 0;
        while (listIterator.hasNext()){
            sum += (float) listIterator.next();
        }
        System.out.println(sum);
    }
}
