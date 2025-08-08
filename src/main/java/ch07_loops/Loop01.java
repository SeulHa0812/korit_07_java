package ch07_loops;
/* while 반복문
    형식 :
    while(조건식) {
        반복실행문
    }
    while 뒤에 나오는 (조건식)을 봤을 때  if(조건식) 형태와 유사
    즉. while() 내의 조건식이 true일 때 {} 내의 실행문이
    반복적으로 이루어짐

    주의할 점
    while 내부의 조건식이 특정 시점에 false가 되도록 미리 설계 해둘 필요 있음
    if not, 반복문 무한히 실행 (무한 루프)
 */
public class Loop01 {
    public static void main(String[] args) {
//        // 1부터 100까지 출력하는 예
        int i = 1;
        while (i < 101) {
            System.out.println(i);
            ++i;
//                    // 특정 시점에 조건이 false가 되도록 지정
//        System.out.println("최종 i의 결과값 : " + i);
//        }
//
//        int j = 0;
//        while(j < 100) { //100미만이라고 했는데 100까지 뜸
//            System.out.println(++j); // 99 입력 후 출력할 때 100이 되었기 때문
//        }

        //그래서 1부터 100까지의 합을 구하는 방식
//        int num1 = 1;
//        int sum = 0;
//        while (num1 < 101) {
//            sum += num1;
//            num1++;
//        }
//        System.out.println("최종 합계 : " + sum);

//        //강사님 풀이
//        while (num1 < 101) {
//            sum += num1++;
//        }
//        System.out.println("최종 합계 : " + sum);

//            int sum = (100 * 101) / 2;
//        System.out.println("등차수열의 합계 공식 이용 : " + sum);
        /*
            1부터 1씩 증가하는 합 공식은 while 쓰는 것 자체가 비효울적

            하지만 while 자체는 자바 문법. if와 동일하게 중첩적으로 사용 가능
            while 내부에 if 들어가는 등 응용도 가능

            예를 들어 공차가 2고 a1이 0인 수열의 a50까지의 합을 구하시오
            46라인 적용 불가능
            공차가 2이기 때문
         */
//        int j = 0;
//        int sum2 = 0;
//        //정석 버전
////        while (j < 101) {
////            if (j % 2 == 0) {
////                sum2 += j;
////            }
////            j++;
////        }
//        while(j < 101) {
//            sum2 += j;
//            j+=2;
//        }
//        System.out.println(sum2); //짝수 합



        /*
        1부터 100까지
        1 2 3  ... 100
         */
//        int k = 1;
//        while (k < 101);
//        System.out.print(k++ + " ");

        //강사님 VER. (0으로 시작하는 것을 선호)
//        int k = 0;
//        while(k < 100) {
//            System.out.print(++k + " ");
        }

    }
}
