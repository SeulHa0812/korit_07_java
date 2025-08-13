package ch20_collections;

import java.util.*;

/*
    List는 순서가 있고 중복을 허용하는 반면,
    Set의 경우 순서는 없고 중복은 허용하지 않기 때문에
    List -> Set / 혹은 Set -> List 로의 형변환이 중요
    예를 들어 List로 전체 설문을 받고, Set을 통해 중복을 제거하여
    후보군만 남기는 등이 형태로 많이 사용됨.
    또한 Set 으로 중복을 제거한 후에 다시 List로 돌려서 .get(index number)로
    조회도 가능
    Set은 순서가 없어서..

    그래서 Set은 중1때 배우는 집합 개념과 유사
    다만 집합은 숫자로만 이루어졌던 반면에
    Set은 다양한 자료형을 기준으로 만들어질 수 있다는 차이가 있음.

 */
public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet = new HashSet<>(); //빨간 줄 뜨면 alt + enter
        // List 객체도 생성
        List<String> strList = new ArrayList<>();

        //List / Set에 element 추가하는 방법 동일
        //1. 리스트or셋명.add(element);
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("react");
        strList.add("react");
        strList.add("react");
        strList.add("react");
        strList.add("react");
        System.out.println(strList);

        // Set에 추가 하나만 예시
        strSet.add("TypeScript");
        // Set 출력 - toString()적용
        System.out.println(strSet);

        // List의 element 들을 전부 Set에 대입 -> 리스트명.addAll(세트명);
        strSet.addAll(strList); //SVO
        System.out.println(strList); //원래 리스트는 그대로 유지
        System.out.println(strSet); //Set에 element 들이 더해지긴 했는데,
        // 중복이 제거되어있음. 결과값 : [TypeScript, python, java, react]
        System.out.println(strSet.size());

        // 현재 상황에서 예를 들어 set 내부에 있는 각 element 들을 추출하여
        // 뒤에 " 언어" 라고 붙여서 java 언어, 와 같이 데이터를 조작하는 것이
        // 불가능하는 것을 알 수 있음.
        // 이상의 문제 등을 이유로 set -> list 로의 변환 역시 자주 쓰임
        List<String> modifiedStrList = new ArrayList<>();
        modifiedStrList.addAll(strSet); //중복 제거된 set 요소들을
        //새로운 List에 대입하는 과정
        System.out.println(modifiedStrList);
        //set의 순서와 동일하게 들어갔기 때문에 마찬가지로 순서가 보장되지 않음
        Collections.sort(modifiedStrList);
        System.out.println(modifiedStrList);

        //그럼 이제는 list니까 요소를 추출해서 뒤에 " 언어"라고 붙일 수 있음
        /*
            실행 예
            React 언어
            TypeScript 언어
            Java 언어
            python 언어

            일반 for 문 / 향상된 for 문
         */

        for ( int i = 0 ; i < modifiedStrList.size() ; i++ ) {
            System.out.println(modifiedStrList.get(i) + " 언어");
        }

        for ( String i : modifiedStrList ) {
            System.out.println(i + " 언어");
        }

    }
}
