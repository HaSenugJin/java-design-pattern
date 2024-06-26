package ex05.teacher;

public abstract class Teacher {
    public void 수업하기() {
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }

    public void 입장하기() {
        System.out.println("입장하기");
    }

    public void 출석부르기() {
        System.out.println("출석부르기");
    }

    // 구체적인 구현을 자식에게 재정의해서 위임할거임
    abstract void 강의하기();

    public void 퇴장하기() {
        System.out.println("퇴장하기");
    }
}
