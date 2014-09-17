package english;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author YMolodkov
 * @since 14.0
 */
public class Numbers {

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static void main(String[] args) throws InterruptedException {
        while (true){
            switch (randInt(0,4)){
                case 0:
                    System.out.format("%,8d%n", randInt(0, 9));
                    TimeUnit.MILLISECONDS.sleep(1000L);
                    break;
                case 1:
                    System.out.format("%,8d%n", (randInt(10, 99)));
                    TimeUnit.MILLISECONDS.sleep(3000L);
                case 2:
                    System.out.format("%,8d%n", (randInt(100, 999)));
                    TimeUnit.MILLISECONDS.sleep(5000L);
                case 3:
                    System.out.format("%,8d%n", randInt(1000, 99999));
                    TimeUnit.MILLISECONDS.sleep(8000L);
                case 4:
                    System.out.format("%,8d%n", randInt(1000000, 999999999));
                    TimeUnit.MILLISECONDS.sleep(12000L);
            }
        }
    }
}
