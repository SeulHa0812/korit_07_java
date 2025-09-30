package java_exam2.problem_book;

public class Main {
    public static void main(String[] args) {
        // 7. 객체 생성(Book class Instance)
        Book book1 = new Book("자바의 정석", "남궁성");
        // 8. Book displayInfo()
        book1.diaplayInfo();

        // 9. 객체 생성(Ebook class Instance)
        EBook eBook1 = new EBook("스프링 부트 3 백과사전", "김영한", 20.5);
        // 10. EBook displayInfo()
        eBook1.diaplayInfo();
    }
}
