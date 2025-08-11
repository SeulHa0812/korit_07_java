package ch16_objects.teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        //5.객체 생성
        Teacher teacher1 = new Teacher("안근수", "코리아아이티");
        //6.필드 정보 sout
            System.out.println(teacher1);

        Teacher teacher2 = new Teacher("안근수", "코리아아이티");
            System.out.println(teacher2);

        //8.
        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1); //true
        // 이상의 코드에서 중요한 점은 재정의 전과 후가 결과값이 다르다는것
        // Teacher 에서 .equals()를 재정의하기 전에는 false가 뜸
        // 그때의 경우는 teacher1과 teacher2의 주소지까지를 확인하여
        // 같은지 아닌지의 여부를 판단했다면,
        // 재정의 이후에는 field에 입력된 데이터가 동일한지만을 체크하기 때문

        Class tClass = teacher1.getClass(); //지난 시간에 하긴 함
        System.out.println(tClass); //result : class ch16_objects.teacher.Teacher
        System.out.println(tClass.getSimpleName()); //result : Teacher

        System.out.println(teacher1.getClass().getSimpleName()); //result : Teacher
        // 어느 수준까지 그냥 작성할지, 변수에 대입할지를 조직에 따라, 성향에 따라 결정해야함

        Field[] fields = tClass.getDeclaredFields();
        System.out.println(fields); //result : [Ljava.lang.reflect.Field;@681a9515 == 주소지 출력됨
        for ( int i = 0 ; i < fields.length ; i++ ) {
            System.out.println("필드명 출력 : " + fields[i].getName());
            System.out.println("패키지명 + 클래스명 출력 : " + fields[i].getType());
            System.out.println("클래스명 출력 : " + fields[i].getType().getSimpleName());
        }
        //동일한 방식으로 향상된 for문으로 작성
        for ( Field field : fields ) {
            System.out.println("필드명 출력 : " + field.getName());
            System.out.println("패키지명 + 클래스명 출력 : " + field.getType());
            System.out.println("클래스명 출력 : " + field.getType().getSimpleName());
        }

        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0 ; i < methods.length ; i++ ) {
            System.out.println("메서드 명 출력 : " + methods[i].getName());
            System.out.println("리턴 타입 출력 : " + methods[i].getReturnType() + "\n");
        }
        //새로운 객체 만들건데 주의해야하는 점
        ch16_objects.Teacher teacher3 = new ch16_objects.Teacher("안근수", "코리아아이티");

        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2); // result : false

//        System.out.println(teacher3 instanceof Teacher); // 오류 발생
        //teacher3의 자료형은 cg16_objects.Teacher 이지
        //ch16_objects.teacher.Teacher가 아님

    }
}
