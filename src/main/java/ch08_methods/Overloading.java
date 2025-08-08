package ch08_methods;
/*
    method overloading
        매개변수의 유무 및 자료형의 차이, 개수의 차이를 나눠서
        동일한 메서드 명을 지닌 메서드들을 정의할 수 있다.

        메서드 명 동일, 매개변수에 들어가는 자료형, 갯수를 달리하게 되면 서로 다른 메서드로 받아들임.

        장점 :
            동일한 기능을 하는 메서드를 정의할 때 메서드 명이 필요,
            예를 들어 String 자료형끼리 연결해주는 메서드와
            int 끼리의 합 연산을 하는 메서드를 나눈다고 가정했을 때,
            add,
            plus,
            connect 등의 메서드를 정의했다면
            다음 합 연산을 하는(예를 들어 double 자료형을 지니는) 메서드 명을 정하는 것이 번거로움.
            -> 해결
            public void add(String example1. String example2) {
            로직
            }
            public void add(int example1, int example2) {
            로직
            }
            public void add(String example1. String example2. String example3) {
            로직
            }


 */
public class Overloading {
    //메서드 정의 영역
    public static void add() {
        System.out.println("add()");
    }
    //overloading 적용 call#2-1
    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s + "!");
    }
    // call#2-2
    public static void add(int a, int b) {
        System.out.println("add(int a, int b)"); //사실 얘랑
        System.out.println(a + b);              // 얘는 overloading의 결과물
    }

    public static void add(int a, String s) {
        System.out.println("add(int a, String s)");
        System.out.println(a + " / " + s);
    }

    public static void add(String s, int a ) {
        System.out.println("add(String s, int a)");
        System.out.println(a + " / " + s);
    }

    public static void add(int a, int b, double c) {
        System.out.println("add(int a, int b, int c)");
        System.out.println("a + b + c = " + (a + b + c));
    }

    public static void main(String[] args) {
        //메서드 호출 영역
        add();
        add("안녕하세요!"); //argument 입력해야해서 괄호 안에서 마우스커서 깜빡임.
        add(1, 2);
        add(1, 2, 4.5);
    }
}