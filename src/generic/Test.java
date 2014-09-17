package generic;

import java.util.List;

/**
 * @author YMolodkov
 * @since 0.5
 */


public class Test {

    <T extends A> boolean find(T pp,List<T> all) {
        return false;
    }

    void copy(List<? extends A> a, List<? extends B> b){}

}
