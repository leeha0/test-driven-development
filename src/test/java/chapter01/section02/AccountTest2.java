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
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(0);
        assertEquals(0, account.getBalance());
    }
}
