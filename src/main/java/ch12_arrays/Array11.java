package ch12_arrays;

public class Array11 {
    public static void main(String[] args) {
        String[] persons = { "김일", "김이", "김삼", "김사", "김오"};
        for (int i = 0 ; i < persons.length ; i++) {
            System.out.println((i+1) + " 번 : " + persons[i]);
        }

        System.out.println();
        int count = 0;
        for (String person : persons) {
            System.out.println(++count + "번 : " + person);
        }

    }
}
