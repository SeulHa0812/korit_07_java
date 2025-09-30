package java_exam2.problem_book;


public class Book {
    // 1. field
    private String title;
    private String author;

    // 2. AllArgsConstructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 3. displayInfo()
    public void diaplayInfo() {
        System.out.print("제목 : " + title + ", 저자 : " + author);
    }
}
