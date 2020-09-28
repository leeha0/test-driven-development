package chapter01.section02;


/**
 * 클래스 이름은 Account
 * 기능은 세 가지
 *  - 잔고 조회
 *  - 입금
 *  - 출금
 * 금액은 원 단위로(예: 천 원 = 1000)
 */
public class AccountTest1 {

    public void testAccount() throws Exception {
        /**
         * 계좌를 생성한다.
         */
        Account account = new Account(10000);

        if (account == null) {
            throw new Exception("계좌생성 실패");
        }
    }

    // 메인 메소드를 통한 테스트 케이스 실행
    public static void main(String[] args) {
        AccountTest1 test = new AccountTest1();
        try {
            test.testAccount(); // 테스트 케이스 실행
            // TODO 리팩토링 - 테스트 케이스가 늘어날 경우 일부 테스트가 실패하면 더 이상 테스트가 진행되지 않는다.
        } catch (Exception e) {
            System.out.println("실패(X)"); // 예외가 발생하면 실패(X)
            return;
        }
        System.out.println("성공(O)");
    }
}
