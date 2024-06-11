package designpatterns.proxy.fileaccess;

public class ProxyDesignPattern_Test {
    public static void main(String[] args) {
        User user1 = new User("Alice", true);
        User user2 = new User("Bob", false);

        FileAccess fileAccess1 = new ProxyFileAccess("myfile.txt", user1);
        fileAccess1.readFile("myfile.txt");

        FileAccess fileAccess2 = new ProxyFileAccess("myfile.txt", user2);
        fileAccess2.readFile("myfile.txt");
    }
}
