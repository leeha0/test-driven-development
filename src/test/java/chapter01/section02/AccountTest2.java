package chapter01.section02;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * 클래스 이름은 Account
 * 기능은 세 가지
 * - 잔고 조회
 *   - 10000원, 1000원, 0원으로 계좌 생성
 *   - 잔고 조회 결과 일치
 * - 입금
 * - 출금
 * 금액은 원 단위로(예: 천 원 = 1000)
 */
public class AccountTest2 {

    @Test
    public void testAccount() throws Exception {
        /**
         * 계좌를 생성한다.
         */
        Account account = new Account(10000);
    }

    @Test
    public void testGetBalance() {
        /**
         * 잔고를 조회한다.
         */
        Account account = new Account(10000);
        if (account.getBalance() != 10000) {
            fail("getBalance() => " + account.getBalance()); // JUnit에서 제공하는 메소드로, 호출 즉시 테스트 케이스가 실패한다.
        }

        account = new Account(1000);
        if (account.getBalance() != 1000) {
            fail("getBalance() => " + account.getBalance());
        }

        account = new Account(0);
        if (account.getBalance() != 0) {
            fail("getBalance() => " + account.getBalance());
        }
    }
}
