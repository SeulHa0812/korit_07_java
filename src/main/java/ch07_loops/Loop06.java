package ch07_loops;
/* Nested for - loop
    for(시작값 ; 한계값 ; 증감값) {
        반복실행문1-a
        for(시작값 ; 한계값 ; 증감값) {
            반복실행문2
        }
        반복실행문1-b
        for(시작값 ; 한계값 ; 증감값) {
            반복실행문2
        }
        반복실행문1-c
    }
    *
    **
    ***
    ****
    고려 사항
    반복은 몇 번 이루어지는가?
    무엇을 기준으로 반복이 이루어졌다고 판단할 수 있나?
    왜 라인마다 별의 갯수가 달라지는가?
 */
public class Loop06 {
    public static void main(String[] args) {
//        for( int i = 0 ; i < 6 ; i++ ) {
//            for( int j = 0 ; j < i ; j++ ) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /* 별 찍기를 통한 for문 구조 학습
                    i = 0 . j = 0 일 때는 두 번째 for문이 작동 안하기 때문에 개행만. 별 x
                    i = 1일 때, j = 0일 때 별 하나 찍히고, i = 1일 때/ j = 1일 때 false
                    i = 2일 때, j = 0, 1일 때 별 두개
                    i = 3
                    i = 4
                    i = 5 , j = 0, 1, 2, 3, 4
         */

        /*
        *****
        ****
        ***
        **
        *
        i = 5, j = 0 -> 0 < 5, 2, 3, 2, 1 == *****
        i = 4, j = 1 -> 1 < 5, 4, 3, 2 == ****
         */
        for(int i = 5 ; i > 0 ; i--) {
            for(int j = 0 ; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //강사님 풀이
        for(int i = 0 ; i < 5 ; i++) {
            for (int j = 5 ; j - 1 > 0 ; j--) {
                System.out.println("*");
            }
            System.out.println();
        }

        // 100 ~ 1
        // 이모지 window + .
        for( int i = 100 ; i > 0 ; i--) {
            System.out.println(i);
        }
    }
}