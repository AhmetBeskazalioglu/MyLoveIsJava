package designpatterns.chainofresponsibility.kahveotomati;

import java.util.ArrayList;

/**
 * Metal para üstsınıfı *
 */
public abstract class MetalPara {

    private ArrayList<MetalPara> metalParaListesi = new ArrayList<>();
    private int value;
    private MetalPara next;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MetalPara getNext() {
        return next;
    }

    public MetalPara setNext(MetalPara next) {
        this.next = next;
        return this;
    }

    public void check(MetalPara para) {
        System.out.println("Sıradaki nesne sadece " + this + " işleyebilir.");
        if (para.getValue() != this.value) {
            System.out.println("Uymadı, zincirdeki " + "bir " + "sonraki nesneye iletiyoruz.");
            if (getNext() != null) {
                getNext().check(para);
            } else {
                System.out.println("Zincirin sonundayız. " + "" + "Metal para " + para.toString() + " " + "bu otomat için uygun değil.");
            }
        } else {
            metalParaListesi.add(para);
            System.out.println("Otomat tarafından " + this.toString() + " kabul edildi");
        }
    }
}