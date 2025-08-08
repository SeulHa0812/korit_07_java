package ch13_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        //9.객체 생성(Book 클래스의 인스턴스 생성)
        Book book1 = new Book("자바의 정석", "남궁성");
        //10.getter 이용 출력문 생성
        System.out.println("이 책의 제목은 " + book1.getTitle() + "입니다.");
        System.out.println("이 책의 저자는 " + book1.getAuthor() + "입니다.");
        //11. 부모 클래스 showInfo()
        book1.showInfo();

        System.out.println();

        //12. Ebook 클래스의 인스턴스 생성
        EBook ebook1 = new EBook("스프링 입문", "이강준",
                5.2, "EPUB");
        //13. setter 이용 파일 형식 변환
        ebook1.setFormat("PDF");
        //14. getter 이용 출력문 생성
        System.out.println("이 전자책의 포맷은 " + ebook1.getFormat() + "입니다.");

        //15. 자식 클래스 showInfo()
        ebook1.showInfo();
    }
}
