package ch02_variable;
/*
 주석 : 자바 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링하는데,
    거기서 오류가 하나라도 발생하게되면 전체 프로그램 실행 안됨
    하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 코드로 인지하지 않기 때문에
    오류 발생 안함

    즉 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를
    얻을 수 있는 데에 의의가 있음

    1) 한 줄 주석 : //
    2) 다중 주석 : / + shift + 8 + enter
    3) 사후 주석 : 주석 처리할 부분의 코드 라인에 컨트롤 + /(mac : command + /)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(1);
        /*
        이상과 같은 방식의 코드 대입을(매번 데이터를 직접 사용하는 방식)\
        하트 코딩이라는 표현 사용
        하드 코딩 : 명령문에 데이터(변수에 대입되지 않은 데이터인데 리터럴(literal)를 바로 집어넣는 것으로. '지양'되는 방식

        권장 되는 방식 : 데이터를 변수에 대입하고. 변수를 통해서 명령을 내리는 방식

        변수 (variable) : 데이터를 담는 바구니 -> 이름을 달아줘야 함.
        변수 선언 방법 :
        자료형 변수명 = 데이터;

         */
        int scoreEnglish = 100; // 변수 선언 및 초기화
        System.out.println(scoreEnglish); // sout -> 출력문
        int koreanScore; // 변수 선언
        koreanScore = 99; // 초기화

        String introduction = "안녕하세요, 저는 이번 국비 과정을 맡게 된 안근수입니다";
        System.out.println(introduction + ". 앞으로 잘 부탁드립니다.");
        /* 자바에서의 변수 명명 규칙 :
             1. 카멜 표기법 사용
                : 첫 문자 소문자로 시작 / 복수의 단어로 이루어졌을 경우
                두번째 단어의 첫 번째 문자만 대문자 ex) result, myTestResult

             2. 특수문자 지양
             cf) 파이썬 변수 표기 방식은 스네이크 표기법 my_test_result
         */

        // 변수 - 값이 바뀔 수 있음.
        scoreEnglish = 90;   // 재대입할 때는 자료형 명사 x
        System.out.println(scoreEnglish);

        // 자료형 수업
        //1. 논리 자료형(boolean) 변수: true / false
        // 자료형 변수명 = 데이터(값);    변수의 선언 및 초기화
        boolean checkFlag1 = false;
        checkFlag1 = true; //재대입

        // 2. 문자 자료형 변수 char
        char name1 = '안';
        char name2 = '근';
        char name3 = '수';
        System.out.println(name1 + name2 + name3); // 결과값 : 144732
        System.out.println('안' + '근' + '수'); //결과값 : 144732

        System.out.println("" + name1 + name2 + name3); // result = 안근수

        /*
        이상의 코드에서 알 수 있는 점은 컴퓨터가 생각보다 멍청
       하나하나 지정해줘야함
       문자와 문자열은 서로 다른 개념
       문자를 세 번 더햇을 경우 더이상 문자가 아니라 문자열로 인식  > 원하는 방식으로 출력 안됌

       So, sout() 에 ""넣어주니까 원하는 값 얻을 수 있음

       즉, 작은따옴표는 '문자'를 표시하기 위한 기호
       큰따옴표는 "문자열"을 표시하기 위한 기호
       근데 파이썬이랑 자바스크립트에서는 이런 구분 없음

       그리고 sout() 내부에서 가장 먼저 나온 데이터의 자료형을 땨라간다는 점도 확인할 수 있음

       현재 개념 : 하나짜리 문자가 여러 개 모이면 문자열
       char : 문자
       String : 문자열
         */
        char name4 = '김';
        String name5 = "철수";

        System.out.println(123 + 1); // result = 124
        System.out.println("123" + 1); // result = 1231
        System.out.println(123 + "1"); // result = 1231 얘가 예외적

        // 3. 정수 자료형 변수 (int)
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2); // 숫자 변수 연산 가능
        String width3 = "300";
        String width4 = "400";
        System.out.println(width3 + width4); //result = 300400
        // 문자열은 연산 아니고 나열
        // 문자열은 순서가 중요
        Integer width5 = 500;
        Integer width6 = 600;
        System.out.println(width5 + width6); // 대문자 Integer 있음

        // 실수 자료형 변수 double
        double pi = 3.1415926;
        // int pi = 3.14; // 오류 발생
        // 정수 / 실수 자료형은 수학 연산 가능
        /*
        + 더하기
        - 빼기
        * 곱하기
        / 나누기
        % 나머지

        pi 변수를 활용하여 원의 반지름이 43인
        원의 둘레 및 넓이를 구하시오.

        둘레 지름 * pi
        넓이 반지름^2 * pi
         */
        System.out.println(86 * pi);
        System.out.println(43 * 43 * pi);

        // 문자열의 경우에는 + 연산만 가능
        String name = "안근수";
        String major = "영어교육과";
        String currentJob = "코리아 it 아카데미 국비 강사";
        String previousJob = "영어교사";
        System.out.println(name);
        System.out.println(major);
        System.out.println(currentJob);
        System.out.println(previousJob);

        System.out.println("안녕하세요, 제 이름은 " + name + "입니다. 제 전공은 " + major +"이고, 그래서 제 예전 직업은 " + previousJob + "였습니다. 현재는 " +
                currentJob + "을 가지고 있습니다.");

        // 변수 선언
        String name10;
        String major10;
        String mbti10;
        int age10;

        /* 위에 선언한 변수들에 적합한 데이터로 '초기화'하여
        '저는 코리아 it 아카데미 7월 국비과정을 수강하고 있는 누구누구입니다. ?? 살입니다. > 줄바꿈

         */
        String name100 = "하슬";
        String major100 = "MIS";
        String mbti100 = "ENTP";
        int age100 = 22;

        System.out.println("저는 코리아 IT 아카데미 7월 국비과정을 수강하고 있는 " + name100 + "입니다. " + age100 + " 살입니다.");
        System.out.println("제 전공은 " + major100 + "학과이며. " + "mbti는 " + mbti100 + "입니다. 열심히 할게요 !!!");

        //sout 한 번 써서 실행하는 방법

        // enter 키 위에 원화 표시. 원화표시 한국에서만 가능 원래는 역슬러시
        // 역슬러시 n > 개행발생
        // 역슬러시 t > 탭 친 효과



    }
}
