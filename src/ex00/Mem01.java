package ex00;

/**
 * 목표 : heap, stack, static 구분 하기
 * 1. JVM은 static 키워드가 붙은 친구들을 static 메모리에 로드한다.
 * 2. JVM은 static 메모리에 main 메서드를 찾아서 실행한다.
 * 3. JVM의 생명주기는 main 메서드의 코드 줄 (Queue)
 * 4. heap 동적 메모리 할당
 * 5. 메서드 실핼시에 stack이 열린다.
 */

class Animal {
    String name = "강아지";

    void speak() {
        String sound = name + " : 멍멍";
        System.out.println(sound);
    }
}

public class Mem01 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.speak();
    }
}