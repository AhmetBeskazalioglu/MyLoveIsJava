package javamodules.oop.inheritance.quiz;

public class Increment2 {
    class X
    {
        int i = 101010;

        public X()
        {
            i = i++ + i-- - i;
        }

        static int staticMethod(int i)
        {
            return --i;
        }
    }

    class Y extends X
    {
        public Y()
        {
            System.out.println(staticMethod(i));
        }
    }

    public static void main(String[] args) {
        Increment2 increment2 = new Increment2();
        increment2.new Y();
    }
}
