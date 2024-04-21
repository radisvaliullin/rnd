package lang.java.know_lang.java_basics;

public class java_basics {

    public static void main(String... args) {

        // variables
        int cadence = 0;
        int speed = 0;
        int gear = 1;
        System.out.printf("%d, %d, %d\n", cadence, speed, gear);

        // create values via literal
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i2 = 100000;
        System.out.printf("%b, %c, %d, %d, %d\n", result, capitalC, b, s, i2);

        // int literal
        int decimalValue = 26;
        int hexadecimalValue = 0x1a;
        int binaryValue = 0b11010;
        System.out.printf("%d, %d, %d\n", decimalValue, hexadecimalValue, binaryValue);

        // float
        double d1 = 123.4;
        double d2 = 1.234e2;
        float f1 = 123.4f;
        System.out.printf("%f, %f, %f\n", d1, d2, f1);

        // underscore
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi = 3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
        System.out.printf("%d, %d, %f, %d, %d, %d, %d, %d\n", creditCardNumber, socialSecurityNumber, pi, hexBytes,
                hexWords, maxLong,
                nybbles, bytes);

        // array
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;
        System.out.printf("array elem 0 - %d\n", anArray[0]);
        System.out.printf("array elem 1 - %d\n", anArray[1]);

        int[] arr2 = {
                100, 200, 300, 400
        };
        System.out.printf("arr2 elem 1 - %d\n", arr2[1]);

        String[][] arr2d = {
                { "asdf", "zxcv" },
                { "qwerty", "1234", "2345" }
        };
        System.out.printf("arr2d elem 1:2 is %s\n", arr2d[1][2]);

        // copy
        String[] cpArr = new String[2];
        System.arraycopy(arr2d[1], 1, cpArr, 0, 2);
        java.util.Arrays.stream(cpArr).map(elem -> elem + "88").forEach(System.out::println);

        // var
        String msg = "qwerty";
        var msg2 = "asdf";
        System.out.printf("%s, %s\n", msg, msg2);

        // control flow statement
        if (true) {
            System.out.println("true");
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        for (String str : arr2d[1]) {
            System.out.println(str);
        }

        int a = 73;
        switch (a) {
            case 73:
                System.out.println("a is 73");

            default:
            System.out.println("default");
        }
    }
}
