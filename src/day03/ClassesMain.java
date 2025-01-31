package day03;

public class ClassesMain {
    private int hi = 30;
    private static int bye = 50;


    class A {
        void test() {
            hi = 50;
            bye = 30;
        }

        static void answer() {
//            test();
        }

        static void question() {
            answer();
        }
    }

    static class B {
        void test() {
//            hi;
            bye = 60;
        }
    }

    interface I {
        void test();
    }

    //기명 클래스
    class AI implements I {

        @Override
        public void test() {
            System.out.println("AI");
        }
    }

    class BI implements I {
        @Override
        public void test() {
            System.out.println("BI");
        }
    }

    // 추상화
    public static void Wow(I i) {
        i.test();
    }

    public static void main(String[] args) {
        ClassesMain main = new ClassesMain();
        ClassesMain.AI ai = main.new AI();
        ai.test();

        ClassesMain.BI bi = main.new BI();
        bi.test();

        Wow(ai);

        //익명 클래스
        Wow(new I() {
            @Override
            public void test() {
                System.out.println("CI");
            }
        });
        //람다
        Wow(() -> System.out.println("DI"));
    }
}
