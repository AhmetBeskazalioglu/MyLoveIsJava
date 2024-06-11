package designpatterns.proxy.fileaccess;

class RealFileAccess implements FileAccess {
    private String fileName;

    public RealFileAccess(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void readFile(String fileName) {
        System.out.println("Reading file: " + fileName);
    }
}