import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineTest1 {

    @Test
    public void testGetChangeAmount() {
        VendingMachine machine = new VendingMachine();
        machine.putCoin(100); // 동전 100원 투입
        assertEquals("투입금액 100원", 100, machine.getChangeAmount());

        machine.putCoin(500);
        assertEquals("추가 투입금액 500원", 600, machine.getChangeAmount());
    }

    @Test // 거스름돈 50원
    public void testReturnChangeCoinSet_oneCoin_50() {
        VendingMachine machine = new VendingMachine();
        machine.putCoin(100);
        machine.putCoin(100);
        machine.putCoin(500);
        machine.selectDrink(new Drink("Cola", 650));

        CoinSet expectedCoinSet = new CoinSet(); // 코인 컨테이너 클래스
        expectedCoinSet.add(50);
        assertEquals("700원 투입 후 650원 음료선택", expectedCoinSet, machine.getChangeCoinSet());
        // 동치 비교 실패로 인해 CoinSet 클래스의 equals, toString 재정의
    }

    @Test // 거스름돈 180원
    public void testReturnChangeCoinSet_coin_180() {
        VendingMachine machine = new VendingMachine();
        machine.putCoin(100);
        machine.putCoin(100);
        machine.putCoin(500);
        machine.selectDrink(new Drink("Soda", 520));

        CoinSet expectedCoinSet = new CoinSet();
        expectedCoinSet.add(100);
        expectedCoinSet.add(50);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        assertEquals("700원 투입 후 520원 음료선택", expectedCoinSet, machine.getChangeCoinSet());
        // 최종 코인 금액만 비교가 가능하여 500/100/50/10 순으로 코인을 추가하는 로직 추가
    }
}
