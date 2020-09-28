package chapter01.section02;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 클래스 이름은 Account
 * 기능은 세 가지
 * - 잔고 조회
 * - 10000원, 1000원, 0원으로 계좌 생성
 * - 잔고 조회 결과 일치
 * - 입금
 * - 10000원으로 계좌 생성
 * - 1000원 입금
 * - 잔고 11000원 확인
 * - 출금
 * - 10000원으로 계좌 생성
 * - 1000원 출금
 * - 잔고 9000원 확인
 * 금액은 원 단위로(예: 천 원 = 1000)
 */
public class AccountTest2 {
    private Account account;

    @Before
    public void setup() {
        account = new Account(10000);
    }

    @Test
    public void testAccount() throws Exception {
        /**
         * 계좌를 생성한다.
         */
        // TODO 생성자 메소드에 특별한 업무로직을 처리하지 않는다면 굳이 테스트 케이스를 작성하지 않아도 무방하다.
    }

    @Test
    public void testGetBalance() {
        /**
         * 잔고를 조회한다.
         */
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDeposit() {
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }
}
