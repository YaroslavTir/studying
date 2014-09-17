package luxsofttest.question10;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class Main {
    public static void main(String[] args) {
        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }

    }
}
