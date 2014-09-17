package luxsofttest.question2;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class DerivTest extends BaseTest {

    public DerivTest(String sName, boolean runF) throws Exception {
        super(sName, runF);
        System.out.println(name + " DerivTest");
    }

    public void f() {
        System.out.println(name + " DerivTest.f");
    }

    public static void main(String[] args) {
        try {
            System.out.println("main try");
            DerivTest dt1 = new DerivTest("one", true);
            BaseTest dt2 = new DerivTest("two", false);
            DerivTest dt3 = new DerivTest("three", true);
        }
        catch(Exception e) {
            System.out.println("main catch");
        }
        finally {
            System.out.println("main finally");
        }
        System.out.println ("main done");
    }
}
