package ch06_condition;
/*
    if - else문 : if 다음에 있는 조선식이 true일 때 if문 내의 {} 실행문이 실행
                / false 인 경우에는 else 딸린 {} 실행
        형식:
        if (조건식) {
                실행문 1
         } else { else의 경우 if가 false일 때만 실행되게 때문에
         실행문2   if 에서처럼 조건식 존재x
         }
 */
public class Condition02 {
    public static void main(String[] args) {
      int num1 = 0;
      if(num1 > 0) {
          System.out.println("num1은 양수입니다.");
      } else {
          System.out.println("num1은 0이거나 음수입니다.");
      }
    }
}
