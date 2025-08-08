package ch12_arrays;

public class Array08 {
    // 접근지정자 / return data type/ method(parameter) {구현부가 어떤식으로 이루어질지 return}
    public int calcSum(int[] intArray) {
        int sum = 0;
        for (int i = 0 ; i < intArray.length ; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public double calcAvg(int[] intArray) {
        double avg = 0;
        int sum = calcSum(intArray);
        avg = (double)sum / intArray.length;
        return avg;
        }

    public static void main(String[] args) {
        //위에 정의한 메서드를 호출하기 위해 객체 생성
        Array08 array08 = new Array08();
        int[] scores = { 100, 97, 55, 24, 49, 60, 20, 77, 89 };

        // 이상의 예시 배열을 argument로 하는 총합을 구하는 method calcSum.
        // 평균을 구하는 calcAvg method를 정의하는데, call4() 유형으로 작성

        System.out.println("총합 : " + array08.calcSum(scores) + "점");
        System.out.println("평균 : " + array08.calcAvg(scores) + "점");
    }
}
