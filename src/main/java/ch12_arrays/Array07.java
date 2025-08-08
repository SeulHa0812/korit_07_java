package ch12_arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] scores = { 100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100 };
        // int =/= int
       int a = 0;
       int b = 0;
       int c = 0;
       int d = 0;
       int f = 0;
        for ( int i = 0 ; i < scores.length ; i++) {
            if (scores[i] > 89) {
                a ++;
            } else if (scores[i] > 79) {
                b ++;
            } else if (scores[i] > 69) {
                c ++;
            } else if (scores[i] > 59) {
                d ++;
            } else {
                f ++;
            }
        }
        System.out.println("A 학생 수 : " + a);
        System.out.println("B 학생 수 : " + b);
        System.out.println("C 학생 수 : " + c);
        System.out.println("D 학생 수 : " + d);
        System.out.println("F 학생 수 : " + f);

        // 변수 abcdf가 하나하나 int 니까
        // int[] 배열로 선언해서 변수 개수를 줄일 수 있음.
        int[] grades = {0, 0, 0, 0, 0};
        //A에 해당하는 점수라면 grade[0] 숫자를 +1, B는 grade[1] +1
        //굳이 다섯줄 써가면서 변수들을 선언할 필요가 없다.
        System.out.println();
        for ( int i = 0 ; i < scores.length ; i++) {
            if (scores[i] > 89) {
                grades[0] ++;
            } else if (scores[i] > 79) {
                grades[1] ++;
            } else if (scores[i] > 69) {
                grades[2] ++;
            } else if (scores[i] > 59) {
                grades[3] ++;
            } else {
                grades[4] ++;
            }
        }
        System.out.println("A 학생 수 : " + grades[0]);
        System.out.println("B 학생 수 : " + grades[1]);
        System.out.println("C 학생 수 : " + grades[2]);
        System.out.println("D 학생 수 : " + grades[3]);
        System.out.println("F 학생 수 : " + grades[4]);

    }
}
