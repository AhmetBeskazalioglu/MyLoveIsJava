package designpatterns.singleton;

/**
 * Singleton
 */
class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("Singleton nesnesi oluşturuldu");
    }

    public static Singleton getInstance() {

        return singleton;
    }
}

/**
 * Lazy Singleton
 */
class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
        System.out.println("Lazy Singleton nesnesi oluşturuldu");
    }

    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}

/**
 * Threaded Lazy Singleton
 */
class ThreadedLazySingleton {

    private static ThreadedLazySingleton singleton;

    private ThreadedLazySingleton() {
        System.out.println("Threaded Lazy Singleton nesnesi oluşturuldu");
    }

    public static ThreadedLazySingleton getInstance() {
        synchronized (ThreadedLazySingleton.class) {
            if (singleton == null) {
                singleton = new ThreadedLazySingleton();
            }
        }
        return singleton;
    }
}

/**
 * Double Checked Locking Singleton
 */
class DoubleCheckedLockingSingleton {

    private static DoubleCheckedLockingSingleton singleton;

    private DoubleCheckedLockingSingleton() {
        System.out.println("Double Checked Locking Singleton nesnesi oluşturuldu");
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                // Eğer Singleton nesnesi hala null ise, yeni bir nesne oluşturulur.
                // Eğer başka bir thread bu nesneyi zaten oluşturmuşsa, ikinci null kontrolü false döner ve yeni bir nesne oluşturulmaz.
                if (singleton == null) {
                    singleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}

public class SingletonMain {
    public static void main(String[] args) {

        // Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Bu nesneler birbiri ile aynı");
        } else {
            System.out.println("Bu nesneler birbirlerinden farklı");
        }


        // Lazy Singleton
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        if (lazySingleton1 == lazySingleton2) {
            System.out.println("Bu nesneler birbiri ile aynı");
        } else {
            System.out.println("Bu nesneler birbirlerinden farklı");
        }


        // Threaded Lazy Singleton
        ThreadedLazySingleton threadedLazySingleton1 = ThreadedLazySingleton.getInstance();
        ThreadedLazySingleton threadedLazySingleton2 = ThreadedLazySingleton.getInstance();

        if (threadedLazySingleton1 == threadedLazySingleton2) {
            System.out.println("Bu nesneler birbiri ile aynı");
        } else {
            System.out.println("Bu nesneler birbirlerinden farklı");
        }


        // Double Checked Locking
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton2 = DoubleCheckedLockingSingleton.getInstance();

        if (doubleCheckedLockingSingleton1 == doubleCheckedLockingSingleton2) {
            System.out.println("Bu nesneler birbiri ile aynı");
        } else {
            System.out.println("Bu nesneler birbirlerinden farklı");
        }

        EnumSingleton.INSTANCE.getSingleton();
    }
}