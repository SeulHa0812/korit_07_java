package ch20_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        //<key datatype 하나, value datatype 하나>
        Map<String, String> strMap1 = new HashMap<>();
        // Map에 key - value 쌍(entry) 삽입 메서드 -> .put(키, 값);
        strMap1.put("kor2025001", "김일");
        strMap1.put("kor2025002", "김이");
        strMap1.put("kor2025003", "김삼");
        strMap1.put("kor2025004", "김사");
        strMap1.put("kor2025005", "김오");
        //입력한 순서대로 출력되지 않음
        System.out.println(strMap1);
        // result : {kor2025004=김사, kor2025003=김삼, kor2025005=김오, kor2025002=김이, kor2025001=김일}
        // key 하나당 value는 하나. 즉 키가 같다면 value는 가장 최근 걸로 덮어쓰기 됨.
        strMap1.put("kor2025005", "KimFive");
        System.out.println(strMap1);
        /*
            List의 경우에는 순서가 있기 때문에 기본적으로 index를 통한 조회가 가능
            하지만 Map의 경우 아까 출력결과에서 본 것처럼 순서를 보장하지 않기 때문에
            .get("키값"); 을 통해 조회 가능
         */
        System.out.println(strMap1.get("kor2025001") + " 님");

        Map<String, Double[]> koreanScores0 = new HashMap<>();
        koreanScores0.put("김일", new Double[2]); // 가능은 하나 자료구조 복잡

        Map<String, Double> koreanScores = new HashMap<>();
        koreanScores.put("김일", 98.2);
        koreanScores.put("김이", 87.2);
        koreanScores.put("김삼", 46.1);
        koreanScores.put("김사", 4.5);
        koreanScores.put("김오", 100.0);

        // 특정 key의 value 수정
        // #1. key 에는 value 하나 -> 최근걸로 덮어쓰기 됨

        //#2. .replace();
        koreanScores.replace("김오", 789.2);
        System.out.println(koreanScores);
        /*
            두 가지 방법이 있는 이유는 .put() 경우에는
            없는 key라면 key를 새로 생성해서 value를 초기화하겠지만
            있는 key라면 value에 재대입을 하게 됨.

            반면 .replace()는 없는 key라면 value 값의 갱신 x
            있는 key라면 재대입이 일어난다는 차이가 있음
         */

        // 특정 key의 존재 여부 -> containsKey(); -> boolean(return type)
        boolean searchKeyFlag1 = strMap1.containsKey("김육");
        System.out.println("김육 학생 존재 여부 : " + searchKeyFlag1);

        boolean searchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println("김삼 존재 여부 : " + searchValueFlag1);

        // Map의 엔트리로부터 Set을 생성
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 Set을 하나 만드는데, 내부에 Key가 String, Value가 String인 Map이 통째로
        // 들어간다는 것을 의미
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        // 이상의 코드는 strMap1의 key-value 쌍을 Set로 바꾸는 메서드인 .entrySet()의 호출 결과를
        // entrySet2라는 변수에 담았음을 의미
        System.out.println(strMap1); // result : {}
        System.out.println(entrySet2); // result : []
        System.out.println();

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
//        List<Map.Entry<String, String>> entryList2 = strMap1.entrySet();
        // 72번 라인 오류 = Map -> List 로의 직접 변환이 불가능
        entryList1.addAll(entrySet2);
        System.out.println(entryList1); // list로 바뀌었으니까 element 추출 가능
        //이상까지의 과정에서 Map -> Set -> List로 바꾸는 과정을 코드로 작성했는데
        // Map -> List로 바로 가는게 가능한지 여부를 따질 필요가 있음 -> 불가능

        // .sort()도 가능, 추출도 가능

        // Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);

        // Value Set 출력
//        Set<String> valueSet = strMap1.values(); //불가능 why?
        // * key 는 중복 불가능, but value는 중복 가능
        /*
            이상에서 강제 형변환을 하지 않은 상태에서 오류가 발생하는 이유는 key는 어차피 중복을 허용하지
            않기 때문에 Set으로 바꾸는 게 가능한 반면,
            복수의 key에서 동일한 value가 존재할 수 있기 때문에 직접적으로 Set으로 바꾸지 않음
         */
        Collection<String> values = strMap1.values();
        System.out.println(values);
        //Collection 자료형은 처음 씀
        //.sort()는
        //Collections 이기 때문



    }
}
