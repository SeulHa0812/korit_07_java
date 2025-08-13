package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
    private T data; //불필요한 필드 늘릴 필요 없음
}
/*
제네릭 쓸꺼라면 class에 추가적인 명령어 필요함
public class ResponseData<T>
 */
