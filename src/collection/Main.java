package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
//        List<String> list = new CopyOnWriteArrayList<String>();
//        List<String> list = new ArrayList<String>();
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        list.add("1");
        list.add("2");
        list.add("3");
        for (String s : list) {
            list.remove(s);
        }
    }
}
