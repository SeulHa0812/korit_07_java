package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        //객체 생성
        ObjectTest objectTest1 = new ObjectTest();
        //set
        objectTest1.setName("안근수");
        objectTest1.setAddress("부산광역시 연제구");
        //showInfo 호출
        objectTest1.showInfo();

        //객체명만으로는 필드 정보를 프린트 할 수 없음
        System.out.println(objectTest1); //before use toString() on ObjectTest
        //toString() 사용해서 해결
        System.out.println(objectTest1); // 필드 정보 확인 가능 + toString() 명시 할 필요 없음

        String example = "안녕하세요";
        boolean result1 = "안녕하세요" == example;
        System.out.println(result1); //true

        String[] strArray = {"안녕하세요", "안녕"};
        boolean result2 = "안녕하세요" == strArray[0];
        boolean result3 = example == strArray[0];
        System.out.println(result2); // true
        System.out.println(result3); // true

        String example2 = new String("안녕하세요");
        boolean result4 = "안녕하세요" == example2;
        System.out.println(result4); //false

        boolean result5 = strArray[0] == example2;
        System.out.println(result5); //false

        boolean result6 = strArray[0].equals(example2);
        System.out.println(result6); // true
    }
}
