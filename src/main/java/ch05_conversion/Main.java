package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        //1. upcasting : 더 큰 용량의 자료형으로 변환

        //변수 선언 및 초기화
        // 자료형 변수명 = 값;
        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        // 업캐스팅 방법 #1
        // 형 변환을 하기 위해서 '(바꿀데이터타입) 변수명' 으로 작성
        System.out.println("변형 : " + (int)cast1); // A -> int == 65 ( on test )

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " + (int)cast2); // a == 97

        // 업캐스팅 방법 #2
        // 새로운 변수를 선언하여 캐스팅이 이루어진 데이터를 집어넣는 방법
        char cast3 = 'b';
        int casted3 = cast3; //변환되기 원하는 자료형으로 명시
        System.out.println("원형 : " + cast3);
        System.out.println("변형 : " + casted3);

        // downcasting : 용량이 더 적은 자료형으로 변형
        int cast4 = 99; // #1
        int cast5 = 100; // #2

        System.out.println("원형 : " + cast4);
        System.out.println("변형 : " + (char)cast4);

        System.out.println("원형 : " + cast5);
//        char casted5 = cast5;
        /* when upcasting, 메모리 용량 커지면 되니까 기존 데이터 변형 일어날 가능 없어서 암시적으로 번경 가능,
            다운 캐스팅, 데이터 용량 축소되는 과정에서 변수가 메모리 용량을 벗어나게 되는 경우
            다운캐스팅 시에는 명시적(explicit)으로만 변형 가능

            -> 현재는 기본 자료형을 기준으로 예시를 들엇지만 나중에는 참조자료형 캐스팅 개녕과 연결
            upper first word -> 참조 자료형 lower -> 기본 자료형
         */
        char casted5 = (char)cast5;
        System.out.println("변형 : " + casted5);

        /*
        int 21억 정도 범위 더 큰 숫자 표기 -> long (정수 기준)
        -> SQL 문에서는 long이 아니라 bigint
         */







    }
}
