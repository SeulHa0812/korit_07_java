package ch11_access_modifier;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
        setter/ getter는 디폴트로 접근 제어자가 퍼블릭 이므로 클래스 외부에서 사용 가능

 */
public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "김일";
//        System.out.println(person1.name);

        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());

    }
}
