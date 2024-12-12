package javamodules.oop.inheritance.quiz;

public class Increment1 {
    class M {
        int i;

        public M(int i) {
            this.i = i--;
        }
    }

    class N extends M {
        public N(int i) {
            super(++i);

            System.out.println(i);
        }
    }

    class X
    {
        int m = 1111;

        {
            m = m++;

            System.out.println(m);
        }
    }

    class Y extends X
    {
        {
            System.out.println(methodOfY());
        }

        int methodOfY()
        {
            return m-- + --m;
        }
    }

    public static void main(String[] args) {
        Increment1 increment1 = new Increment1();
        increment1.new N(26);
        System.out.println();
        increment1.new Y();
    }
}
