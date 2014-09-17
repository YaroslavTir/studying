package luxsofttest.question2;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class BaseTest {
    protected String name;

    public BaseTest(String sName, boolean runF) throws Exception {
        name = sName;
        System.out.println(name + " BaseTest");
        if(runF) {
            f();
        } else {
            throw new Exception("not running");
        }
    }

    public void f() {
        System.out.println(name + " BaseTest.f");
    }
}
