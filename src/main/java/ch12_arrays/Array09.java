package ch12_arrays;
/* 함수형 프로그래밍
    객체지향형 프로그래밍
 */
import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        //(메서드를 사용할 클래스의) 객체 생성
        Array08 array08 = new Array08();
        Scanner scanner = new Scanner(System.in);

        int[] nums = {1, 2, 3, 4, 5, 6, 8, 10};
        //특정 클래스의 인스턴스에 딸려있는 메서드 호출
        int sum = array08.calcSum(nums);
        double avg = array08.calcAvg(nums);
        int randomNum = scanner.nextInt();
    }
}
