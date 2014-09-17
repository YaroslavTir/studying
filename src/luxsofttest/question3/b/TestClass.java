package luxsofttest.question3.b;

/**
 * @author YMolodkov
 * @since 16.0
 */
public class TestClass {

    static class Runner implements Runnable {
        private Object a;
        private Object b;
        private String id;

        public Runner(Object a, Object b, String id) {
            this.a = a;
            this.b = b;
            this.id = id;
        }

        public void run() {
            for (int i = 1; i < 1000; i++) {
                try {
                    synchronized (b) {
                        System.out.println("…do some work…");
//                        System.out.println("…do some work…"+ this);

                        synchronized (a) {
                            System.out.println("…do some more work…");
//                            System.out.println("…do some more work…"+this);
                        }
                    }
//                } catch (InterruptedException e) {}
                } catch (Exception e) {
                }
            }
            System.out.println(id + " done!");
        }

//        @Override
//        public String toString() {
//            return "Runner{" +
//                    "a=" + a +
//                    ", b=" + b +
//                    ", id='" + id + '\'' +
//                    '}';
//        }
    }



    public static void main(String[] args) {
        Object x = new Object();
        Object y = new Object();
//        new Thread(new Runner(x, y, "one")).start();
//        new Thread(new Runner(y, x, "two")).start();

        new Thread(new Runner(x,y,"one")).run();
        new Thread(new Runner(y,x,"two")).run();

    }
}

