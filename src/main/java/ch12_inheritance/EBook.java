package ch12_inheritance;

public class EBook extends Book {
    private double filesize;
    private String format;

    public EBook(String title, String author, double filesize, String format) {
        super(title, author);
        this.filesize = filesize;
        this.format = format;
    }

    public void setFilesize(double filesize) {
        this.filesize = filesize;
    }

    public double getFilesize() {
        return filesize;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("파일크기\t: " + getFilesize() + "MB");
        System.out.println("파일형식\t: " + getFormat());
    }
}
