package ch10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "김일";
        person1.age = -10;

        Person person2 = new Person("김이");
        person2.age = 201;

        Person person3 = new Person(20);
        person3.name = "김사";

        Person person4 = new Person("김사", 54);

        person1.showInfo();
        person2.showInfo();
        person3.showInfo();
        person4.showInfo();

        // 적절하지 않은 데이터를 확인하는 법
        System.out.println(person1.age);
        System.out.println(person2.age);

        // Setter / Getter의 사용법 -> method
        // 즉 메서드 호출 방법
        // person1의 이름을 디카프리오
        System.out.println(person1.getName()); //결과값 : 김일
        System.out.println(person1.name);
        person1.setName("디카프리오");
        person1.name = "김일";
        person1.name = "디카프리오";
        System.out.println(person1.getName()); //결과값 : 디카프리오
        System.out.println(person1.name);
        // setter getter를 통해서만 데이터의 입력/ 수정/ 조회를 가능하게 하고
        //필드에 직접 값 대입하는 방식을 막도록 할 예정'

        person4.setAge(789); //결과값 : 불가능한 나이 입력입니다.
        System.out.println(person4.age); //결과값 : 54 기존나이 출력됌

        //이상과 같은 코드 라인은 특정 방법을 사용하면 부정확한 데이터의 입력이 가능
        //하기 때문에 장기적으로는 메서드를 통한 데이트의 입력 수정 조회가 필요함

        // .length() -> String 자료형의 글자 수를 return하는 method-> 글자수니까 return 자료형은 int
        System.out.println(person1.name.length());
        // 이상의 객체명.메서드명().메서드명() 등으로
        //. . 이 여러개 나오는 방식을  chaining이라고 함


        person1.setName("노마드코더");
        person1.setName("이일");
    }
}