package ch20_collections;
// 5 명의 학생이 있다고 가정하고 5명에게서
// "제주" "제주" "민속촌" "민속촌" "제주"
// 라는 결과값을 입력 받았을 때
/*
제주
제주
민속촌
민속촌
제주

로 출력 한 번

제주
민속촌

출력 한 번 할 수 있도록 전체 코드 작성
 */
import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? ");
        int num = scanner.nextInt();
        scanner.nextLine();

        List<String> fieldTripList = new ArrayList<>();
        for ( int i = 0 ; i < num ; i++ ) {
            System.out.print((i+1) + "번 학생의 수학 여행지를 입력하세요 >>> ");
            String place = scanner.nextLine();
            fieldTripList.add(place);
        }
        System.out.println();

        for ( int j = 0; j < fieldTripList.size() ; j++ ) {
            System.out.println((j+1) + " 번 학생의 후보지 : " + fieldTripList.get(j));
        }

        Set<String> fieldTripSet = new HashSet<>();
        fieldTripSet.addAll(fieldTripList);

        List<String> modifiedfieldList = new ArrayList<>();
        modifiedfieldList.addAll(fieldTripSet);
//        System.out.println(modifiedfieldList);
        Collections.sort(modifiedfieldList, Comparator.reverseOrder());
//        System.out.println(modifiedfieldList);
        System.out.println();

        for ( int k = 0 ; k < modifiedfieldList.size() ; k++ ) {
            if (k == 0) {
                System.out.println("수학 여행 후보지는");
            }
            System.out.println(modifiedfieldList.get(k));
            if (k == modifiedfieldList.size() - 1) {
                System.out.println("입니다."); //최적화 문제
            }
        }

    }
}
