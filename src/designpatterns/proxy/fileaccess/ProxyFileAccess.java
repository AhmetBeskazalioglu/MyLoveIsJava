package designpatterns.proxy.fileaccess;

class ProxyFileAccess implements FileAccess {
    private String fileName;
    private User user;

    public ProxyFileAccess(String fileName, User user) {
        this.fileName = fileName;
        this.user = user;
    }

    @Override
    public void readFile(String fileName) {
        // Client'ın isteklerini kontrol eder.
        if (user.isAdmin()) {
            new RealFileAccess(fileName).readFile(fileName);
        } else {
            System.out.println("Access denied for user: " + user.getName());
        }
    }
}
