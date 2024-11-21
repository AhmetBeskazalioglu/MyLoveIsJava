package javamodules.statickeyword;

public class Static_Keyword {
    //Java’da `static` anahtar kelimesi, bir sınıf üyesinin (`değişken, metot, iç sınıf`) doğrudan sınıfa ait olmasını belirtir.
    //
    //`Static` üyeler, nesne tabanlı değil, sınıf düzeyindedir.
    // Yani bir sınıfın birden fazla örneği (`nesnesi`) olsa bile,
    // `static` üyeler tüm nesneler arasında paylaşılır ve yalnızca bir kopya olarak bellekte tutulur.

    public static class Variable{
        static int num=1;
    }

    public static class Block{
        static String str;
        static{
            Block.str="Example";
        }
    }

    public static class Method {
        static void staticMethod(){
            System.out.println("Static variable is: "+Variable.num);
            System.out.println("Static Block's variable is: "+Block.str);
            System.out.println("Static method is running.");
        }
    }

    public static void main(String[] args) {
        Static_Keyword.Method.staticMethod();
    }
}



// Static üyeler (static metotlar ve değişkenler), sınıf yüklendiği anda belleğe alınır.
// Non-static değişkenler ise ancak bir nesne oluşturulduktan sonra belleğe yüklenir.
// Dolayısıyla, static metot çağrıldığında, non-static değişkenlerin var olup olmadığı garanti edilemez.

class Example {
    int nonStaticDegisken;

    static void staticMetot() {
        // Non-static değişkene erişmek mümkün değil çünkü bu değişken bir nesneye bağlı, daha oluşturulmadı ki.
    }
}
