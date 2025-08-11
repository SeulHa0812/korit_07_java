package ch18_static;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product {
    //field
    private String name;
    //field level 에서 추가적으로 설정한 애너테이션
    @Getter
    private static int count = 0;

}
