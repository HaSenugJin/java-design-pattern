package ex08.push.pub;

import ex08.push.sub.Customer;

import java.util.ArrayList;
import java.util.List;

public class LotteMart implements Mart {

    // 구독자 명단
    private List<Customer> customerList = new ArrayList<>();

    // 구독
    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    // 구독 취소
    @Override
    public void remove(Customer customer) {
        customerList.remove(customer);
    }

    // 상품을 받음(출판)
    @Override
    public void received() {
        for (int i = 0; i < 5; i++) {
            System.out.println(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // ....
        notify("바나나");
    }

    // 알림
    @Override
    public void notify(String msg) {
        customerList.forEach(customer -> {
            customer.update(msg);
        });
    }
}