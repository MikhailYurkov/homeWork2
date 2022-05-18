package homeWork2;

import java.util.concurrent.ThreadLocalRandom;

public class homeWork {
    public static void main(String[] args) {

        from10to20( 1,1 );

    }


    private static boolean from10to20( int a, int b) {
        a = ThreadLocalRandom.current().nextInt(20);
        b = ThreadLocalRandom.current().nextInt(10);
        System.out.println(a);
        System.out.println(b);
          if (a + b <= 20 && a + b > 10 ) {
              System.out.println("true");
              return true;
          } else {
            System.out.println("false");
            return false;
        }

    }
}
