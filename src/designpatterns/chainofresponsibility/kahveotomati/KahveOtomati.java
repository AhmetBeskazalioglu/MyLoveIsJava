package designpatterns.chainofresponsibility.kahveotomati;

public class KahveOtomati {
    private static MetalPara zincir = null;

    public static void main(String[] args) {
        BirLira birLira = new BirLira();
        ElliKurus elliKurus = new ElliKurus();
        OnKurus onKurus = new OnKurus();
        BesKurus besKurus = new BesKurus();

        zincir = (birLira.setNext(elliKurus.setNext(onKurus.setNext(besKurus))));


        paraAt(new BirKurus());
        paraAt(new ElliKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new BesKurus());
        paraAt(new BesKurus());
        paraAt(new BirKurus());
    }

    public static void paraAt(MetalPara para) {
        System.out.println(
                "+++ ------------------------ +++");
        System.out.println(
                "Otomata " + para.toString() + "  atıldı.");
        zincir.check(para);
        System.out.println(
                "+++ ------------------------ +++\n");
    }
}


