package homeWork2;

import java.util.concurrent.ThreadLocalRandom;

public class homeWork {
    public static void main(String[] args) {

        from10to20( 1,1 );
        positiveOrNegative( -1);
        isNegative( -1);
        stringInQuantity( "GeekBrains",5);
        leapYear(2000);
        }


    private static boolean from10to20( int a, int b) {
        a = ThreadLocalRandom.current().nextInt(20);
        b = ThreadLocalRandom.current().nextInt(10);
        System.out.println(a +" "+ b);
            if (a + b <= 20 && a + b > 10 ) {
              System.out.println("true");
              return true;
          } else {
            System.out.println("false");
            return false;
        }

    }

    private static void positiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }

    private static boolean isNegative( int x) {
    if ( x < 0) {
        System.out.println("true");
    return true;
    } else {
        System.out.println("false");
    return false;
    }
    }

    private static void stringInQuantity(String text, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(text);
        }
    }

    private static boolean leapYear(int year) {
        if ( ((year % 4 == 0) | (!(year % 100 == 0) && (year % 400 == 0)))) {
            System.out.println(year + " ��� ����������");
        return true;
        }else {
            System.out.println(year + " ��� �� ����������");
        return false;
        }
    }
}
//������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������