package ex04;

// 프론트 개발자가 가짜로 만듬
public class MockMeter implements Meter {
    @Override
    public int getStep() {
        return 5;
    }
}