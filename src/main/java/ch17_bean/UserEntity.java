package ch17_bean;

import lombok.Getter;
/*
 정보를 담는 객체를 Entity class 라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |    -> 컬럼명 / Header
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+
 */
// @Entity -> 이건 springboot 설치시에 사용됨
@Getter
public class UserEntity {
    // field
    private int username;
    private int password;
    private String email;
    private String name;

    // 기본 생성자
    public UserEntity() {
    }
    // Setter
    public void setUsername(int username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    // toString()
    @Override
    public String toString() {
        return "username : " + username +
                "\nemail : " + email +
                "\nname : " + name +
                "\n비밀번호는 보안 상 제공하지 않습니다.";
    }


}
