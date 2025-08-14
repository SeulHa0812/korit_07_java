package ch20_collections.practice;

import java.util.*;

/*
    모임 참석자 명단 관리 프로그램 작성

    1. Set 사용해서 참석자 명단(String)을 저장
    2. 사용자로부터 참석자 이름을 계속해서 입력 받을 예정
    3. 입력 받은 이름을 Set에 추가
    4. 종료 라고 입력하면 더 이상 이름 입력받지 않음
    5. 최종 모임 참석자 명단은 콘솔에 출력

       실행 예
    --- 모임 참석자 명단 관리 ---
    [ 종료 ] 라고 입력하면 프로그램을 종료합니다.
    참석자 이름을 입력하세요 >>> 김일
    참석자 이름을 입력하세요 >>> 김이
    참석자 이름을 입력하세요 >>> 김삼
    참석자 이름을 입력하세요 >>> 종료
    프로그램이 종료되었습니다.

    --- 최종 참석자 명단 ---
    김일, 김이, 김삼
 */
public class Meeting {
    public static void main(String[] args) {
        //import scanner
        Scanner scanner = new Scanner(System.in);
        Set<String> attendees = new HashSet<>();
        List<String> meetingList = new ArrayList<>();
        System.out.println("--- 모임 참석자 명단 관리 --- ");
        System.out.println("[ 종료 ]를 입력하면 프로그램을 종료합니다.");

        //boolean 정의해서 사용 가능
        //여기서부터 횟수가 정해지지 않은 반복문을 작성
        while(true) {
            System.out.print("참석자 이름을 입력하세요 >>> ");
            String name = scanner.nextLine();
            //set 추가 전 확인
            if(name.equals("종료")) { // String 이라서 == 안됨
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
            attendees.add(name);
        }

        System.out.println("\n--- 최종 참석자 명단 ---");
        // Set to List (내부에서 뽑아내기 위해서)
        meetingList.addAll(attendees);
        // 내부의 element 들을 쉼표를 포함애서 출력해야함
        for ( int i = 0 ; i < meetingList.size() ; i++ ) {
            if (i == meetingList.size()-1) { //list의 마지막 index 넘버
                System.out.println(meetingList.get(i));
                break;
            }
            System.out.print(meetingList.get(i) + ", ");
        }


    }
}
