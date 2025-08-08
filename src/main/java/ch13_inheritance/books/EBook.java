package ch13_inheritance.books;

public class EBook extends Book {
    //5. 자식 클래스 고유 필드
    private double fileSize;
    private String format;

    //6.생성자 All
    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    //7.자식 고유의 필드 getter setter

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    //8.method overriding -> showInfo() by using Alt + ins
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("파일 크키 : " + fileSize + " MB");
        System.out.println("파일 형식 : " + format);
    }
}
