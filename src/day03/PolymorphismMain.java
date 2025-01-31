package day03;
//
import java.util.ArrayList;

public class PolymorphismMain {
    static class Person implements Runnable {
        void say() {
            System.out.println("hi");
        }

        @Override
        public void run() {
            System.out.println("running");
        }

        int age = 30;
    }

    class Bird {
        private int age;
        private int height;

        public void fight(포유류 동물) {

        }
    }

    class 포유류 {

    }

    class Dog extends 포유류 {

    }

    class Cat extends 포유류 {

    }

    //has-a, can-a
    interface Runnable {
        void run();
    }

    //is-a
    static class Man extends Person {

    }

    static class Woman extends Person {

    }

    static class Man2 implements Runnable {
        @Override
        public void run() {
            System.out.println("running");
        }
    }

    static class Women2 implements Runnable {
        @Override
        public void run() {
            System.out.println("running");
        }
    }

    public static void main(String[] args) {
        int[] arr = null;
        Integer n = null;
        Double d = null;

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        integerArrayList.add(3);
        integerArrayList.add(5);
//        integerArrayList.add(2.0);

        ArrayList<Number> numberArrayList = new ArrayList<>();
        numberArrayList.add(3);
        numberArrayList.add(5);
        numberArrayList.add(2.0);

        Person p1 = new Man();
        Person p2 = new Woman();
        p1.say();
        p2.say();

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Man());
        personList.add(new Woman());


    }
}
