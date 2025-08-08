package ch12_arrays;
/*
    int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
    총점 : 뭐 몇점
    평균 : 뭐 몇점 ( 주의사항 : double 형변환을 적용해야함 )
 */
public class Array06 {
    public static void main(String[] args) {
        int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10 };
        int sum = 0;
        double avg = 0;
        //합 구하는 반복문
        for (int i = 0 ; i < scores.length ; i++) {
            sum += scores[i];
        }
        avg = (double)(sum / scores.length); // double로 형변환 업캐스팅 방법
        System.out.println("총점 : " + sum + "\n평균 : " + avg);
    }
}
