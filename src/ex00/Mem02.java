package ex00;

/**
 * 목표 : 다형성, 동적 바인딩
 * 1. 소나타(오브젝트 == 객체), 제네시스(오브젝트 == 객체) == 자동차
 */

abstract class Car { // new 못함
    abstract void run();
}

class Sonata extends Car {
    @Override // 재정의
    void run() {
        System.out.println("소나타 달린다.");
    } // sonata -> car
}

class Genesis extends Car {
    @Override // 재정의
    void run() {
        System.out.println("제네시스 달린다.");
    } // genesis -> car
}

public class Mem02 {
    public static void main(String[] args) {
        Car sonata = new Sonata(); // 메모리에 sonata랑 car가 떠있으니까 같은 이름을 쓸 수 있다. (다형성)
        // car에 run을 호출하러 갔더니, sonata가 run을 재정의 해서, car의 run이 오버라이드 되고 sonata의 run이 호출 된다. (동적 바인딩)
        sonata.run();
        Car genesis = new Genesis();
        genesis.run();
    }
}