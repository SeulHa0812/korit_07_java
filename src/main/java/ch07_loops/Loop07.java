package ch07_loops;
/* Scanner 이용 별찍기

    몇 줄의 별을 생성하시겠습니까 >>> 3
    *
    **
    ***

    and

    ***
    **
    *
 */

import java.util.Scanner;

public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        System.out.println("몇 줄의 별을 생성하시겠습니까 >>> ");
        row = scanner.nextInt();
        // 1)
//        for(int i = 0 ; i < row ; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 2)
        for(int i = 3 ; i > row ; i--) {
            for(int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //강사님 풀이
        for(int  i = 0 ; i < row ; i++) {
            for( int j = row ; j-1 > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
