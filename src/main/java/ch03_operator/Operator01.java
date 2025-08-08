package ch03_operator;
/*
Camel case -> 자바 상에서의 변수 표기법 JS
Snake case -> 자바에서 쓸 일 없음. 전체 상수 사용시에 비슷한 표기법 적용
Pascal case -> 첫 번째 문자 대문자 나머지는 소문자 두 번째 단어의 첫 번쨰 뭍자는 또 대문자
        ex) one word : Operator01
            multi word : OperatorTestResult -> Pascal case는 클래서 명명 규칙에 해당
 */

public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        // = 배우기
        i = i + 1;
        // equal의 의미는 대입 연산자 양쪽이 같다는 의미 아님
        // 오른쪽에 있는 데이터를 = 왼쪽에 있는 변수에 대입한다는 의미
        /*
        왼쪽과 오른쪽이 같은 값 ? ==
        In Javascript ===
         */

        //일반 연산자
        /*
         + 더하기
        - 빼기
        * 곱하기
        / 나누기
        % 나머지
         */
    int a = 5;
    int b = 2;
    double result = (double) a / b; //(double)은 강제 '형변환' 개념
        System.out.println(a/b); // result = 2 int가 정수이기 때문에
        System.out.println(result); // result = 2.5
        // 코딩할때 하나하나 잘 지정해야함
        // 개발자? 컴퓨터가 잘 작동할 수 있도록 잘 명령을 내리는 사람

        /*
        복합 대입 연산자
        1) +=
        2) -=
        3) *=
        4) /=
         */
        int num1 = 1;
        System.out.println(num1);
        num1 += 2; // num1 = num1 + 2; 라는 의미
        System.out.println(num1);
        num1 -= 1;
        System.out.println(num1);
        num1 *= 10;
        System.out.println(num1);
        num1 /= 5;
        System.out.println(num1);

        int j = 10;
        System.out.println(j);
        System.out.println(j++); // 변수명++ : 코드를 실행시킨 후에 j + 1 so 10
        System.out.println(j); // 위의 코드가 실행되고 +1 그래서 11
        System.out.println(++j); // ++변수명 : 코드 실행 전 +1 그래서 12
        System.out.println(j); // 위에 더한 상태로 출력된거라 위와 동ㅇ리하게 12
        System.out.println(j--); // 11
        System.out.println(j); // 11
        System.out.println(--j); // 10
        System.out.println(j); // 10
        // 변수명-- : 코드 실행 후 j-1
        // --변수명 : 코드 실행 전 j-1

        int age = 10;
        System.out.println("제 나이는 " + age + "살입니다.");
        System.out.println("내년에는 " + (age + 1) + "살이 됩니다.");
        // Operator02 생성

    }
}
