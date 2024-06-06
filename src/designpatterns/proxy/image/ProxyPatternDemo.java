package designpatterns.proxy.image;

// Adım 1: Subject Interface
interface Image {
    void display();
}

// Adım 2: RealSubject Class
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}

// Adım 3: Proxy Class
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

// Adım 4: Proxy Kullanımı
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // İlk çağrıda dosya diskten yüklenecek
        image.display();
        System.out.println("");

        // İkinci çağrıda diskten yükleme yapılmayacak. Cache'den getirilecek
        image.display();
    }
}
