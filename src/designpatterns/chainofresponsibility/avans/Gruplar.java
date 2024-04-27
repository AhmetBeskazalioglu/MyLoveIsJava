package designpatterns.chainofresponsibility.avans;
// Temel işleyici arayüzü
interface IHandler {
    void handleRequest(double amount);
}

// Çalışan işleyici
class EmployeeHandler implements IHandler {
    private final double MAX_AMOUNT = 2000;
    private IHandler nextHandler;

    @Override
    public void handleRequest(double amount) {
        if (amount <= MAX_AMOUNT) {
            System.out.println("Çalışan: İhtiyaç avansı talebi onaylandı.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }

    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

// Grup Yöneticisi işleyici
class GroupManagerHandler implements IHandler {
    private final double MAX_AMOUNT = 150000;
    private IHandler nextHandler;

    @Override
    public void handleRequest(double amount) {
        if (amount <= MAX_AMOUNT) {
            System.out.println("Grup Yöneticisi: İhtiyaç avansı talebi onaylandı.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }

    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

// Direktör işleyici
class DirectorHandler implements IHandler {
    private final double MAX_AMOUNT = 750000;

    @Override
    public void handleRequest(double amount) {
        if (amount <= MAX_AMOUNT) {
            System.out.println("Direktör: İhtiyaç avansı talebi onaylandı.");
        } else {
            System.out.println("Direktör: İhtiyaç avansı talebi reddedildi.");
        }
    }
}

