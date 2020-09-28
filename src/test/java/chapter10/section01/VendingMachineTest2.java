package chapter10.section01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest2 {

    @Test // 거스름돈 50원
    public void testReturnChangeCoinSet_oneCoin_50() {
        ChangeModule module = new ChangeModule();
        CoinSet expectedCoinSet = new CoinSet(); // 예상하는 잔돈 세트
        expectedCoinSet.add(50);
        assertEquals("700원 투입 후 650원 음료선택", expectedCoinSet, module.getChangeCoinSet(50));
    }

    @Test // 거스름돈 180원
    public void testReturnChangeCoinSet_coins_180() {
        ChangeModule module = new ChangeModule();
        CoinSet expectedCoinSet = new CoinSet();
        expectedCoinSet.add(100);
        expectedCoinSet.add(50);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        assertEquals("700원 투입 후 520원 음료선택", expectedCoinSet, module.getChangeCoinSet(180));
    }
}
