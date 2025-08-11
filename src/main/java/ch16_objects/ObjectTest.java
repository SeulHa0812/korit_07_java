package ch16_objects;

public class ObjectTest {
    //field
    private String name;
    private String address;

    // 기본 생성자 /AaArgsConstructor

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter / Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // showInfo() call1()
    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
    }

    @Override
    public String toString() { //편집도 가능
        return "이름 : " + name + "\n주소 : " + address; // ' ' char
    }
}
