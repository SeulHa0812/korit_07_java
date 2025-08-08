package ch12_arrays;
/*

 */
public class Array05 {
    public void scores(String[] strArray) {
        for (int i = 0 ; i < strArray.length ; i++) {
            if (i != strArray.length-1) {
                System.out.print(strArray[i] + "+ ");
            } else {
                System.out.print(strArray[i]);
            }

            // 강사님 ver.
            // for(int i = 0 ; i < scores.length-1 ; i++) {
            // sout(scores[i] + "+ ");
            // }
            // sout(scores[scores.length-1]);
        }
    }


    public static void main(String[] args) {
        Array05 array05 = new Array05();
        String[] score = {"A", "B", "C", "D", "F"};
        array05.scores(score);
    }
}
