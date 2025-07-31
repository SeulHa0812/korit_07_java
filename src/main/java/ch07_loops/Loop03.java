package ch07_loops;
/*
    중첩 while(Nested - while)
    while(조건식1) {
        반복실행문1-a
        while(조건식2) {
            반복실행문2
        }
        반복실행문1-b

 */
public class Loop03 {
    public static void main(String[] args) {
//        int day = 1;
//        //1일차 1교시입니다. ~ 1일차 3교시입니다.
//        //2일차 1교시입니다. ...
//        //5일차 1교시입니다. ~ 5일차 3교시입니다.
//        while(day < 6) {
//            int lesson = 1; //반복실행문1-a 변수의 선언 및 초기화 반복문 내부에서
//            while(lesson < 4) {
//                System.out.println(day + "일차 " + lesson + "교시입니다.");
//                lesson++;
//            }
//            day++; // 반복실행문1-b
////            System.out.println(lesson); // result 4
//            System.out.println(day); // result 2 3 4 5 6
//        }
        // scope(범위) 개념 -> 전역(전체영역) / 지역으로 나뉨

        /*
        2 * 1 = 2
        2 * 2 = 2
        ...
        9 * 9 = 81
         */
        int dan = 2;
        while(dan < 10) {
            int j = 1;
            while(j < 10) {
                System.out.println(dan + " x " + j + " = " + (dan*j)); // use () when operating in sout
                j++;
            }
            dan++;
        }
    }
}
