package designpatterns.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void getSingleton() {
        System.out.println("EnumSingleton nesnesi oluşturuldu");
    }
}
