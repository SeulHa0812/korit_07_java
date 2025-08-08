package ch10_getter_setter;
/*

 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + " / " + age);
    }

    // Setter 정의
    /*
        setName 메서드에 비지니스 로직 추가
        1. argument로 들어온 String 데이터의 글자수를 파악하여
        2. 4글자 초과하면 "변경할 수 없습니다."를 출력한 후 메서드를 종료할 것
        3. 네 글자 이하하면 "이름이 변경되었습니다."
                        "변경 전 : 디카프리오"
                        "변경 후 : 이일"
         이 되도록 작성하고, PersonMain 에서 person1의 이름 변경
         main에서의 코드라인
         person1.setName("노마드코더");
         person1.setName("이일");
         이상의 코드라인을 붙여넣었을 때의 실행 예
         변경할 수 없습니다.
         변경 전 : 디카프리오
         변경 후 : 이일
     */
    public void setName(String title) {
        if (title.length() > 4) {
            System.out.println("변경할 수 없습니다.");
            return;
        } else {
            System.out.println("변경 전 이름 : " + name);
//        System.out.println("변경 전 이름 : " + this.name);
//        System.out.println("변경 전 이름 : " + this.getName());
            this.name = title; //자동 생성하면 매개변수명과 필드명이 동일해서 일부러 다르게 씀
            //대입이 일어나는 시점을 조건문 후로 변경
            System.out.println("변경 후 이름 : " + name);
        }
    }

    public void setAge(int birth) {
        if (birth < 0 || birth > 200) {
            System.out.println("불가능한 나이 입력입니다.");
            return; // method에서 return;은 메서드 즉시 종료 키워드
            // 즉 이 이하로는 아예 실행되지 않음 (else안써도됌)
        }
        System.out.println("변경 전 나이 : " + age); //birth 대입 전이니까
        this.age = birth;
        System.out.println("변경 후 나이 : " + age); // 대입 후니까 동일한 코드라도 다른 결과값
    }

    // Getter 정의
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
