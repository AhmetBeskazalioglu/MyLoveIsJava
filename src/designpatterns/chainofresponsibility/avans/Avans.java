package designpatterns.chainofresponsibility.avans;



// Kullanım
public class Avans {
    public static void main(String[] args) {
        // İşleyici zinciri oluştur
        IHandler employeeHandler = new EmployeeHandler();
        IHandler groupManagerHandler = new GroupManagerHandler();
        IHandler directorHandler = new DirectorHandler();

        ((EmployeeHandler) employeeHandler).setNextHandler(groupManagerHandler);
        ((GroupManagerHandler) groupManagerHandler).setNextHandler(directorHandler);

        // Talep işleme
        double requestAmount = 1000000;
        employeeHandler.handleRequest(requestAmount);

    }
}
