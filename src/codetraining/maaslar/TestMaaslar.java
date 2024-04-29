package codetraining.maaslar;

public class TestMaaslar {
    public static void main(String[] args) {
        Calisan[] calisanlar = new Calisan[]{new GenelMudur(80000), new Mudur(60000),new Programci(40000),new Stajyer(5000)};

        for (Calisan calisan : calisanlar) {
            System.out.println(calisan.toString());
        }

        int sum=0;
        for (Calisan calisan : calisanlar) {
            sum += calisan.getirMaas();
        }
        System.out.println("Toplam maaş: " + sum);
    }
}
