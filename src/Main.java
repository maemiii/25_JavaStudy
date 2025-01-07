
public class Main {
    public static void main(String[] args) {
        byte v1 = 1;
        short v2 = 2;
        char v3 = 'z';
        int v4 = 4;
        long v5 = 5;

        int i1 = Integer.parseInt("123");

        float v6 = 6f;
        double v7 = 7L;

        char ch = 'A';
        String str = "Hello world";
        System.out.println(ch);
        System.out.println((int)ch);
        System.out.println((char)65);
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.printf("%c(%d), ", i, (int) i);

        }
    }
}