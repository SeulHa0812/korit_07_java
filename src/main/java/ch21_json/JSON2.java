package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;
}
public class JSON2 {
    public static void main(String[] args) {
        //사용할 객체 생성
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 하나는 한 줄로 출력
        //하나는 prettyprinting 적용

        //1. Java Object -> json
        User user1 = new User("kim1", "9876",
                "a@test.com", "김일", "20");
        String javaUser1 = gson.toJson(user1);
        System.out.println(javaUser1); //gson이라서 한 줄 출력
        String jsonUser2 = gsonBuilder.toJson(user1);
        System.out.println(jsonUser2); //gsonBuilder라서 pretty printing 적용

        //2. Map -> json
        /*
            productMap1 생성

         */
        Map<String, String> productMap1 =  new HashMap<>();
        productMap1.put("productCode", "MYWY3KH/A");
        productMap1.put("productName", "아이폰 16 프로 맥스");

        String jsonProduct1 = gson.toJson(productMap1);
        System.out.println(jsonProduct1);
        String jsonProduct2 = gsonBuilder.toJson(productMap1);
        System.out.println(jsonProduct2);

        /*
            이상의 두 사례에서 toJson()이라는 메서드는 argument로 Java Object 자체를 집어넣는 것도 가능,
            Map 으로 생성된 entry를 Json 형태로 바꾸는 것도 가능하다는 것을 확인할 수 있음.
            즉, toJson()은 overloading이 이루어졌다고 볼 수 있음.

            그리고 gson 객체에서도 toJson(0이 있고 gsonBuilder 에서도 toJson()이 있다는 점 또한 주목할 부분

            그 다음은 json -> Map / Java Object로 바꾸는 방식도 있음
            string data인 json ""포함해서 쓰는게 귗낳기 때문
            user1 -> productMap1을 json 으로 바꾼 데이터를 그대로 쓰도록 할 것

            jsonUser2 -> user2
            jsonProduct2 -> productMap2

            형식 :
            gson.fromJson(제이슨데이터, 바꾸고자하는 클래스명.class);

         */

        gson.fromJson(jsonUser2, User.class);

        Map<String, String> productMap2 = gson.fromJson(jsonProduct2, Map.class);
        /*
            gsonBuilder로 fromJson()을 적용하더라도 콘솔 상에서
            prettyPrinting은 적용되지 않음
            그 이뉴는 fromJson()이라는 메서드명세ㅓ 알 수 있듯이
            JsonData(즉 String Data)를 Map 으로 바꾸는 것.
            String의 경우에는 개행을 통해서 prettyPrinting이 적용될 수 있지만,
            Map은 toString() 메서드를 재정의 하지 않으면 default값 형태로 콘솔에 출력이 됨
            그래서 gson.fromJson()이든 gsonBuilder.fromJson(0이건 콘솔에 찍히는
            결과값은 동일하다고 할 수 있음
         */
        System.out.println(productMap2);

        /*
            특정 Java 객체와 Json String data가 있다고 가정햇을 때 서로 왔다갔다하면서 고칠 수 있음,
            Map 과 Json 데이터 역시 그럼.
         */
        Map<String, String> userMap1 = gson.fromJson(jsonUser2, Map.class);

        /*
            그렇다면 이상의 코드처럼 Java 객체로 만든 것을 -> 제이슨 데이터로 바꾼 다음에 -> 그걸 맵 형태로도 할 수 있음.
            하지만 맵의 경우 제이슨으로 바꾸는 것까지는 자유인데 걔를 Java 객체로 만들고자 한다면 클래스가 정의되어야 함.
            객체는 클래스라는 설계도를 기준으로 만들어진 거니까

            json -> jsonObject로 바꿀예정
            그 말은 json =/= jsonObject 라는 뜻

            잘 생각해보면 jsonUser1을 선언할 때 자료형을 String 으로 잡음
            근데 jsonObject의 자료형은 ? jsonObject

         */
        int a = 1;
        String b = "1"; // 다르기 때문

//        JsonObject jsonObject1 = gson.fromJson(jsonUser1, JsonObject.class);



    }
}
