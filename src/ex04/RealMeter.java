package ex04;

// 작업자가 진짜로 만든거
public class RealMeter implements Meter {
    @Override
    public int getStep() {
        return 100;
    }
}
