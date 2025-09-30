package java_exam2.problem_book;

public class EBook extends Book {
    // 4. 자식 클래스 고유 필드
    private double fileSize;

    // 5. AllArgsConstructor
    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    // 6. Method Override
    @Override
    public void diaplayInfo() {
        System.out.println();
        super.diaplayInfo();
        System.out.print(", 파일 크기 : " + fileSize + "MB");
    }
}
