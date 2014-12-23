package collection;

import java.util.*;

/**
 * @author ymolodkov
 * @date 23/12/14.
 * @since 0.1
 */
public class ConcurrentModificationExceptionTest {


    private void addNewElement() {
        List<String> testList = getArrayList();
        for (String s : testList) {
            testList.add(s + " hi");
        }
        printList(testList);
    }

    private void addNewElement2() {
        List<String> testList = getArrayList();
        List<String> addedStrs = new ArrayList();
        for (String s : testList) {
            addedStrs.add(s + " hi");

        }
        testList.addAll(addedStrs);
        printList(testList);
    }

    private void addNewElement3() {
        List<String> testList = getArrayList();
        for (int i = 0; i < testList.size(); i++) {
            Object current = testList.get(i);
            testList.add(current + "hi");
            System.out.println(testList.size());
        }
        printList(testList);
    }

    private void deleteElement() {
        List<String> testList = getArrayList();
        for (String s : testList) {
            if (s.equals("one")) {
                testList.remove(s);
            }
        }
        printList(testList);
    }

    private void deleteElement2() {
        List<String> testList = getArrayList();
        Iterator<String> iterator = testList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("one")) {
                iterator.remove();
            }
        }
        printList(testList);
    }

    private void printList(List<String> testList) {
        for (String s : testList) {
            System.out.println(s);
        }
    }

    private ArrayList getArrayList() {
        return new ArrayList(Arrays.asList(new String[]{"one", "two", "three", "donald-duck"}));
    }


    public static void main(String[] args) {
        ConcurrentModificationExceptionTest test = new ConcurrentModificationExceptionTest();
//        test.addNewElement();
        test.addNewElement2();
//        test.addNewElement3();
//        test.deleteElement();
        test.deleteElement2();
    }
}
