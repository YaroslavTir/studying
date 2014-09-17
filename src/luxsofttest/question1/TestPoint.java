package luxsofttest.question1;
import java.awt.Point;

public class TestPoint {

    public static void mPoint(Point pt, int j) {
        pt.setLocation(5, 5);
        j = j + 10;
        System.out.println("during mPoint, pt = " + pt + " and j = " + j);
    }

    public static void rPoint(Point pt, int j) {
        pt = new Point(10, 10);
        j = 20;
        System.out.println("during rPoint, pt = " + pt + " and j = " + j);
    }

    public static void main(String args[]) {
        Point p = new Point(0, 0);
        int i = 0;
        System.out.println("before mPoint, pt = " + p + " and i = " + i);
        mPoint(p, i);
        System.out.println("after mPoint, pt = " + p + " and i = " + i);
        rPoint(p, i);
        System.out.println("after rPoint, pt = " + p + " and i = " + i);
    }
}
