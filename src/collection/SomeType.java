package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author YMolodkov
 * @since 0.5
 */
public class SomeType<T> {

    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }

    private void test(List<Integer> integerList) {
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }


    public static void main(String[] args) {
        SomeType<?> someType = new SomeType<Object>();
        List<String> list = Arrays.asList("value");
        someType.test(list);
    }
}

