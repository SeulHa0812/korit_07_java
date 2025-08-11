package ch16_objects.teacher;

import java.util.Objects;

public class Teacher {
    //1. field
    private String name;
    private String school;

    //2. All
    public Teacher(String name, String school) {
        this.name = name;
        this.school = school;
    }

    //3. Getter / Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    //4.toString() 재정의
    @Override
    public String toString() {
        return name + " 선생님의 근무지는 " + school + "입니다.";
    }

    //7.

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(school, teacher.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }
}
