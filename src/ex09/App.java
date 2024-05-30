package ex09;

import ex09.student.HomeworkDelegator;
import ex09.student.HomeworkType;

/**
 * 델리게이트
 * 개념 : 객체가 자신이 직접
 */
public class App {
    public static void main(String[] args) {
        HomeworkDelegator hd = new HomeworkDelegator();

        // 1. 수학
        hd.delegateHomework(HomeworkType.MATH);

        // 2. 과학
        hd.delegateHomework(HomeworkType.SCIENCE);

        // 3. 역사
        hd.delegateHomework(HomeworkType.HISTORY);
    }
}