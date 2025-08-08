package ch07_loops;
/*
    1 2 3 4 5 6 ... 10
    11 12 13 ... 20
    1. 반복문 100번
    2. 반복문 10번
 */
public class Loop02 {
    public static void main(String[] args) {
//        int i = 1;
//        while (i < 100) {
//            System.out.print(i++ + " ");
//            if (i % 10 == 0) {
//                System.out.println();
//            }
//        }
        // 강사님 풀이
        int i = 0;
        while(i < 100) {
            System.out.print(++i + " ");
            if(i % 10 == 0) {
                System.out.println(); //아무것도 출력하지 않고 줄바꿈만 수행
            }
        }
//        int i = 1;
//        while (1 < 101) {
//            System.out.print(i + " " + (i+1) + " " + (i+2)+ " " + (i+3) + " " + (i+4) + " " + (i+5) + " " + (i+6) + " " + (i+7) + " " + (i+8)+ " " + (i+9));
//            i += 10;
//        }

    }
}