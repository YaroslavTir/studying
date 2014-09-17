package luxsofttest.question9;

import java.util.concurrent.TimeUnit;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class Tux extends Thread {

    static String sName = "vandeleur";

    public static void main(String argv[]) throws InterruptedException {
        Tux t = new Tux();
        t.piggy(sName);
//        piggy(t);
        TimeUnit.SECONDS.sleep(1L);
        System.out.println(sName);

    }

    private static void piggy(Tux t) {
        sName = sName + " wiggy";
        t.start();
    }


    public void piggy(String sName) {
        sName = sName + " wiggy";
        start();
    }

    public void run() {

        for (int i = 0; i < 4; i++) {
            sName = sName + " " + i;

        }
    }

}
