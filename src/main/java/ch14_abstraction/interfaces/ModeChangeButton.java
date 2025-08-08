package ch14_abstraction.interfaces;

public class ModeChangeButton extends Button {
    private boolean status;

    @Override
    public void onPressed() {
        if (status) {
            status = false;
            System.out.println("냉방으로 바뀝니다.");
        } else {
            status = true;
            System.out.println("난방으로 바뀝니다.");
        } // default value = true이기 때문에 처음에 실행하면 true로 나옴

    }
}
