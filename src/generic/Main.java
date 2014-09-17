package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author YMolodkov
 * @since 0.5
 */
public class Main {

    static void print(Collection<String>list){
        for (String string : list) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {



        Test test = new Test();


        List<A> listA = new ArrayList <>();
        listA.add(new A());
        listA.add(new B());
        test.find(new A(), listA);

        List<B> listB = new ArrayList<>();
        test.copy(listA, listB);


        List<String> strList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        print(strList);
//        print(objList);

    }
}
